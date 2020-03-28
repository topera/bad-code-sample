package com.cleancode;

import java.util.ArrayList;

/**
 * This is a program that put some risk points to the users, considering a new virus:
 * If is man: +1
 * If is old: +1
 * (ele fala a chance de um usuário com um novo virus)
 * @autor Rafael Topera
 */
public class Main {

    static Boolean enableAgeCheck = true;
    static Boolean elderyPeopleDisabledCheck_2 = false;

    /**
     * Receives de main args
     * Tests if the logic is correct
     * @param args
     */
    public static void main(String[] args) {

        // TODO
        User j = new User();
        j.name = "John";
        j.age = 75;
        j.genderoftheuzer = "M";

        // TODO
        User m = new User();
        m.name = "Mary";
        m.age = 89;
        m.genderoftheuzer = "F";

        // TODO
        User j2 = new User();
        j2.name = "Jane";
        j2.age = 10;
        j2.genderoftheuzer = "F";

        // TODO
        User p = new User();
        p.name = "Peter";
        p.age = 20;
        p.genderoftheuzer = "M";


        /**
         * ADD PEOPLE ON LIST
         */
        // TODO: improve this
        ArrayList<Object> people = new ArrayList<Object>();
        people.add(j);
            people.add(m);
            people.add(j2);
            people.add(p);

            /**
             * VALIDATE LIST
             */
int sizeOfListOfPeoplesinarray = people.size();
            if (sizeOfListOfPeoplesinarray > 0 && sizeOfListOfPeoplesinarray < 2)
            System.out.println("This program works only with at least 2 people");
            else {

            /**
             * CALCULATE RISK
             */
            for(int i=0; i< people.size(); i++) {
                User user = (User) people.get(i);
                int newRiskForTheUser = 0;
                if (user.check(true, false)){
                    newRiskForTheUser = newRiskForTheUser + 1;
                }
                if (user.check(false, Boolean.TRUE)){
                    newRiskForTheUser = newRiskForTheUser + 1;

                }
                user.risk = newRiskForTheUser;
            }

                /**
                 * PRINT RESULT
                 */
                for(int i=0; i< people.size(); i++) {
                    User user = (User) people.get(i);
                    System.out.println("The risk for the user " + user.name + " (" + user.age + ") is " + user.risk);
                }

            }
    }

}


class User {

    String name;
    int age;
    String genderoftheuzer;
    int risk;

    boolean isThisUserInTheVirusRiskGroupBecauseIfGreatherThan50(){
        // if the age is great than 60 then the user in the virus risk group
        if (age >= 60){
            return true;
        } else
            // otherwise is not on the risk group
            return false;

    }

    boolean check(boolean checkUserGender, boolean checkUserAge) {
        if (checkUserGender) {
            if (genderoftheuzer.equals("M")) {
                return true;
            } else {

                if (genderoftheuzer.equals("F")) {
                    return false;
                }

            }

        } else if (checkUserAge){
            // the if is the format condition ? true-scenario : false-scenario
            return Main.enableAgeCheck ? !Main.elderyPeopleDisabledCheck_2 ? isThisUserInTheVirusRiskGroupBecauseIfGreatherThan50() : false : false;
        }

        return false;
    }


}








