  /********************************************
Program: Main
Files: - Main.java
       - pokemon.csv
Author: Jinwoo Park
Contact: jinwoo.park@my.uwrf.edu
Date: 10-06-2022
Modified: 10-10-2022

Description:
This program parses an input file (pokemon.csv)
and print out the pokemon's information that user want to know
*********************************************/    


import java.util.*; // so we can use scanner to read in user input
import java.io.*; // so we can read in files using the File class

class Main {
  public static void main(String[] args) throws Exception {

     File file = new File("pokemon.csv"); // save the pokemon.csv to file
        System.out.println("Welcome to the Pokedex. Would you like to search by name or by number?"); 
        Scanner input = new Scanner(System.in); // declare scanner as input and able to read user's input
        String user_input = input.nextLine(); // save user input as user_input
        if (user_input.equalsIgnoreCase("name")) { // if user's input match with "name" print out " Please enter the name of the Pokemon: "
            System.out.println(" Please enter the name of the Pokemon: ");
            Scanner input2 = new Scanner(System.in); // declare scanner as input2 and able to read user's input
            String user_input2 = input2.nextLine(); // save user input as user_input2
            Scanner sc = new Scanner(file); // read pokemon.csv
        for (int i = 0; i < 802; i++) { // set i to able to read all the context in pokemon.csv
                String line = sc.nextLine(); // declare a String called "line" and set it eqaul to sc.nextLine();
                String[] values = line.split(",");// declare a String called "values" and albe to spilt with ","
                if (values[1].equalsIgnoreCase(user_input2)) { // if user's input match with the name in pokemon.csv print out the name, number, type, type1, type2
                    System.out.println("Name: " + values[1] + ", Number: " + 
                    values[0] + ", Type: " + values[2] + ", Type1: " + 
                    values[3] + ", Type2: " + values[4] );         
                   break; 
                }
                 else if ( i == 801 ) { // if user's input doesn't match, print out error "Pokemon not found"
                    System.out.println("Pokemon not found");
                  break;  
                }
            }
         }
        else if (user_input.equalsIgnoreCase("number")) { // if user choose to search by the number print out " Please enter the number of the Pokemon: "
            System.out.println(" Please enter the number of the Pokemon: ");
            Scanner input3 = new Scanner(System.in); // declare scanner as input3 and able to read user's input
            String user_input3 = input3.nextLine(); // save user input as user_input3
            Scanner sc = new Scanner(file); // read pokemon.csv 
            for (int i = 0; i < 802; i++) { // set i to able to read all the context in pokemon.csv
                String line = sc.nextLine(); // declare a String called "line" and set it equal to sc.nextLine();
                String[] values = line.split(","); // declare a String called "values" and albe to spilt with ","
                if (values[0].equalsIgnoreCase(user_input3)) { // if user's input match with the number in pokemon.csv print out number, name, type, type1, type2
                    System.out.println("Number: " + values[0] + ", Name: " + 
                    values[1] + ", Type: " + values[2] + ", Type1: " + 
                    values[3] + ", Type2: " + values[4]);
                    break;
                }
             else if (i == 801 ){ // if user's input doesn't match, print out error "I'm sorry, but there is no known Pokemon by that number."
              System.out.println("I'm sorry, but there is no known Pokemon by that number.");
               break;
                }
            }
        }
     System.out.println("Would you like to search for another Pokemon (y/n)? ");
     Scanner input4 = new Scanner(System.in); // declare scanner as input4 and use scanner
     String user_input4 = input4.nextLine(); // save user input as user_input4
     if (user_input4.equalsIgnoreCase("y")) { // if user input match with "y", return to main
            main(args);
        } else if (user_input4.equalsIgnoreCase("n")) { // if user input match with "n", ends program and print out "Thank you for using your Pokedex!"
            System.out.println(" Thank you for using your Pokedex!");
        }
     }
  }

          
            
  
