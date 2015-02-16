package org.krazykat.ontapi.models.naServer

import org.specs2.mutable.Specification
import java.net.InetAddress
import org.specs2.matcher.BeEqualTo

class NaServerSpec extends Specification{
  val filer = Filer(InetAddress.getByName("10.30.0.1"))
  val userCred = UserCredentials("admin", "admin")
  val naServer = NaServer(filer, userCred)
  
  "NaServer with no ONTAPI version" should {
    "have major version as 1" in {
      naServer.ontapiVersionOpt must not be None
      naServer.ontapiVersionOpt.get.major must beEqualTo(1)
    }

    "have minor version as 0" in {
      naServer.ontapiVersionOpt must not be None
      naServer.ontapiVersionOpt.get.minor must beEqualTo(0)
    }

    "have isClustered as false" in {
      naServer.ontapiVersionOpt must not be None
      naServer.ontapiVersionOpt.get.isClusered must beEqualTo(false)
    }
  }
}