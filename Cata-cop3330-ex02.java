/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */


public class Main
{
  public static void main(String[] args) 
  {    
        String str = "Homer";    
        int count = 0;    
        System.out.println("What is the input string? "+str);    
        //Count the characters in the string except space    
        for(int i = 0; i < str.length(); i++) 
        {    
            if(str.charAt(i) != ' ')    
                count++;    
        }                
        //Displays the total number of characters in the string    
        System.out.println("Homer has " + count +  " characters.");    
    }      
}