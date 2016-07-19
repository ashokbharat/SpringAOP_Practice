package org.ashok.AOPService;

import org.ashok.AOPAspect.LoggingAspect;
import org.ashok.AOPModel.Circle;

public class ShapeServiceProxy extends ShapeService {
  public Circle getCircle(){
    new LoggingAspect().loggingAdvice();
    return super.getCircle();
  }
}
