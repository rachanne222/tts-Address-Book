package com.company;

import java.util.Scanner;

public class Main {

//    Present the user with a list of options to interact with the database and take in their input
//    Allow the user to perform the following actions:
//    Add an entry
//    Remove and entry
//    Search for a specific entry
//    Print the contents of the address book
//    Delete the contents of the address book
//    Quit the program
 public enum Command{ADD_ENTRY, REMOVE_ENTRY, PRINT_BOOK, SEARCH_ADDRESS, DELETE_ADDRESS, TEST}

    public static void main(String[] args) {

        System.out.println(
                "Enter a Command:\n" +
                        " 1 ADD_ENTRY\n" +
                        " 2 REMOVE_ENTRY\n" +
                        " 3 PRINT_BOOK\n"+
                        " 4 SEARCH_ADDRESS\n" +
                        " 5 DELETE_ADDRESS\n"
        );

//        UserInfo test= new UserInfo("John", "Doe", "678908897", "you@gmail.com");
//        System.out.println(test);

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Command command= Command.TEST;

        switch(i) {
            case 1:
                command=Command.ADD_ENTRY;
                break;
            case 2:
                command=Command.REMOVE_ENTRY;
                break;
            case 3:
                command=Command.PRINT_BOOK;
                break;
            case 4:
                command=Command.SEARCH_ADDRESS;
                break;
            case 5:
                command=Command.DELETE_ADDRESS;
                break;
            default:
                // code block
        }
        switch(command) {
            case ADD_ENTRY:

               System.out.println("Adding a new entry");
                break;
            case REMOVE_ENTRY:

                break;
            case PRINT_BOOK:
                break;
            case SEARCH_ADDRESS:

                break;
            case DELETE_ADDRESS:

                break;
            default:
                // code block
        }


    }
}
