package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> listOfPeople = new ArrayList<>();

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

        int averageAge = 0;
        int ageTotal = 0;
        for (Person listOfPeopleAge : listOfPeople) {
            ageTotal += listOfPeopleAge.getAge();
        }
        averageAge = ageTotal/listOfPeople.size();
        System.out.println("The Average age is: " + averageAge);

        int oldestAge = 0;
        for (Person listOfPerson : listOfPeople) {
            if (oldestAge < listOfPerson.getAge()){
                oldestAge = listOfPerson.getAge();
            }
        }
        System.out.println("The Oldest Person is: " + oldestAge);

        int youngestAge = 0;
        int temp = oldestAge;
        for (Person listOfPerson : listOfPeople) {
            if (temp > listOfPerson.getAge()){
                youngestAge = listOfPerson.getAge();
                temp = listOfPerson.getAge();
            }
        }
        System.out.println("The youngest person is: " + youngestAge);

    }
}
