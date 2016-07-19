package org.ashok.AOPAspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class LoggingAspect {
  //WildCard expression in which a single advice method will be invoked to multiple points of class methods
  //@Before("allgetters()")
  //@Before("execution(public * get*())")
  public void loggingAdvice(){
    System.out.println("logging Advice is run before getName() method is invoked\n");
  }
 /* @Before("allgetters() && allCircleMethods()")
//@Before("execution(public * get*())")
  private void secondAdvice(){
    System.out.println("Second Advice is run before getName() method is invokded\n");
  }*/
  //PointCut make use of @PointCut to apply same wildcard expression to multiple advice methods
  //@Pointcut("execution(public * get*())")
  public void allgetters(){
  }
  /*//PointCut advice method to be invoked for all circle methods
  @Before("execution(public * org.ashok.AOPModel.Circle.*())")
  public void allCircleMethods(){
    System.out.println("All circle emthods advice is invoked\n");
  }*/
  
/*//PointCut advice method to be invoked for all circle methods
  //@Before("execution(public * org.ashok.AOPModel.Circle.*())")
  @Pointcut("within(org.ashok.AOPModel.Circle)")
  public void allCircleMethods(){
    System.out.println("All circle emthods advice is invoked\n");
  }*/
}
