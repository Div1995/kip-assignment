
package com.knoldus.app

import akka.actor.{ActorSystem, Props}
import akka.testkit.{ImplicitSender, TestKit}
import com.knoldus.actor.WorkerAction
import org.scalatest.{BeforeAndAfterAll, WordSpecLike}

class TwitterStreamAppSpec extends TestKit(ActorSystem("TwitterStreamAppSpec")) with ImplicitSender with WordSpecLike with BeforeAndAfterAll{

  "A Worker actor" must {
    val testActor = system.actorOf(Props[WorkerAction])

    "prints message as a count of messages received so far by sending to worker Actor." in {
      testActor ! Tweet("277c2a05-a9df-464d-bf81-68e813e5b62f", -543279, 8815, "ਸ਼䕧붝뚖校쎝黽⪀揵萑", "India", 1579)
      expectMsg("1")
    }

    "return invalid message tweet when no tweet is there." in {

      testActor ! ""
      expectMsg("received unknown message")
    }
  }
}
