package matchingprefixes

import scala.io.Source
import java.io.IOException

object PrefixMatcher {
  private val trie = new Trie()

  def initializePrefixesFromFile(filename: String): Unit = {
    println("aichi")
    val resourceStream = getClass.getClassLoader.getResourceAsStream(filename)
    if (resourceStream == null) {
      throw new IllegalArgumentException(s"File $filename not found in resources")
    }

    var source: Source = null
    try {
      source = Source.fromInputStream(resourceStream)
      val prefixes = source.getLines().toList
      prefixes.foreach(trie.insert)
    } catch {
      case e: IOException =>
        println(s"Error reading file: ${e.getMessage}")
      case e: Exception =>
        println(s"An error occurred: ${e.getMessage}")
    } finally {
      if (source != null) {
        source.close()
      }
    }
  }

  def getLongestMatchingPrefix(input: String): String = {
    trie.getLongestMatchingPrefix(input)
  }
}