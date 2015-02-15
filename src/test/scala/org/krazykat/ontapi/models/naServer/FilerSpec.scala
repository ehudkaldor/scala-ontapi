package org.krazykat.ontapi.models.naServer

import org.specs2.mutable.Specification
import java.net.InetAddress

class FilerSpec extends Specification{
  val filer = Filer(InetAddress.getLocalHost)
  val filerHttp = Filer(InetAddress.getByName("10.30.0.1"), isHttps = false, port = 333)

  "Filer with default setting and localhost address" should {
    "have an address of 127.0.1.1" in {
      filer.address.getHostAddress must equalTo("127.0.1.1")
    }
    
    "default isHttps set to true" in {
      filer.isHttps must equalTo(true)
    }
    
    "default port should be the default ssl (443)" in {
      filer.port must equalTo(443)
    }
  }
  
  "Filer with no HTTPS, port 333 and address 10.30.0.1" should {
    "have an address of 10.30.0.1" in {
      filerHttp.address.getHostAddress must equalTo("10.30.0.1")
    }

    "isHttps set to false" in {
      filerHttp.isHttps must equalTo(false)
    }
    
    "port should be the 333" in {
      filerHttp.port must equalTo(333)
    }
    
    "port should not be the 443" in {
      filerHttp.port must not equalTo(443)
    }
  }
}