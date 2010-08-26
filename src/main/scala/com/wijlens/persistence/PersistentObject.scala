package com.wijlens.persistence

import java.io.Serializable
import javax.persistence.{GenerationType, GeneratedValue, MappedSuperclass, Id}

@MappedSuperclass
trait PersistentObject extends Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id: Long = -1
}