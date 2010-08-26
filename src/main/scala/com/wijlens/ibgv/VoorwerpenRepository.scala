package com.wijlens.ibgv

import javax.persistence.EntityManager
import com.wijlens.persistence.GenericJpaDaoSupport._
import com.wijlens.persistence.{GenericJpaDaoSupport, GenericDao}
import org.springframework.context.annotation.Bean

/**
 * User: joris
 * Date: Aug 23, 2010
 * Time: 8:44:02 PM
 *
 *
 */

trait VoorwerpenRepository extends GenericDao[InBeslagGenomenVoorwerp] {
  def findByCode(code: String): List[InBeslagGenomenVoorwerp]
}

class JpaVoorwerpenRepository extends GenericJpaDaoSupport(classOf[InBeslagGenomenVoorwerp]) with VoorwerpenRepository {

  def findByCode(name: String) = {
    getJpaTemplate().executeFind((em:EntityManager) => {
        val query = em.createQuery("SELECT i FROM InBeslagGenomenVoorwerp i WHERE i.code like :code");
        query.setParameter("code", "%" + name + "%");
        query.getResultList();
    }).asInstanceOf[List[InBeslagGenomenVoorwerp]].toList

  }
}