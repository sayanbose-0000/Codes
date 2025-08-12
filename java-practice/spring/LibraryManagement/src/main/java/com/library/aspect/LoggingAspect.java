// AOP is used to run certain logic before/after logics in other methods of other classes. It keeps the original classes clean
// by taking the responsibility of those repeated logic, so that the original classes are kept clean

package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
  @Around("execution(* com.library..*(..))")
  public Object logginExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    long start = System.currentTimeMillis(); // gets start time
    Object res = proceedingJoinPoint.proceed(); 
    long timeTaken = System.currentTimeMillis() - start; // gets end time

    System.out.println(proceedingJoinPoint.getSignature() + " executed in " + timeTaken + " ms");
    return res;
  }
}
