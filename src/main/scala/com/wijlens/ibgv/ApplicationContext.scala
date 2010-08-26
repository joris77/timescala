package com.wijlens.ibgv

import org.springframework.context.annotation.{Bean, Configuration}
import javax.persistence.EntityManagerFactory
import org.springframework.beans.factory.annotation.Autowired

/**
 * User: joris
 * Date: Aug 26, 2010
 * Time: 4:59:13 PM
 *
 *
 */
@Configuration
class ApplicationContext {
  @Autowired var emf : EntityManagerFactory = _

  @Bean
  def voorwerpenRepository: VoorwerpenRepository = {
    val voorwerpenRepository = new JpaVoorwerpenRepository()
    voorwerpenRepository.setEntityManagerFactory(emf)
    voorwerpenRepository
  }
}