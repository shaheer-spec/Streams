package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Person> listOfPeople = new ArrayList<>();

    public static void main(String[] args) {

        listOfPeople.add(new Person("Liam", "Rodriguez", 27));
        listOfPeople.add(new Person("Olivia", "Chen", 34));
        listOfPeople.add(new Person("Noah", "Patel", 22));
        listOfPeople.add(new Person("Emma", "Johnson", 29));
        listOfPeople.add(new Person("Ava", "Martinez", 41));
        listOfPeople.add(new Person("William", "Brown", 33));
        listOfPeople.add(new Person("Sophia", "Nguyen", 25));
        listOfPeople.add(new Person("James", "Garcia", 38));
        listOfPeople.add(new Person("Isabella", "Davis", 30));
        listOfPeople.add(new Person("Mason", "Wilson", 19));

        matchingPeople();

        averageAge();

        oldestPerson();

        youngestPerson();

    }

    private static void matchingPeople(){
        System.out.print("Give me a first name: ");
        String firstName = scanner.nextLine();

        List<Person> matchingPeople = new ArrayList<>();
        for (Person listOfPerson : listOfPeople) {
            if (firstName.equalsIgnoreCase(listOfPerson.getFirstName())){
                matchingPeople.add(listOfPerson);
            }
        }

        for (Person matchingPerson : matchingPeople) {
            System.out.println("Matching people: " + matchingPerson);
        }
    }

    private static void averageAge (){
        int averageAge = 0;
        int ageTotal = 0;
        for (Person listOfPeopleAge : listOfPeople) {
            ageTotal += listOfPeopleAge.getAge();
        }
        averageAge = ageTotal/listOfPeople.size();
        System.out.println("The Average age is: " + averageAge);
    }

    private static void oldestPerson(){
        int oldestAge = 0;
        for (Person listOfPerson : listOfPeople) {
            if (oldestAge < listOfPerson.getAge()){
                oldestAge = listOfPerson.getAge();
            }
        }
        System.out.println("The Oldest Person is: " + oldestAge);
    }

    private static void youngestPerson(){
        int youngestAge = Integer.MAX_VALUE;
        for (Person listOfPerson : listOfPeople) {
            if (youngestAge > listOfPerson.getAge()){
                youngestAge = listOfPerson.getAge();
            }
        }
        System.out.println("The youngest person is: " + youngestAge);
    }
}
