package org.krazykat.ontapi.models.naServer

case class NaServer(
  filer: Filer,
  ontapiVersion: OntapiVersion,
  userCreds: UserCredentials
)

object NaServer {
  implicit def toNaServer(naServer: NaServer): netapp.manage.NaServer = {
    val ans = new netapp.manage.NaServer(naServer.filer.address)
    ans.setApiVersion(naServer.ontapiVersion.major, naServer.ontapiVersion.minor)
    ans.setServerType(netapp.manage.NaServer.SERVER_TYPE_FILER)
    ans.setTransportType(
      naServer.filer.isHttps match {
        case true => netapp.manage.NaServer.TRANSPORT_TYPE_HTTPS
        case false => netapp.manage.NaServer.TRANSPORT_TYPE_HTTP
      }    
    )
    ans.setPort(naServer.filer.port)
    ans.setStyle(netapp.manage.NaServer.STYLE_LOGIN_PASSWORD)
    ans.setAdminUser(naServer.userCreds.username, naServer.userCreds.password)
    ans
  }
}