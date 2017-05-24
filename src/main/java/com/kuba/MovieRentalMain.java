package com.kuba;


import com.kuba.exeptions.MovieAlreadyExistsExeption;
import com.kuba.exeptions.NullCustomerExeption;
import com.kuba.exeptions.NullMovieExeption;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MovieRentalMain {

    public static void main(String[] args) throws NullCustomerExeption, MovieAlreadyExistsExeption, NullMovieExeption {

        Date testData = new Date();


        Customer customer1 = new Customer("1234", "Kowalski", "Janusz", "Warszawa", testData);
        Customer customer2 = new Customer("1234", "Maliniak", "Adam", "Wrocław", testData);
        Customer customer3 = new Customer("1234", "Brodzki", "Marek", "Gdynia", testData);
        Customer customer4 = new Customer("1234", "Swiniarski", "Dupa", "Poltusk", testData);

        Movie movie1 = new Movie("tytanic", "romans", "nudny");
        Movie movie2 = new Movie("park jurajski", "romans", "nudny");
        Movie movie3 = new Movie("superman", "fantasy", "nudny");
        Movie movie4 = new Movie("hellraiser", "romans", "nudny");


        MovieRental rental1 = new MovieRental();

//        rental1.addCustomer(customer1);
//        rental1.addCustomer(customer2);
//        rental1.addCustomer(customer3);
//        rental1.addCustomer(customer4);

        rental1.addMovie(movie1);
        rental1.addMovie(movie2);
        rental1.addMovie(movie3);
        rental1.addMovie(movie4);


       // DataFileWriter.writeCustomersToFile("Customers.csv", rental1.getCustomers());

        rental1.printAllData();


    }
}
