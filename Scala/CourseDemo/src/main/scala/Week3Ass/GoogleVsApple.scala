package Week3Ass

object GoogleVsApple {
  val google = List("android", "Android", "galaxy", "Galaxy", "nexus", "Nexus")
  val apple = List("ios", "iOS", "iphone", "iPhone", "ipad", "iPad")

  lazy val googleTweets: TweetSet = TweetReader.allTweets.filter((t: Tweet) => google.exists((s:String) => t.text.contains(s)))
  lazy val appleTweets: TweetSet = TweetReader.allTweets.filter((t: Tweet) => apple.exists((s:String) => t.text.contains(s)))

  lazy val allTweets: TweetSet = TweetReader.allTweets
  /**
    * A list of all tweets mentioning a keyword from either apple or google,
    * sorted by the number of retweets.
    */

  lazy val trending: TweetList = (googleTweets union appleTweets).descendingByRetweet
}