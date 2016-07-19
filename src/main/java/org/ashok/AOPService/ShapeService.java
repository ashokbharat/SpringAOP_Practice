package org.ashok.AOPService;

import org.ashok.AOPModel.Circle;
import org.ashok.AOPModel.Triangle;

public class ShapeService {
  private Circle circle;
  private Triangle triangle;
  public Circle getCircle() {
    System.out.println("Circle getter called\n");
    return circle;
  }
  public void setCircle(Circle circle) {
    this.circle = circle;
  }
  public Triangle getTriangle() {
    System.out.println("Triangle getter called\n");
    return triangle;
  }
  public void setTriangle(Triangle triangle) {
    this.triangle = triangle;
  }
  
}
