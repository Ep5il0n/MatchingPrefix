package matchingprefixes

class Trie {
  private val root = new TrieNode

  def insert(prefix: String): Unit = {
    var currentNode = root
    for(char <- prefix) {
      if(!currentNode.children.contains(char)) {
        currentNode.children += (char -> new TrieNode) // adding a new child node, char as key and TrieNode as value
      }
      currentNode = currentNode.children(char)
    }
    currentNode.isEndOfWord = true
  }

  // Find the longest prefix that match the input string
  def getLongestMatchingPrefix(input: String): String = {
    var currentNode = root
    var longestPrefix = ""
    var currentPrefix = ""

    for(char <- input) {
      if(currentNode.children.contains(char)) {
        currentPrefix += char
        currentNode = currentNode.children(char)
        if(currentNode.isEndOfWord) {
          longestPrefix = currentPrefix
        }
      } else {
        return longestPrefix
      }
    }
    longestPrefix
  }
}
