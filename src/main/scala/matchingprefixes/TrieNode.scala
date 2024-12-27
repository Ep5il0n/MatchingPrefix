package matchingprefixes

import scala.collection.mutable

class TrieNode {
  var children: mutable.Map[Char, TrieNode] = mutable.Map.empty
  var isEndOfWord: Boolean = false
}
