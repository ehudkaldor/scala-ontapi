package org.krazykat.ontapi

import akka.actor.ActorSystem

object ApplicationMain extends App {
  val system = ActorSystem("Scala-Ontapi")
  system.awaitTermination()
}