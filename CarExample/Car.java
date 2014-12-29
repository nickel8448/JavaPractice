package practicepackage;

public class Car
{

  /* Program will contain the Car Company, Model, Horse Power, Colour */

  public Car(String brand, String model, double hp, String c)
  {
    BrandName = brand;
    CarModel = model;
    HorsePower = hp;
    Colour = c;
  }

  public String getBrandName()
  {
    return BrandName;
  }

  public String getCarModel()
  {
    return CarModel;
  }

  public double getHorsePower()
  {
    return HorsePower;
  }

  public String getColour()
  {
    return Colour;
  }

  public void ChangeColour(String NewColour)
  {
    Colour = NewColour;
  }

  public void ChangeBrand(String NewBrandName)
  {
    BrandName = NewBrandName;
  }

  public void ChangeHP(Double NewHP)
  {
    HorsePower = NewHP;
  }

  public void ChangeModel(String NewModel)
  {
    CarModel = NewModel;
  }

  public double getCost()
  {
    if (BrandName == "Toyota") Cost = 110000.00;
    else if (BrandName == "Hyundai") Cost = 100000.00;
    else Cost = 900000.00;
    return Cost;
  }
  /* Private Instances Variables */


  private String BrandName;
  private String CarModel;
  private double HorsePower;
  private String Colour;
  private double Cost;

}
