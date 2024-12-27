package matchingprefixes

object boot extends App {
  val PREFIXES_FILE = "sample_prefixes.txt"
  // Initialize prefixes from the sample_prefixes.txt file
  PrefixMatcher.initializePrefixesFromFile(PREFIXES_FILE)
  //  Test with an input string
  val input = "g4hxTrUjCxxxxx"
  val result = PrefixMatcher.getLongestMatchingPrefix(input)
  println(s"Longest matching prefix for '$input': is $result")
}
