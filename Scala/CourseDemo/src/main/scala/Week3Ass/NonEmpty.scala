package Week3Ass

class NonEmpty(elem: Tweet, left: TweetSet, right: TweetSet) extends TweetSet {

  def isEmpty: Boolean = false

  def filterAcc(p: Tweet => Boolean, acc: TweetSet): TweetSet = {
    val leftAndRight = left.filterAcc(p,acc) union right.filterAcc(p, acc)
    if(p(elem)) acc union leftAndRight incl elem
    else	acc union leftAndRight
  }

  //def descendingByRetweet: TweetList = throw new NoSuchElementException("Empty List")
   /**
    * The following methods are already implemented
    */

  def contains(x: Tweet): Boolean =
    if (x.text < elem.text) left.contains(x)
    else if (elem.text < x.text) right.contains(x)
    else true

  def incl(x: Tweet): TweetSet = {
    if (x.text < elem.text) new NonEmpty(elem, left.incl(x), right)
    else if (elem.text < x.text) new NonEmpty(elem, left, right.incl(x))
    else this
  }

  override def union(that : TweetSet) : TweetSet = {
    ((left union right) union that ) incl elem
  }

  override def mostRetweeted: Tweet = {
    val lefttree = if (!left.isEmpty) left.mostRetweeted else elem
    val righttree = if (!right.isEmpty) right.mostRetweeted else elem

    if (elem.retweets >= lefttree.retweets && elem.retweets >= righttree.retweets) elem
    else if (lefttree.retweets > righttree.retweets) lefttree
    else righttree
  }

  override def descendingByRetweet: TweetList = {
    new Cons(mostRetweeted, this.remove(mostRetweeted).descendingByRetweet)
  }

  def remove(tw: Tweet): TweetSet =
    if (tw.text < elem.text) new NonEmpty(elem, left.remove(tw), right)
    else if (elem.text < tw.text) new NonEmpty(elem, left, right.remove(tw))
    else left.union(right)

  def foreach(f: Tweet => Unit): Unit = {
    f(elem)
    left.foreach(f)
    right.foreach(f)
  }
}