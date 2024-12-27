This project implements a trie data structure to efficiently 
find the longest matching prefix for a given input string. 
It reads prefixes from a configuration file located in the resources folder.


Features
Implements a Trie for efficient prefix matching.
Reads prefixes from a configuration file (.txt) in the resources folder.
Finds the longest matching prefix for a given input string.

Usage
Place your prefix list in a file named sample_prefixes.txt in the resources folder. Each line in the file should contain a single prefix.
Run the application using the boot object:

Example:
$ sbt run
Longest matching prefix for 'g4hxTrUjCxxxxx': g4hx