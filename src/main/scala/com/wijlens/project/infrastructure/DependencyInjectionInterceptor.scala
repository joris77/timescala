package com.wijlens.project.infrastructure

import java.io.Serializable
import org.hibernate.`type`.Type

import org.hibernate.EmptyInterceptor

/**
 * User: joris
 * Date: Sep 12, 2010
 * Time: 1:15:53 AM
 *
 *
 */
class DependencyInjectionInterceptor extends EmptyInterceptor {
    override def onLoad(instance:Object, id:Serializable, propertieValues:Array[Object],propertyNames:Array[String], propertyTypes:Array[Type]) = {
      RichDomainObjectFactory.autoWireFactory.autowire(instance)
      false
   }
}