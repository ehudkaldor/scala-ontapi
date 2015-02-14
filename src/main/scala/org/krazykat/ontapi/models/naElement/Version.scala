package org.krazykat.ontapi.models.naElement

import org.krazykat.ontapi.models.naElement.basic.NodeVersionDetailInfo
import org.krazykat.ontapi.models.naElement.basic.SystemVersionTuple

class Version(version: String, isClustered: Boolean) extends NaElement
case class Mode7Version(version: String, isClustered: Boolean) extends Version(version, isClustered)
case class ModeClusterVersion(
  version: String, 
  isClustered: Boolean,
  buildTimestamp: Int,
  nodeVersionDetails: NodeVersionDetailInfo,
  versionTuple: SystemVersionTuple
) extends Version(version, isClustered)
case class VServerVersion(
  version: String, 
  isClustered: Boolean,
  buildTimestamp: Int,
  versionTuple: SystemVersionTuple
) extends Version(version, isClustered)
