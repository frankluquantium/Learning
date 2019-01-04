package Week3Ass

class Empty extends TweetSet {

  def isEmpty: Boolean = true

  def filterAcc(p: Tweet => Boolean, acc: TweetSet): TweetSet = new Empty

  def union(that: TweetSet): TweetSet = new Empty
  /**
    * The following methods are already implemented
    */

  def mostRetweeted: Tweet = throw new NoSuchElementException("Empty List")

  def contains(tweet: Tweet): Boolean = false

  def incl(tweet: Tweet): TweetSet = new NonEmpty(tweet, new Empty, new Empty)

  def remove(tweet: Tweet): TweetSet = this

  def foreach(f: Tweet => Unit): Unit = ()

  def descendingByRetweet: TweetList = throw new NoSuchElementException("Empty List")
}