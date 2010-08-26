package com.wijlens.persistence

import java.io.Serializable

/**
 * User: joris
 * Date: Aug 23, 2010
 * Time: 9:08:37 PM
 *
 *
 */
trait GenericDao[T] {
      def findAll():List[T]
      def save(entity:T):T
      def remove(entity:T):Unit
      def findById(id:Serializable):T
      def flush
}