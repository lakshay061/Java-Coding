package lk;

import java.util.ArrayList;
import java.util.Scanner;

class WrongInputException extends Exception{
    @Override
    public String toString(){
        return "Wrong Option Selected !!";
    }
}

public class Library_Management_System<books> {
    Scanner sc = new Scanner(System.in);
    Scanner c = new Scanner(System.in);
    ArrayList<String> books = new ArrayList<String>();
    ArrayList<String> issueBooks = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();
    boolean ff = false;

    public void showAvailableBooks() throws WrongInputException{
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println("Thank You For Your Visit.");
        System.out.println("\n\n");
    }

    public void showIssuedBooks() throws WrongInputException{
        if(issueBooks.size()==0){
            System.out.println("No Books Issued from The Library.");
            System.out.println("Thank You For Your Visit.");
            System.out.println("\n\n");
        }
        for (int i=0; i<issueBooks.size();i++) {
            System.out.println(issueBooks.get(i)+"--->"+names.get(i));
            System.out.println("Thank You For Your Visit.");
            System.out.println("\n\n");
        }
    }

    public void issueBook() throws WrongInputException{
        System.out.print("Please Enter The Book Name You Want To Issue : ");
        String s = sc.nextLine();
        try{
            for (int i=0; i<books.size(); i++) {
                if (books.get(i).equals(s)) {
                    ff = true;
                }
            }
                if(ff){
                    System.out.println("Book Is Available In The Library.");
                    System.out.print("Please Enter Your Name To Issue Book : ");
                    String ss = sc.nextLine();
                    System.out.println("Book Issued Successfully.");
                    System.out.println("Thank You For Your Visit.");
                    System.out.println("\n\n");
                    books.remove(s);
                    issueBooks.add(s);
                    names.add(ss);
                }
                else{
                    System.out.println("Sorry Book Is Not Available In The Library.");
                    System.out.println("Thank You For Your Visit.");
                    System.out.println("\n\n");
                }
                ff = false;
        }
        catch (Exception e) {
        }
    }

    public void returnBook() throws WrongInputException{
        System.out.print("Please Enter The Book Name You Want To Return : ");
        String sn = sc.nextLine();
        try{
            for (int i=0; i<issueBooks.size(); i++) {
                if (issueBooks.get(i).equals(sn)) {
                    ff = true;
                }
            }
            if(ff){
//                System.out.print("Please Enter Your Name To Return Book : ");
//                String ss = sc.nextLine();
                System.out.println("Book Returned Successfully.");
                System.out.println("Thank You For Your Visit.");
                System.out.println("\n\n");
                issueBooks.remove(sn);
                books.add(sn);
            }
            else{
                System.out.println("Sorry This Is Not Our Library book.");
                System.out.println("Thank You For Your Visit.");
                System.out.println("\n\n");
            }
            ff = false;
        }
        catch (Exception e) {
        }
    }

    public void addBook() throws WrongInputException{
        System.out.print("Please Enter Book Name That You Want To Add : ");
        String ss = sc.nextLine();
        if(ss.trim().length()==0){
            System.out.println("Please Enter A Valid Choice..");
            System.out.println("Thank You For Your Visit.");
            System.out.println("\n\n");
        }
        else{
            System.out.println("Book Added Successfully.");
            System.out.println("Thank You For Your Visit.");
            System.out.println("\n\n");
            books.add(ss);
        }
    }

    public static void main(String[] args) {
        boolean flag = true;
        Library_Management_System ll = new Library_Management_System();
        ll.books.add("The Holy Bible");
        ll.books.add("The Holy Quran");
        ll.books.add("The Harry Potter Series");
        ll.books.add("The Quotations");
        ll.books.add("The Lord of the Rings");
        ll.books.add("The Diary of Anne Frank");
        ll.books.add("The Holy Ramayana");
        ll.books.add("The Holy Geeta");
        ll.books.add("The The Twilight Saga");
        ll.books.add("The Witcher");

        try{
            while (flag) {
                System.out.println("Welcome To Library Management System...");
                System.out.printf("0.Show Available Books\n1.Show Issued Books\n2.Issue Book\n3.Return Book\n4.Add Book\n5.Exit\n");
                System.out.print("Please Enter Your Purpose For Library Visit : ");
                Scanner sm = new Scanner(System.in);
                int ch = sm.nextByte();
                if (ch == 0){
                    try{
                        ll.showAvailableBooks();
                    }
                    catch (WrongInputException e) {
                        System.out.println(e);
                    }
                }
                else if (ch == 1){
                    try{
                        ll.showIssuedBooks();
                    }
                    catch (WrongInputException e) {
                        System.out.println(e);
                    }
                }
                else if (ch == 2){
                    try{
                        ll.issueBook();
                    }
                    catch (WrongInputException e) {
                        System.out.println(e);
                    }
                }
                else if (ch == 3){
                    try{
                        ll.returnBook();
                    }
                    catch (WrongInputException e) {
                        System.out.println(e);
                    }
                }
                else if (ch == 4){
                    try{
                        ll.addBook();
                    }
                    catch (WrongInputException e) {
                        System.out.println(e);
                    }
                }
                else if (ch == 5){
                    flag = false;
                    break;
                }
                else{
                    throw new WrongInputException();
                }
            }
        }
        catch (Exception e){
            System.out.println("Sorry Wrong Option Selected !!");
            flag = false;
        }

    }
}

