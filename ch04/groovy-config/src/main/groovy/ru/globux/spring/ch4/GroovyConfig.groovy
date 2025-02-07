package ru.globux.spring.ch4

import ru.globux.spring.ch3.xml.Singer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

def ctx = new GenericApplicationContext()
def reader = new GroovyBeanDefinitionReader(ctx)

reader.beans {
    singer(Singer, name: 'John Mayer', age: 39)
}

ctx.refresh()

println ctx.getBean("singer")
