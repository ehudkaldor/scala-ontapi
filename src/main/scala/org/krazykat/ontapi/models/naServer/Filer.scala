package org.krazykat.ontapi.models.naServer

import java.net.InetAddress

case class Filer(
  address: InetAddress,
  isHttps: Boolean = true,
  port: Int = 443
)