package com.wijlens.ibgv.infrastructure;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;

public class RichDomainObjectFactory implements BeanFactoryAware {

    private AutowireCapableBeanFactory factory = null;
        
    private static RichDomainObjectFactory singleton = new RichDomainObjectFactory();
    
    public static RichDomainObjectFactory autoWireFactory() {
        return singleton;
    }
    
    public void autowire(Object instance) {
        factory.autowireBeanProperties(instance, AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE,false); 
    }

    public void setBeanFactory(BeanFactory factory) throws BeansException {
        this.factory = (AutowireCapableBeanFactory) factory;
    }
    
}