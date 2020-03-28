package com.cleancode;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculates risk points for users, considering a new virus:
 *
 * If is man: +1 risk point
 * If is old: +1 risk point
 *
 */
public class Main {

    public static final int MINIMUM_USERS = 2;

    public static void main(String[] args) {
        List<User> users = createUsers();

        if (hasInvalidUsers(users)) {
            return;
        }

        calculateRisks(users);
        printResults(users);
    }

    private static boolean hasInvalidUsers(List<User> users) {
        if (users.size() < MINIMUM_USERS) {
            System.out.println("This program works only with at least " + MINIMUM_USERS + " users");
            return true;
        }
        return false;
    }

    private static List<User> createUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User("John", 75, Gender.M));
        users.add(new User("Mary", 89, Gender.F));
        users.add(new User("Jane", 10, Gender.F));
        users.add(new User("Peter", 20, Gender.M));

        return users;
    }

    private static void calculateRisks(List<User> users) {
        users.forEach(User::calculateRisk);
    }

    private static void printResults(List<User> users) {
        users.forEach(user -> {
            System.out.println("The risk for the user " + user.getName() + " (" + user.getAge() + ") is " + user.getRisk());
        });
    }
}








