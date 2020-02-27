package lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab1 {
    static int factorial(int n) {
    int factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial = factorial * i;
    }
    return factorial;
  }
    
    public static void main(String[] args) throws ParseException {
    System.out.println("Hello world!");
    System.out.print("Please enter your name: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("Hello, " + name);
    int nameLength = name.length();
    System.out.println("Your name has " + nameLength + " letters");
    System.out.println(nameLength + "! = " + factorial(nameLength));
    System.out.print("Please, enter your birth date in format (DD.MM.YYYY): ");
    String birthday = scanner.nextLine();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy");
    Date birthDate = dateFormat.parse(birthday);
    Date date = new Date();
    System.out.println("Today is " + date + " your birthday is " + birthDate);
  }
}
    

