package org.example;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex", 20, 999);
        User user2 = new User("Alex", 20, 999);
        System.out.println(user1.equals(user2));

    }
}