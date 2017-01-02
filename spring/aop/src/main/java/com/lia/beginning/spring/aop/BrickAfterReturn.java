package com.lia.beginning.spring.aop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class BrickAfterReturn implements AfterReturningAdvice {
   @Override
   public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
      System.out.println("Brick After Return!");
   }
}