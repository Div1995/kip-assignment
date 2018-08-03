
package com.knoldus.actor

import akka.actor.{ActorSystem, PoisonPill}
import akka.dispatch.{PriorityGenerator, UnboundedStablePriorityMailbox}
import com.knoldus.app.Tweet
import com.typesafe.config.Config


class PriorityMailBox(settings: ActorSystem.Settings, config: Config)
  extends UnboundedStablePriorityMailbox(
    // Create a new PriorityGenerator, lower prio means more important
    PriorityGenerator {
      // 'highpriority messages should be treated first if possible
      case tweet: Tweet if tweet.friendsCount >= 500 ⇒ 0
      case tweet: Tweet if tweet.friendsCount < 500 ⇒ 1
      case PoisonPill    ⇒ 2
    }
  )
