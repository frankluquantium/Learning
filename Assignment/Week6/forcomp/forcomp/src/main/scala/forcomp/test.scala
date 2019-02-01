package forcomp
package common

import forcomp.Anagrams.{Word, _}

import scala.collection.SortedMap

object test extends App{
  override def main(args: Array[String]): Unit = {
    type Word = String

    /** A sentence is a `List` of words. */
    type Sentence = List[Word]

    def wordOccurrences(w: Word): Occurrences = {
      val wordlist = (w.toLowerCase groupBy identity) map {case (c,cs) => (c,cs.length)}
      (SortedMap[Char,Int]() ++ wordlist) toList
    }

    val dictionary: List[Word] = loadDictionary
    println(dictionary)

    //val dictionaryPath = List("forcomp", "linuxwords.txt")
    //println(dictionaryPath)
   }

}
