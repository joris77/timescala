package com.wijlens.ibgv.application

import org.springframework.web.bind.annotation.RequestMethod._
import org.springframework.stereotype.Controller
import org.codehaus.jackson.map.ObjectMapper
import org.codehaus.jackson.JsonNode
import java.io.Reader
import com.wijlens.ibgv.model.SealBag
import java.util.{Collections, Map}
import org.springframework.web.bind.annotation.{ResponseStatus, ResponseBody, RequestMapping, RequestBody}
import org.springframework.http.{MediaType, HttpStatus}
import org.springframework.util.MultiValueMap

/**
 * User: joris
 * Date: Aug 29, 2010
 * Time: 9:27:18 PM
 *
 *
 */
@Controller
@RequestMapping(Array("sealBag"))
class SealBagController{

  @RequestMapping(method= Array(POST) )
  def registreerSealBag(@RequestBody form : MultiValueMap[String,String]) : String @ResponseBody = {
    print("hooi")
    "sealBagGeregistreerd"
  }

}