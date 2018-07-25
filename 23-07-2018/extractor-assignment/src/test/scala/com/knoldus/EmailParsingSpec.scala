package com.knoldus

import org.scalatest.{FunSuite, Matchers}

class EmailParsingSpec extends FunSuite with Matchers {

  val testUrl = new EmailParsing

  test("When correct Url is Passed"){
    val actualResult = testUrl.regexEmailParsing("knol@knoldus.com")
    val expectedResult = Some(("knol","knoldus.com"))
    actualResult should equal(expectedResult)
  }

  test("Passing incorrect input") {
    val actualResult = testUrl.regexEmailParsing("123$knoldr.in")
    val expectedResult = None
    actualResult should equal(expectedResult)
  }
}
