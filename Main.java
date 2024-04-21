
package application; // eclipse ide - delete it, if you run, out of the eclipse - output error

// Author: PHNO - Tecnólogo | Pós-Graduado
// Release Date: 17/10/2023
// Version: 2.0.1v
// Replit: @PHNO, @PHREPLIT
// E-mail: phreplit@gmail.com

// Algorithm: Basic Calculator in Java, with 4 basic operations, with menu and console compilation.

import java.io.IOException;
import java.util.Scanner; // import lib

public class Main {
  
  public static void main(String[] args) throws IOException, InterruptedException {
    
    loop: // Menu 
    while (true) {

      System.out.println("\n");
      System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
      System.out.println(":: Basic Calculator in Java - 4 Basic Operations ::");
      System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
      System.out.println("");
      System.out.println(" Menu  \n");
      
      System.out.println(" 1 - Sum ");
      System.out.println(" 2 - Subtract ");
      System.out.println(" 3 - Multiply ");
      System.out.println(" 4 - Divide ");
      System.out.println(" 5 - Exit ");
      
      System.out.println("\n [9] About ");
      
      System.out.println("\n Select one choice 1 to 5: ");

    Scanner scanner = new Scanner(System.in);
    
    int choice = scanner.nextInt();

    try {
      
    switch (choice) {
      case 1:
        System.out.println("\n Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("\n Enter second number: "); 
        int b = scanner.nextInt();
        int sum = (a + b);
        System.out.println("\n Sum result:  " + sum);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\n Press enter to menu return... \n");
        String enter = scanner1.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        break;
      case 2:
        System.out.println("\n Enter first number: "); 
        int c = scanner.nextInt();
        System.out.println("\n Enter second number: ");
        int d = scanner.nextInt();
	int sub = (c - d);
        System.out.println("\n Subtract result: " + sub);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("\n Press enter to menu return... \n");
        String enter2 = scanner2.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        break;
      case 3:
        System.out.println("\n Enter first number: ");  
        int e = scanner.nextInt();
        System.out.println("\n Enter second number: ");
        int f = scanner.nextInt();
	int mult = (e * f);
        System.out.println("\n Multiply result: " + mult); 
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("\n Press enter to menu return... \n");
        String enter3 = scanner3.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
      break;
      case 4:
        System.out.println("\n Enter first number: ");
        int g = scanner.nextInt();
        System.out.println("\n Enter second number: ");
        int h = scanner.nextInt();
	int div = (g / h);
        System.out.println("\n Divide result: " + div);
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("\n Press enter to menu return... \n");
        String enter4 = scanner4.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
      break;
      case 5:
        System.out.println("\n Finished Algorithm! ");
      break loop;
      case 9:
      System.out.print("\033[H\033[2J");
      System.out.flush();
      Scanner scanner9 = new Scanner(System.in);
      System.out.println("\n");
      System.out.println(" Algorithm: Basic Calculator in Java ");
      System.out.println("\n Author: PHNO");
      System.out.println(" Release Date: 17/10/2023");
      System.out.println(" Version: 2.0.1v");
      System.out.println(" Replit: @PHNO, @PHREPLIT");
      System.out.println(" E-mail: phreplit@gmail.com");
      System.out.println("");
      System.out.println("\n Press enter to menu return... \n");
      String enter9 = scanner9.nextLine();
      System.out.print("\033[H\033[2J");
      System.out.flush();
      break;
      default:
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("\n Error. choice other option. ");
        System.out.println("\n Press enter to menu return... \n");
        String enter5 = scanner5.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
       }
      } catch (Exception e) {
      Scanner scanner6 = new Scanner(System.in);
      System.out.println("\n Error. system failure.");
      System.out.println("\n Press enter to menu return... \n");
      String enter6 = scanner6.nextLine();
      System.out.print("\033[H\033[2J");
      System.out.flush();
      }            
    }
   }
  }
