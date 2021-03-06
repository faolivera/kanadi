package org.zalando.kanadi.models

import akka.http.scaladsl.model.headers.RawHeader

case class CustomHeaders(headers: Map[String, String]) extends AnyVal {
  def toRawHeaders: List[RawHeader] = {
    headers.to[List].map { case (k, v) => RawHeader(k, v) }
  }
}
