/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */

import java.util.Scanner;
public class Main
{
   public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   // Ask user to input
       System.out.print("What is the input string? ");
       String str=input.nextLine();
       int count=0;
       // Counts the number of character in the string inputted by the user
       
for(int i = 0; i < str.length(); i++) {
if(str.charAt(i) != ' ')
count++; // loop 
}

System.out.println(""+str+" has "+count+" chatacters."); // prints the string and prints the total number of characters
      
   }
}
