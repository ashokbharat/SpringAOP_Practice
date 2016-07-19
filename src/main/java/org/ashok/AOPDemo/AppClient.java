package org.ashok.AOPDemo;

import org.ashok.AOPModel.Shape;
import org.ashok.AOPService.BeanName;
import org.ashok.AOPService.ShapeService;
import org.ashok.AOPService.ShapeServiceFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppClient {

  
  public static void main(String[] args) {
   /*ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
   ShapeService srvce = ctx.getBean("shapeService",ShapeService.class);*/
    
    //Usage of Factory class for Spring Core
    
    //Our own implementation of Spring AOP, make use of ShapeServiceProxy and invoke logger advice method 
    //from the Circle getter method
    ShapeService srvce = (ShapeService) ShapeServiceFactory.getBean(BeanName.shapeService);
    srvce.getCircle();
    //srvce.getTriangle();
   //System.out.println("Shape name is :" + srvce.getCircle().getName());
   //srvce.getCircle().displayName();
  }

}
