package org.krazykat.ontapi.models.naElement.mode7
import org.krazykat.ontapi.models.naElement.BaseVersion

case class Version(version: String, isClustered: Boolean) extends BaseVersion(version, isClustered)
