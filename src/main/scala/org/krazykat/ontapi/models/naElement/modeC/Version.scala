package org.krazykat.ontapi.models.naElement.modeC

import org.krazykat.ontapi.models.naElement.BaseVersion
import org.krazykat.ontapi.models.naElement.basic.{NodeVersionDetailInfo, SystemVersionTuple}

case class Version(
  version: String, 
  isClustered: Boolean,
  buildTimestamp: Int,
  nodeVersionDetails: NodeVersionDetailInfo,
  versionTuple: SystemVersionTuple
) extends BaseVersion(version, isClustered)