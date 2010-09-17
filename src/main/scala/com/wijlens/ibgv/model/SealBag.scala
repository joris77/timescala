package com.wijlens.ibgv.model


import com.wijlens.persistence.PersistentObject
import javax.persistence.{Table, Entity}

@Entity
@Table(name ="sealbags")
class SealBag extends PersistentObject {
 var code : String = _

  def slaOp(bewijsVanInname : BewijsVanInname, opslag : Opslag) = {

  }

  def slaOp(opslag : Opslag) = {
    
  }

  def haalUitDeOpslag(door : Douanier, opslag : Opslag) = {

  }

  def geefBestemming(bestemming : Bestemming) = {

  }


}

object SealBag{

  def apply(code: String)={
    val ibgv : SealBag = new SealBag
    ibgv.code = code
    ibgv
  }
}