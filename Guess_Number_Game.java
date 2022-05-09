package lk;
import java.util.Random;
import java.util.Scanner;
public class Guess_Number_Game{
    int user;
    int comp;
    public Guess_Number_Game(){
        Random random = new Random();
        int comp_num = random.nextInt(101);  //limitation is 100...
        comp = comp_num;
    }
    public void takesUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number Between 0 To 100: ");
        int user_num = sc.nextInt();
        user = user_num;
    }
    public boolean isCorrectNumber(){ return true; }
    public static void main(String[] args) {
        int noOfGuesses=1;
        Guess_Number_Game obj = new Guess_Number_Game();
        obj.takesUserInput();
        while(obj.isCorrectNumber()) {
                if (obj.user > obj.comp) {
                    System.out.println("\nThe Number You Enter Is Greater...\nPlease Try Again...\n");
                    noOfGuesses = noOfGuesses+1;
                    obj.takesUserInput();
                }
                else if (obj.user < obj.comp) {
                    System.out.println("\nThe Number You Enter Is Smaller...\nPlease Try Again...\n");
                    noOfGuesses = noOfGuesses+1;
                    obj.takesUserInput();
                }
                else {
                    System.out.println("\nYou Have Won The Game !!");
                    System.out.println("Total Number Of Guesses Are : " + noOfGuesses);
                    break;
                }
        }
    }
}
