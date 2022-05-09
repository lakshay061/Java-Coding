package lk;

import java.util.Scanner;

public class Online_Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        String[] books = new String[50];
//        String[] addBooks = new String[30];
        String[] issuebooks = new String[50];

        boolean flag0 = true;
        while (flag0){
        System.out.println("Welcome To Book Library...");
        System.out.printf("0.Show Available Books\n1.Show Issued Books\n2.Issue Book\n3.Return Book\n4.Add Book\n");
        System.out.print("Please Enter Your Purpose For Library Visit : ");
        int ch = sc.nextByte();

        if (ch == 2) {
            boolean flag1 = true;
            System.out.print("Please Enter Book Name You Want To Issue : ");
            String cmp = c.nextLine();
            for (int i = 0; i < books.length; i++) {
                if (books[i].equals(cmp)) {
                    flag1 = false;
                    System.out.println("Book Available...");
                    System.out.printf("Do You Want To Issue It : \n0.Yes\n1.Exit\n");
                    int st = sc.nextByte();
                    if (st == 0) {
                        issuebooks[i] = cmp;
                        System.out.println("Book Successfully Issued To Your ID...");
                        System.out.println("ThankYou For Your Visit...");
                        books[i] = null;
                        break;
                    }
                }
            }
            if (flag1) {
                System.out.println("Book Not Available In Library...");
                System.out.println("ThankYou For Your Visit...");
            }
        }
        else if (ch == 3) {
            System.out.print("Enter Book Name You Want To Return : ");
            String name3 = c.nextLine();
            for(int i=0;i< books.length;i++){
                if(books[i]==null) {
                    books[i] = name3;
                    break;
                }
                if(books[i]==name3){
                    books[i]=null;
                }
            }
            System.out.println("Book Returned Successfully...");
        }

        else if (ch == 0) {
            System.out.println("Total Available Books In Library : ");
            for (int i = 0; i < books.length; i++) {
                if(books[i]!=null){
                    System.out.printf("--> %s\n",books[i]);
                }
                }
            }

        else if (ch == 1) {
            System.out.println("Total Issued Books From library : ");
            for (int i = 0; i < issuebooks.length; i++) {
                if(issuebooks[i]!=null){
                    System.out.printf("--> %s\n",issuebooks[i]);
                }
            }
        }

        else if (ch == 4) {
            System.out.print("Enter Book Name You Want To Add In Library : ");
            String name2 = c.nextLine();
            for(int i=0;i< books.length;i++){
                if(books[i]==null) {
                    books[i] = name2;
                    break;
                }
            }
            System.out.println("Book Added Successfully...");
        }

        else
            System.out.println("Please Enter Valid Choice !!");

        System.out.printf("Do You Want To Continue : \n0.Yes\n1.NO\n");
        int m = sc.nextInt();
        if (m == 1) {
            flag0 = false;
            System.out.println("ThankYou For Your Visit...");
        }
        else
            flag0=true;
        }
    }
}
