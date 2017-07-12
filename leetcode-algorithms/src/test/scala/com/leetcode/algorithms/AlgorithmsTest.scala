package com.leetcode.algorithms

import com.leetcode.algorithms.scalamodel._
import org.testng.annotations.Test
import org.testng.Assert._

class AlgorithmsTest {
  @Test
  def testAddTwoNumbers(): Unit = {
    val l1 = new ListNode(2)
    l1.next = new ListNode(4)
    l1.next.next = new ListNode(3)
    val l2 = new ListNode(5)
    l2.next = new ListNode(6)
    l2.next.next = new ListNode(4)
    AddTwoNumbers.addTwoNumbers(l1, l2)

    val l3 = new ListNode(9)
    l3.next = new ListNode(9)
    l3.next.next = new ListNode(9)
    val l4 = new ListNode(1)
    AddTwoNumbers.addTwoNumbers(l3, l4)
  }

  @Test
  def testAddBinary(): Unit = {
    assertEquals(AddBinary.addBinary("11", "1"), "100")
    assertEquals(AddBinary.addBinary("1000000000000000000000000000000", "1"), "1000000000000000000000000000001")
  }

  @Test
  def testWordPattern(): Unit = {
    assertEquals(WordPattern.wordPattern("abba", "dog cat cat dog"), true)
    assertEquals(WordPattern.wordPattern("abba", "dog cat cat fish"), false)
    assertEquals(WordPattern.wordPattern("aaaa", "dog cat cat dog"), false)
    assertEquals(WordPattern.wordPattern("abba", "dog dog dog dog"), false)
    assertEquals(WordPattern.wordPattern("aaa", "aaa aa aa aa aa"), false)
  }

  @Test
  def testIntegerReplacement(): Unit = {
    assertEquals(IntegerReplacement.integerReplacement(8), 3)
    assertEquals(IntegerReplacement.integerReplacement(7), 4)
    assertEquals(IntegerReplacement.integerReplacement(1), 0)
  }

  @Test
  def testNumberOfBoomerangs(): Unit = {
    assertEquals(NumberOfBoomerangs.numberOfBoomerangs(Array(Array(0, 0), Array(1, 0), Array(2, 0))), 2)
  }
}
