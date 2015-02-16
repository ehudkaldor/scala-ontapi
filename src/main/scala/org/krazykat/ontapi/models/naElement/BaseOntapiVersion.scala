package org.krazykat.ontapi.models.naElement

abstract class BaseOntapiVersion(
  major: Int,
  minor: Int
) extends NaElement{
  val api: String = "system-get-ontapi-version"
}