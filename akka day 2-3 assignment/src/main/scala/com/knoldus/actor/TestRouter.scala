
package com.knoldus.actor

import akka.actor.{Actor, Props, Terminated}
import akka.routing.{ActorRefRoutee, RoundRobinRoutingLogic, Router}
import com.knoldus.app.Tweet

class TestRouter extends Actor{
    var  router = {
      val routees = Vector.fill(5) {
        val routeeActor = context.actorOf(Props[WorkerAction].withDispatcher("prio-dispatcher"))
        context watch routeeActor
        ActorRefRoutee(routeeActor)
      }
      Router(RoundRobinRoutingLogic(), routees)
    }

    def receive: Receive = {

      case buffer: List[Tweet]=>
        for(i<-buffer) {
          router.route(i, sender())
        }
      case Terminated(a) =>
        router = router.removeRoutee(a)
        val routeeActor = context.actorOf(Props[WorkerAction])
        context watch routeeActor
        router = router.addRoutee(routeeActor)
    }

  }




