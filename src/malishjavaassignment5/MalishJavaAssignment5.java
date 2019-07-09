/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malishjavaassignment5;
import java.util.Scanner;
/**
 *
 * @author RedPanda's LapTop
 */
public class MalishJavaAssignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sets up and builds the array
        int userInput = 0;       
        Scanner input = new Scanner(System.in);        
        int[] count = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        //asks the user to input the data
        System.out.println("Enter a number between 0 and 20. Anything grater then 20 or "
                + "\nless then 0 will end the program and give you your reesults ");
        //gatheres everything for the FOR loop to generate 
        userInput = input.nextInt();        
        while (userInput <=20 && userInput >= 0){
           count[userInput]+=1;
           userInput = input.nextInt();
                      
        }
        //the system output telling the user how many times each number was selected
        for(int i = 0; i <= 20; i++){
            System.out.println(" Number " +i+" have been input " + count[i] +" times.");
        }
        
        
        
    }
    
}
