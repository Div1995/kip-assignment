package com.knoldus

class EmailParsing {

  def regexEmailParsing(strUrl: String) :Option[(String, String)] =
  {
    val email = """^([-a-z0-9_\+\.]*[a-z0-9])@([-a-z0-9\.]*[a-z0-9])$""".r
    strUrl match {
      case email(user, domain) => Some(user, domain)
      case _ => None
    }
  }
}
