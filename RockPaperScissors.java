package lk;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        boolean flag = true;
        while (flag==true) {
            Random random = new Random();
            int comp_num = random.nextInt(3);    //limitation is 3 means it will only give 0,1,2...

            System.out.println("Please Enter Your Choice...");
            System.out.println("0. Rock\n1. Paper\n2. Scissor");
            System.out.print("Please Enter Your Choice : ");
            Scanner sc = new Scanner(System.in);
            byte user_num = sc.nextByte();

            if (user_num == comp_num) {
                System.out.printf("You Choose %d And Computer Choose %d\n",user_num,comp_num);
                System.out.println("DRAW...");
            }
            else if ((user_num==0 && comp_num==2) || (user_num==1 && comp_num==0) || (user_num==2 && comp_num==1)){
                System.out.printf("You Choose %d And Computer Choose %d\n",user_num,comp_num);
                System.out.println("YOU WIN...");
            }
            else if ((user_num==0 && comp_num==1) || (user_num==1 && comp_num==2) || (user_num==2 && comp_num==0)){
                System.out.printf("You Choose %d And Computer Choose %d\n",user_num,comp_num);
                System.out.println("YOU LOSE...");
            }
            else
            System.out.println("Please Enter Valid Choice!!!");
            System.out.println("Do You Want To Continue...");
            System.out.print("1. Yes \n2. No : ");
            int check = sc.nextInt();
            if (check == 2)
                flag=false;
            else
                flag=true;
        }
    }
}