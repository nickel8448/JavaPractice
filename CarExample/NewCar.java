package practicepackage;

import acm.program.*;

public class NewCar extends ConsoleProgram

{
  public void run()
  {
    Car car1 = new Car("Toyota", "Innova 2013", 250.0, "White");
    System.out.println("The new is " + car1.getBrandName() + car1.getCarModel() + ". With Horse Power of " + car1.getHorsePower() + " and of " + car1.getColour() + " colour.");
    car1.ChangeColour("Black");
    System.out.println("The new Colour is " + car1.getColour());
    System.out.println("The cost of the car is : " + car1.getCost());
  }
}
