package com.knoldus

import org.scalatest.{FunSuite, Matchers}

class ExtractorForParsingSpec extends FunSuite with Matchers {

  val testUrl = new ExtractorForParsing

  test("Passing the valid url") {
    val actualResult = testUrl.URL.unapply("https://aws.amazon.com/console/home?state=hash&isauthcode=true&code=112")
    val expectedResult = Some("https", "aws.amazon.com", "console/home", Map("state" -> "hash", "isauthcode" -> "true", "code" -> "112"))
    actualResult should equal(expectedResult)
  }

  test("Passing the values for making a Url") {
    val actualResult = testUrl.URL.apply("https", "aws.amazon.com", "/console/home", Map("state" -> "hash", "isauthcode" -> "true", "code" -> "112"))
    val expectedResult = "https://aws.amazon.com/console/home?state=hash&isauthcode=true&code=112"
    actualResult should equal(expectedResult)
  }

  test("leaving the making Url parameters") {
    assertThrows[Exception](testUrl.URL.apply("https", "" , "/console/home", Map("state" -> "hash", "isauthcode" -> "true", "code" -> "112")))
  }

  test("Passing unapply method with empty URL") {
    assertThrows[Exception](testUrl.URL.unapply(""))
  }

}
