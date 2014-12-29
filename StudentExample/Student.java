package practicepackage;


import acm.program.*;

/* The program will contain 5 elements, taking the name, studentID, incremental in courses, passing or not */

public class Student extends ConsoleProgram
{

  public Student(String name, int id, double d)
  {
    StudentName = name;
    StudentID = id;
    Units = d;
  }

  public String getName()
  {
    return StudentName;
  }

  public int getID()
  {
    return StudentID;
  }

  public double getUnits()
  {
    return Units;
  }

  public void incrementUnits(double additionalUnits)
  {
    Units += additionalUnits;
  }

  public boolean hasEnoughUnits()
  {
    return (Units >= ToPass);
  }

  public String ToString()
  {
    return StudentName + "(" + StudentID + ")";
  }

  /* Final instance for */

  public static final double ToPass = 180.0;

  /* Private Instance Variables */

  private String StudentName;
  private int StudentID;
  private double Units;
}
