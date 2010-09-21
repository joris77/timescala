package com.wijlens.project

import model.{SealBag, Repository}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.testng.Assert
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests
import org.testng.annotations.Test

/**
 * User: joris
 * Date: Aug 23, 2010
 * Time: 9:41:57 PM
 *
 *
 */
@ContextConfiguration(locations = Array("classpath:/applicationContext.xml"))
class VoorwerpenRepositoryTest extends AbstractTransactionalTestNGSpringContextTests{

  @Autowired var sealBagRepository : Repository = _

  @Test
  def vindEnCreeerVoorwerpen {
    Assert.assertEquals(sealBagRepository.findAll().size,0)
    sealBagRepository.save(SealBag("1234"))
    val voorwerpen = sealBagRepository.findAll()
    Assert.assertEquals(voorwerpen size,1)
    Assert.assertTrue(voorwerpen.exists(_.code == "1234"))
  }

  
}