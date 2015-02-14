package org.krazykat.ontapi.models.naElement.basic

import java.util.UUID

case class NodeVersionDetailInfo(
  buildTimestamp: Int,
  nodeName: String,
  nodeUuid: UUID,
  version: String
)