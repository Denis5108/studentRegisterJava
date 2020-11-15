package User;

import java.util.HashMap;
import java.util.Scanner;

public class username {
    public static boolean verify(String username, Integer password) {
        if (username == "David" && password == 1000) {
            return true;
        }

        return false;
    }
    public static String getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username? ");
        String username = input.next();
        return username;
    }
    public static Integer getPassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password? ");
        Integer password = input.nextInt();
        return password;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> userInfo = new HashMap<String, Integer>();
        // continue unitl this equals false
        boolean done = false;

        Scanner inputState = new Scanner(System.in);

        while (!done) {
            System.out.println("1. Enter your username, password \n" +
                               "2. Display all users \n" +
                               "3. Quit program"
                              );
            System.out.print("> ");
            int next = inputState.nextInt();
            if (next == 1) {
                String username = getName();
                Integer password = getPassword();
                userInfo.put(username, password);
            }
            if (next == 2) {
                System.out.println("All Users");
                for (String i : userInfo.keySet()) {
                    System.out.println(i);
                }
            }
            if (next == 3) {
                done = true;
            }
        }
        // ask the user for his name
        // and ask the user for his age
    }
}
