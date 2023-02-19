import com.javaSprintOne.Patron;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.deepToString;


public class Main {
    public static void main(String[] args) {



        // System Intro
        System.out.println("Welcome to the library management system!");

        // initializing Patron Array
       ArrayList<String> patronList = new ArrayList<>();

        // Taking Patron input (fullName, address,phoneNum, list of books patron has)
        Scanner newPatronInput = new Scanner(System.in);


        Patron newCust = new Patron();
        while(true) {
            System.out.println("What's the patrons First and Last Name: ");
            newCust.setFirstLastName(newPatronInput.nextLine());

            System.out.println("What's the patrons address?");
            newCust.setAddress(newPatronInput.nextLine());

            System.out.println("What's the patrons Phone number?");
            newCust.setPhoneNum(newPatronInput.nextLine());

            System.out.println("What's the patrons current book list?");

            newCust.setBookList(newPatronInput.nextLine());

            // outputs
            System.out.println(newCust.getFirstLastName());
            System.out.println(newCust.getAddress());
            System.out.println(newCust.getPhoneNum());
            System.out.println(newCust.getBookList());


            // trying to do program exit
            if (newPatronInput.hasNext("Q")) {
                System.out.println("Thanks for using the library management system! Goodbye!");
                System.exit(0);

            }
            // this is adding to the patron list array
            patronList.add(String.valueOf(newCust));

            // how do I print objects in array as String characters and not like this [com.javaSprintOne
            // .Patron@65b54208]
            System.out.println(patronList);

        }


    }

}