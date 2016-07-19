package org.ashok.AOPModel;

public class Circle{
  private String name;
  
  public String getName() {
    System.out.println("Circle namer called\n");
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void displayName(){
    System.out.println("displayName is: " + getName());
  }
  /*@Override
  public void draw() {
    System.out.println("Circle is drawn");
    
  }*/

}
