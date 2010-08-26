package com.wijlens.ibgv

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.testng.annotations.Test
import org.testng.Assert
import javax.persistence.EntityManagerFactory
import org.springframework.transaction.annotation.Transactional
import org.springframework.test.context.transaction.TransactionConfiguration
import org.springframework.test.context.testng.{AbstractTransactionalTestNGSpringContextTests}


/**
 * User: joris
 * Date: Aug 23, 2010
 * Time: 9:41:57 PM
 *
 *
 */
@ContextConfiguration(locations = Array("classpath:/applicationContext.xml"))
@Transactional
class VoorwerpenRepositoryTest extends AbstractTransactionalTestNGSpringContextTests{

  @Autowired var voorwerpenRepository: VoorwerpenRepository = null

  @Test
  def vindEnCreeerVoorwerpen {
    Assert.assertEquals(voorwerpenRepository.findAll().size,0)
    voorwerpenRepository.save(InBeslagGenomenVoorwerp("1234"))
    voorwerpenRepository.flush
    val voorwerpen = voorwerpenRepository.findAll()
    Assert.assertEquals(voorwerpen size,1)
    Assert.assertTrue(voorwerpen.exists(_.code == "1234"))
  }
}