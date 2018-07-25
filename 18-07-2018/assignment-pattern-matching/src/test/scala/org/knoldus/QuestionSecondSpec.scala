package org.knoldus

import org.scalatest.{FunSuite, Matchers}

class QuestionSecondSpec extends FunSuite with Matchers{

  val testQuestionSecond = new QuestionSecond

  test("Running the code for Int") {
    val actualResult = testQuestionSecond.patternMatching(2)
    val expectedResult = "thanks for the Int:2"
    actualResult should  equal(expectedResult)
  }

  test("Running the code for Float") {
    val actualResult = testQuestionSecond.patternMatching(2.0f)
    val expectedResult = "you gave me this Float:2.0"
    actualResult should  equal(expectedResult)
  }

  test("Running the code for String") {
    val actualResult = testQuestionSecond.patternMatching("hi")
    val expectedResult = "you gave me this string:hi"
    actualResult should  equal(expectedResult)
  }

  test("Running the code for Array of Integers") {
    val actualResult = testQuestionSecond.patternMatching(Array(1,2,3,4))
    val expectedResult = "you gave me this Array of Integers"
    actualResult should  equal(expectedResult)
  }

  test("Running the code for Array of String") {
    val actualResult = testQuestionSecond.patternMatching(Array("hi","this","is","me"))
    val expectedResult = "you gave me this Array of Strings"
    actualResult should  equal(expectedResult)
  }
      test("Running the code for List") {
      val actualResult = testQuestionSecond.patternMatching(List(1,2,3,4))
      val expectedResult = "you gave me this List"
      actualResult should  equal(expectedResult)
      }

      test("Running the code for Map") {
      val actualResult = testQuestionSecond.patternMatching(Map(1 -> 'a',2->'b',3->'c',4->'c'))
      val expectedResult = "you gave me this map"
      actualResult should  equal(expectedResult)
      }

      test("Running the code for case class") {
      val actualResult = testQuestionSecond.patternMatching(Pet("lebra"))
      val expectedResult = "you gave me the case class pet"
      actualResult should  equal(expectedResult)
      }

      test("Running the code out of scope") {
      val actualResult = testQuestionSecond.patternMatching()
      val expectedResult = "Not recognized"
      actualResult should  equal(expectedResult)
        }

      }





