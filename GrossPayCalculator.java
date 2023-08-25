import java.util.Scanner;

//capitalize class name below.

public class GrossPayCalculator{

  public static void main(String arg[]){
    // 1. Get the amount of hours worked.
    
    System.out.println("Enter the number of hours the employee worked.");
    Scanner scanner = new Scanner(System.in);//checks input
    int hours = scanner.nextInt();
    //Above assigns/validates input value to a variable 

    // 2. Get the hourly pay rate.
    
    System.out.println("Enter the hourly pat rate.");
    
    double payRate = scanner.nextDouble();//double commonly used for float.
    
    scanner.close();//scanner closed to create room

    // 3. Multiply the hours and pay rate.

    double grossPay = hours * payRate;//use operator to calculate

    // 4. Display results.

    System.out.println("The employee's gross pay is $" + grossPay);
    
  }
  
}