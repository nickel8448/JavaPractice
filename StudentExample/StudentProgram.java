package practicepackage;

import acm.program.*;

public class StudentProgram extends ConsoleProgram
{

  public void run()
  {
      Student stud = new Student("Rahul Wadhwani", 123, 190.0);
      
      println(stud.getName() + " has " + stud.getUnits() + " units.");
  }

}
