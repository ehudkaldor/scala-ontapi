package org.krazykat.ontapi.models.naElement.modeC

import org.krazykat.ontapi.models.naElement.BaseOntapiVersion
import org.krazykat.ontapi.models.naElement.basic.NodeOntapiDetails

case class OntapiVersion(
  major: Int,
  minor: Int,
  nodeOntapiDetails: NodeOntapiDetails
) extends BaseOntapiVersion(major, minor)