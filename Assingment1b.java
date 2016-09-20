/*******************************************************************************
 * 
 * Made by Michael Weedmark
 * Made for ICS4U, assignment 1B
 * This program finds the MaxRun of a user's string
 * 
*******************************************************************************/

import java.util.Scanner;

class Main {
	
  public static void main(String[] args) {
    
    System.out.println("Please enter a string you would like to find the MaxRun of.");
    
    //Variables
    Scanner Input = new Scanner(System.in);
    String UserInput = Input.nextLine();
    int MaxRun = 1;
    int RunCount = 1;
    char DefString = '\u0000';
    
    //Gets the length of the user's string and finds the MaxRun.
    for (int StringLength=0; StringLength<UserInput.length(); StringLength++) {
    	
    	if (UserInput.charAt(StringLength) == DefString){
    		
    		RunCount++;
    		
    		if (RunCount > MaxRun) {
    			
    			MaxRun = RunCount;
    			
    		}
    		
    	} else {
    		
    		RunCount = 1;
    		
    	}
    	//
    	DefString = UserInput.charAt(StringLength);
    	
    }System.out.println(MaxRun);
    
  }

}
