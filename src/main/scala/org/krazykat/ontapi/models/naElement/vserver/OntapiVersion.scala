package org.krazykat.ontapi.models.naElement.vserver

import org.krazykat.ontapi.models.naElement.BaseOntapiVersion

case class OntapiVersion(
  major: Int,
  minor: Int    
) extends BaseOntapiVersion(major, minor)