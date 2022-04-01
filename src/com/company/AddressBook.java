package com.company;


import java.util.HashMap;

public class AddressBook {
    private static HashMap<String, UserInfo> entries = new HashMap<>();

    public AddressBook() {
        entries = this.entries;
    }
    public static void addUserInfo(String firstName, String lastName, String phoneNumber, String email) {
        UserInfo newUser = new UserInfo(firstName, lastName, phoneNumber, email);
        AddressBook.entries.put(email, newUser);

    }

    public static void removeUser(String email) {
        AddressBook.entries.remove(email);
    }

    public static void printBook() {
        for (UserInfo user : entries.values()) {
            System.out.println(user);
        }

    }

    public static void searchAddress(int searchType, String search) {

        for (UserInfo user : entries.values()) {

            switch (searchType) {
                case 1:
                    if (user.getFirstName().contains(search)){
                        System.out.println(user);
                }
                    break;
                case 2:
                    if (user.getLastName().contains(search)){
                        System.out.println(user);
                    }
                    break;
                case 3:
                    if (user.getPhoneNumber().contains(search)){
                        System.out.println(user);
                    }

                    break;
                case 4:
                    if (user.getEmail().contains(search)){
                        System.out.println(user);
                    }

                    break;


            }

        }
    }

    public static void removeAddresses() {
        AddressBook.entries.clear();
    }

}




