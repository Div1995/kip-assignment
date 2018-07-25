package org.knoldus

import org.scalatest.{FunSuite, Matchers}

class QuestionFirstSpec extends FunSuite with Matchers{

  val testQuestionOne = new QuestionFirst

  test("Finding maximum element in positive element list") {
    val actualResult = testQuestionOne.max(List(1, 2, 12, 231, 13, 56, 0))
    val expectedResult = 231
    actualResult should  equal(expectedResult)
  }
  test("Finding maximum element in negative element list") {
    val actualResult = testQuestionOne.max(List(-16, -2, -5, -7, -34))
    val expectedResult = -2
    actualResult should equal(expectedResult)
  }
  test("Finding maximum element in positive and negative element list") {
    val actualResult = testQuestionOne.max(List(-16,1,78,-5,-8,0,99))
    val expectedResult = 99
    actualResult should equal(expectedResult)
  }
  test("Finding minimum element in positive and negative element list") {
    val actualResult = testQuestionOne.min(List(-5, -20, 0, 56, -4, 1, 2, 12, 23, 33, 16))
    val expectedResult = -20
    actualResult should equal(expectedResult)
  }
  test("Finding minimum element in positive element list") {
    val actualResult = testQuestionOne.min(List(10, 20, 9, 7, 12, 36))
    val expectedResult = 7
    actualResult should equal(expectedResult)
  }
  test("Finding length of List with integers") {
    val actualResult = testQuestionOne.length(List(1,2,3,4,5))
    val expectedResult = 5
    actualResult should equal(expectedResult)
  }
  test("Finding length of List with string") {
    val actualResult = testQuestionOne.length(List("bus","train","plane","cycle","bike"))
    val expectedResult = 5
    actualResult should equal(expectedResult)
  }
  test("Finding length of Empty String ") {
    val actualResult = testQuestionOne.length(List())
    val expectedResult = 0
    actualResult should equal(expectedResult)
  }
  test("Finding 2th element from last") {
    val actualResult = testQuestionOne.elementFromLast(List(1,2,3,4,5,6,-5,-12,0),2)
    val expectedResult = -12
    actualResult should equal(expectedResult)
  }
  test("Finding 5th element from last") {
    val actualResult = testQuestionOne.elementFromLast(List(36,17,38,19,20,5,8),5)
    val expectedResult = 38
    actualResult should equal(expectedResult)
  }
}

