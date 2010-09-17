package com.wijlens.ibgv.model

import com.wijlens.persistence.{ GenericDao}

/**
 * User: joris
 * Date: Aug 23, 2010
 * Time: 8:44:02 PM
 *
 *
 */

trait SealBagRepository extends GenericDao[SealBag] {
  def findByCode(code: String): List[SealBag]
}