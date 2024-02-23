package co.company;

import java.util.Random;
import java.util.Scanner;

public class Rock {
    public static void main(String[]args){
        System.out.println("Enter the no:-");
        Scanner r=new Scanner(System.in);
       
        //System.out.print("Enter 0 for rock,Enter 1 for paper,Enter 2 for scissors");
int userInput=r.nextInt();
        Random k=new Random();
        int computerInput=k.nextInt();

        if(computerInput==userInput){
            System.out.println("Draw");
        }

        else if(userInput==0&& computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            System.out.println("You win");
        }
        else{
            System.out.println("Computer win");
        }

        if(computerInput==0){
            System.out.println("computer choice: Rock");
        }
        else if(computerInput==1){
            System.out.println("computer choice: Paper");
        }
        else if(computerInput==2){
            System.out.println("computer choice: Scissors");
        }
    }

}
