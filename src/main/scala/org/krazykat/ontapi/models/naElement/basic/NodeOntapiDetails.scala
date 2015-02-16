package org.krazykat.ontapi.models.naElement.basic

import java.util.UUID

case class NodeOntapiDetails(
  major: Int,
  minor: Int,
  nodeName: String,
  nodeUuid: UUID
)