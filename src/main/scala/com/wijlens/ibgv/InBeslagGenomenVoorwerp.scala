package com.wijlens.ibgv


import com.wijlens.persistence.PersistentObject
import javax.persistence.{Table, Entity}

@Entity
@Table(name ="in_beslag_genomen_voorwerpen")
class InBeslagGenomenVoorwerp extends PersistentObject {
 var code : String = _
}

object InBeslagGenomenVoorwerp{

  def apply(code: String)={
    val ibgv : InBeslagGenomenVoorwerp = new InBeslagGenomenVoorwerp
    ibgv.code = code
    ibgv
  }
}