
package com.knoldus.actor

import akka.actor.Actor
import akka.event.Logging
import com.knoldus.app.Tweet

class WorkerAction extends Actor {
  var counter = 0
  val log = Logging(context.system, this)

  def receive: Receive = {
    case tweet: Tweet ⇒ {
      counter += 1
      log.info(s"$counter")
      sender() ! s"$counter"
      //log.info(s"${tweet.tweetId} ${tweet.createdAt} ${tweet.userId} ${tweet.tweetUserName} ${tweet.countryName} ${tweet.friendsCount}")
    }
    case _ ⇒ log.info("received unknown message")
      sender() ! "received unknown message"
  }
}

