package com.wijlens.project.infrastructure

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
  @Autowired var entityManagerFactory : EntityManagerFactory = _

  
}