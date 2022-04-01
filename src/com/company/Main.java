package com.company;

import java.util.Scanner;

public class Main {
    public static void showPrompt(String prompt){
        System.out.println();
        System.out.println(prompt + "\n \n");
        System.out.print(">");

    }

public enum Command {ADD_ENTRY, REMOVE_ENTRY, PRINT_BOOK, SEARCH_ADDRESS, DELETE_ADDRESSES, QUIT}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            showPrompt(
                        "Enter a Command:\n" +
                            " 1 ADD_ENTRY\n" +
                            " 2 REMOVE_ENTRY\n" +
                            " 3 PRINT_BOOK\n" +
                            " 4 SEARCH_ADDRESS\n" +
                            " 5 DELETE_ADDRESS\n" +
                            " 6 QUIT"
            );

            int i = sc.nextInt();


            sc.nextLine();
            Command command = Command.PRINT_BOOK;

            switch (i) {
                case 1:
                    command = Command.ADD_ENTRY;
                    break;
                case 2:
                    command = Command.REMOVE_ENTRY;
                    break;
                case 3:
                    command = Command.PRINT_BOOK;
                    break;
                case 4:
                    command = Command.SEARCH_ADDRESS;
                    break;
                case 5:
                    command = Command.DELETE_ADDRESSES;
                    break;

                case 6:
                    command = Command.QUIT;
                    break;
                default:
                    // code block
            }
            switch (command) {
                case ADD_ENTRY: {
                    showPrompt("Please enter first name of user." );
                    String firstName = sc.nextLine();
                    showPrompt("Please enter last name of user." );
                    String lastName = sc.nextLine();
                    showPrompt("Please enter user phone number." );
                    String phoneNumber = sc.nextLine();
                    showPrompt("Please enter user email address." );
                    String email = sc.nextLine();
                    AddressBook.addUserInfo(firstName, lastName, phoneNumber, email);
                    System.out.println("Adding a new entry" );
                    break;
                }
                case REMOVE_ENTRY: {
                    showPrompt("Enter the email of the user you want to remove." );
                    String email = sc.nextLine();
                    AddressBook.removeUser(email);
                    System.out.println("Removing User" );
                }
                break;
                case PRINT_BOOK:
                    AddressBook.printBook();
                    break;

                case SEARCH_ADDRESS:
                    int searchType;
                    while(true) {

                            showPrompt(
                                    "\n Enter a number for search type:\n" +
                                            " 1 FIRST NAME\n" +
                                            " 2 LAST NAME\n" +
                                            " 3 PHONE NUMBER\n" +
                                            " 4 EMAIL \n \n"
                            );
                        try {
                            searchType = sc.nextInt();

                            if (searchType>0 && searchType<5){break;}
                        }
                        catch(Exception e){

                            System.out.println("Enter a valid number");}
                        finally{
                            sc.nextLine();
                        }

                    }
                    System.out.println("Enter search info.");
                    String search= sc.nextLine();
                    AddressBook.searchAddress(searchType,search);
                    break;
                case DELETE_ADDRESSES:
                    AddressBook.removeAddresses();
                    break;

                case QUIT:
                    System.exit(0);
                    break;
                default:
                    // code block
            }


        }
    }
}
