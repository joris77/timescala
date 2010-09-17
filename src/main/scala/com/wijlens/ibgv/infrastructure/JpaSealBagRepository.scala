package com.wijlens.ibgv.infrastructure

import com.wijlens.persistence.GenericJpaDaoSupport._
import javax.persistence.EntityManager
import com.wijlens.persistence.GenericJpaDaoSupport
import com.wijlens.ibgv.model.{SealBagRepository, SealBag}

/**
 * User: joris
 * Date: Aug 28, 2010
 * Time: 11:18:17 PM
 *
 *
 */

class JpaSealBagRepository extends GenericJpaDaoSupport(classOf[SealBag]) with SealBagRepository {

  def findByCode(name: String) = {
    getJpaTemplate().executeFind((em:EntityManager) => {
        val query = em.createQuery("SELECT i FROM SealBag i WHERE i.code like :code");
        query.setParameter("code", "%" + name + "%");
        query.getResultList();
    }).asInstanceOf[List[SealBag]].toList

  }
}