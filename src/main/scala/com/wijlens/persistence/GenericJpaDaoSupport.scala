package com.wijlens.persistence

import javax.persistence.EntityManager
import org.springframework.orm.jpa.JpaCallback
import org.springframework.orm.jpa.support.JpaDaoSupport

/**
 * User: joris
 * Date: Aug 23, 2010
 * Time: 9:01:21 PM
 *
 *
 */

object GenericJpaDaoSupport {
  implicit def jpaCallbackWrapper[T](func: (EntityManager) => T) = {
    new JpaCallback[T] {
      def doInJpa(session: EntityManager) = func(session).asInstanceOf[T]
    }
  }
}

import scala.collection.JavaConversions._
import java.io.Serializable

class GenericJpaDaoSupport[T](val entityClass: Class[T]) extends JpaDaoSupport with GenericDao[T] {
  def findAll(): List[T] = {
    getJpaTemplate().find("from " + entityClass.getName).toList.asInstanceOf[List[T]]
  }

  def save(entity: T): T = {
    getJpaTemplate().persist(entity)
    entity
  }

  def remove(entity: T) = {
    getJpaTemplate().remove(entity);
  }

  def findById(id: Serializable): T = {
    getJpaTemplate().find(entityClass, id).asInstanceOf[T];
  }

  def flush = {
    getJpaTemplate.flush
  }
}