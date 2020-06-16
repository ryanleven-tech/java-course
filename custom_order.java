// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      //System.out.println("Hello World!"); // print Hello World to console
     Scanner keyboard = new Scanner (System.in);

     String firstName; //users first name
     String itemOrder;  //item ordered
     String frostingType;  //frosting ordered
     String fillingType; //filling type
     String toppings;  //toppings
     String input;  //user input

     double cost = 15.00;  //cost of the cupcakes
     final double TAX_RATE = .08;  //sales tax rate
     double tax;  //amount of tax

     System.out.print("What is your first name?");
     firstName = keyboard.nextLine();

     // Introduce shop and prompt user to enter first name
     System.out.println("Welcome to Java's Cake and Cupcake Shop!");
     System.out.println("We make custom cakes with our secret cake batter!");

     System.out.println("---------------------------------------------------");
     System.out.println("        Menu                Quantity      Base Cost");
     System.out.println("---------------------------------------------------");
     System.out.println("        Cake                    1            $15.00");
     System.out.println("     Set of Cakes               6            $15.00");
     System.out.println("---------------------------------------------------");
     System.out.println("Frostings (vanilla, chocolate, strawberry, coco)   ");
     System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)    ");
     System.out.println("Topping (sprinkles, coco, cinnamon, nuts)          ");
     System.out.println("---------------------------------------------------");

     System.out.println("Do you want Cupcakes or Cake?");
     itemOrder = keyboard.nextLine();

     System.out.println("What type of frosting would you like?");
     System.out.println("Vanilla, Chocolate, Strawberry, Coco");
     frostingType = keyboard.nextLine();

     System.out.println("What type of filling would you like?");
     System.out.println("Mocha, Mint, Lemon, Caramel, Vanilla");
     fillingType = keyboard.nextLine();

     System.out.println("What type of toppings would you like?");
     System.out.println("Sprinkles, Coco, Cinnamon, Nuts");
     toppings = keyboard.nextLine();



    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  

	 
    // Introduce shop and prompt user to input first name
      

	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
	  
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

	
      

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

  
	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

   
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING


	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS


	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION


      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
  
    }   
}