package com.lia.beginning.spring.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
   public static void main( String[] args )
   {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");
      CDPlayer obj = (CDPlayer) context.getBean("cdPlayer");
      obj.play();
   }
}
