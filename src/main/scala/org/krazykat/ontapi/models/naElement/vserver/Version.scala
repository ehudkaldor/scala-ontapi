package org.krazykat.ontapi.models.naElement.vserver

import org.krazykat.ontapi.models.naElement.BaseVersion
import org.krazykat.ontapi.models.naElement.basic.SystemVersionTuple

case class Version(
  version: String, 
  isClustered: Boolean,
  buildTimestamp: Int,
  versionTuple: SystemVersionTuple
) extends BaseVersion(version, isClustered)
