package com.example

import akka.actor.ActorSystem

object ApplicationMain extends App {
  val system = ActorSystem("Scala-Ontapi")
  system.awaitTermination()
}