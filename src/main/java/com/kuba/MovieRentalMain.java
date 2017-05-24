package com.kuba;


import com.kuba.exeptions.MovieAlreadyExistsException;
import com.kuba.exeptions.NullCustomerException;
import com.kuba.exeptions.NullMovieException;

import java.io.IOException;
import java.util.Date;

public class MovieRentalMain {
    public static void main(String[] args) throws NullCustomerException, NullMovieException, MovieAlreadyExistsException {
        MovieRental movieRental = new MovieRental();
        movieRental.printAllData();

        System.out.println("dodaję klienta");
        movieRental.addCustomer(new Customer("1234", "Adam", "Kowalski", "Wrocław", new Date()));
        System.out.println("dodaję film");
        movieRental.addMovie(new Movie("Terminator", "Action", "BLA"));
        System.out.println("dodaję wypożyczenie");
        movieRental.addRent(new Rent(0,0));

        movieRental.printAllData();


    }
}