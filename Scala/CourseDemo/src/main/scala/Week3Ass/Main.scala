package Week3Ass

object Main extends App {
  // Print the trending tweets
  GoogleVsApple.allTweets foreach println

  //val gizmodoTweets = TweetReader.ParseTweets.getTweetData("gizmodo", TweetData.gizmodo)
  //gizmodoTweets foreach println
  //GoogleVsApple.trending foreach println
}
