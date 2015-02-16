package org.krazykat.ontapi.models.naElement

import org.krazykat.ontapi.models.naElement.basic.NodeVersionDetailInfo
import org.krazykat.ontapi.models.naElement.basic.SystemVersionTuple

class BaseVersion(version: String, isClustered: Boolean) extends NaElement {
  val api = "system-get-version"
}