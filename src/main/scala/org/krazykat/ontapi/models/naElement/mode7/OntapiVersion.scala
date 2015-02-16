package org.krazykat.ontapi.models.naElement.mode7

import org.krazykat.ontapi.models.naElement.BaseOntapiVersion

case class OntapiVersion(
  major: Int,
  minor: Int    
) extends BaseOntapiVersion(major, minor)