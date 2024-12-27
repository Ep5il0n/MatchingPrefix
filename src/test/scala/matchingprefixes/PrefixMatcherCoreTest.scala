package matchingprefixes

import org.scalatest.funsuite.AnyFunSuite

class PrefixMatcherCoreTest extends AnyFunSuite {

  val sampleFile = "sample_prefixes_for_test.txt"
  PrefixMatcher.initializePrefixesFromFile(sampleFile)
  test("initializePrefixesFromFile should correctly initialize prefixes") {

    assert(PrefixMatcher.getLongestMatchingPrefix("tg64NOhibxxx") == "tg64NOhib")
    assert(PrefixMatcher.getLongestMatchingPrefix("2y3fKTa33234") == "2y3fKTa")
    assert(PrefixMatcher.getLongestMatchingPrefix("P0HSoR4Ngqdfddf") == "P0HSoR4Ng")
  }

  test("getLongestMatchingPrefix should return the correct longest matching prefix") {
  //  PrefixMatcher.initializePrefixesFromFile(sampleFile)

    // Check with various inputs
    assert(PrefixMatcher.getLongestMatchingPrefix("1hI7vtH5454545") == "1hI7vtH")
    assert(PrefixMatcher.getLongestMatchingPrefix("KT5ndlsBox") == "KT5ndlsBox")
    assert(PrefixMatcher.getLongestMatchingPrefix("dEWTCAGrLLL") == "dEWTCAGrLL")
  }

  test("initializePrefixesFromFile should throw IllegalArgumentException if file not found") {
    val thrown = intercept[IllegalArgumentException] {
      PrefixMatcher.initializePrefixesFromFile("non_existent_file.txt")
    }
    assert(thrown.getMessage.contains("File non_existent_file.txt not found in resources"))
  }

//  test("getLongestMatchingPrefix should return empty string when input is empty") {
//    PrefixMatcher.initializePrefixesFromFile(sampleFile)
//    assert(PrefixMatcher.getLongestMatchingPrefix("") == "")
//  }

//  test("getLongestMatchingPrefix should return empty string when no prefix matches") {
//    PrefixMatcher.initializePrefixesFromFile(sampleFile)
//    assert(PrefixMatcher.getLongestMatchingPrefix("xyz") == "")
//  }

//  test("getLongestMatchingPrefix should work with special character prefixes") {
//    assert(PrefixMatcher.getLongestMatchingPrefix("foo!bar") == "foo!")
//    assert(PrefixMatcher.getLongestMatchingPrefix("bar#baz") == "bar#")
//  }
//
//  test("getLongestMatchingPrefix should work with single character prefixes") {
//    assert(PrefixMatcher.getLongestMatchingPrefix("apple") == "a")
//    assert(PrefixMatcher.getLongestMatchingPrefix("banana") == "b")
//  }

  // TODO: Add a test for compute time
//  test("getLongestMatchingPrefix should complete in under 2 seconds") {
//    PrefixMatcher.initializePrefixesFromFile(sampleFile)
//
//    val startTime = System.nanoTime()
//
//    val input = "0DlJwT1zAwewew"
//    val result = PrefixMatcher.getLongestMatchingPrefix(input)
//
//    val endTime = System.nanoTime()
//    val durationInSeconds = (endTime - startTime) / 1e9d // Convert nanoseconds to seconds
//
//    // Assert that the duration is less than 2 seconds
//    assert(durationInSeconds < 2, s"Execution took $durationInSeconds seconds, which is longer than 2 seconds")
//  }
}
