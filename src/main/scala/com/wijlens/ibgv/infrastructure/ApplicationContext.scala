package com.wijlens.ibgv.infrastructure

import org.springframework.context.annotation.{Bean, Configuration}
import javax.persistence.EntityManagerFactory
import org.springframework.beans.factory.annotation.Autowired
import com.wijlens.ibgv.model.SealBagRepository

/**
 * User: joris
 * Date: Aug 26, 2010
 * Time: 4:59:13 PM
 *
 *
 */
@Configuration
class ApplicationContext {
  @Autowired var entityManagerFactory : EntityManagerFactory = _

  @Bean
  def voorwerpenRepository: SealBagRepository = {
    val voorwerpenRepository = new JpaSealBagRepository()
    voorwerpenRepository.setEntityManagerFactory(entityManagerFactory)
    voorwerpenRepository
  }
}