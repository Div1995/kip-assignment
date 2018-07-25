
//Aim: Extractor definition for URL parsing

package com.knoldus

class ExtractorForParsing {

  object URL extends App{

    def apply(protocal: String, domain: String, path: String, params: Map[String, String]): String = {

      require(protocal.nonEmpty && domain.nonEmpty && path.nonEmpty && params.nonEmpty, "Given parameters not Sufficient")

      protocal + "://" + domain + path + "?" + (params.map(ele => ele._1 + "=" + ele._2) mkString "&")

    }

    def unapply(url: String): Option[(String, String, String, Map[String, String])] = {
      require(url.nonEmpty, "Enter valid Email Id")
      val part = url split ("://",2)
      val part2 = part(1) split ("/",2)
      val part3 = part2(1) split '?'
      val pairsForMap = part3(1).split("=|&",6)
      val map = Map(pairsForMap(0)->pairsForMap(1),pairsForMap(2)->pairsForMap(3),pairsForMap(4)->pairsForMap(5))
        Some(part(0), part2(0), part3(0), map)

    }

  }
}
