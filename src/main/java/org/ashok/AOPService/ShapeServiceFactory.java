package org.ashok.AOPService;

import org.ashok.AOPModel.Circle;
import org.ashok.AOPModel.Triangle;

public class ShapeServiceFactory {
  public static Object getBean(BeanName beanName){
    Object obj = null;
    switch (beanName){
      case shapeService: 
        obj = new ShapeServiceProxy();
        break;
      case circle:
        obj = new Circle();
        break;
      case triangle:
        obj = new Triangle();
        break;
        default:
          System.out.println("Invalid beanName passed\n");
          break;
    }
    return obj;
  }
}
