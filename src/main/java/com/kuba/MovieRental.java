package com.kuba;

import com.kuba.exeptions.MovieAlreadyExistsExeption;
import com.kuba.exeptions.NullCustomerExeption;
import com.kuba.exeptions.NullMovieExeption;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieRental {

    private  List<Customer> customers;
    private  List<Rent> rents;
    private  List<Movie> movies;

    public MovieRental() {

        try {
            this.customers = DataFileReader.readCustomersFromFile("Customers.csv");
        } catch (IOException e) {
            System.err.println("Blad wczytywania customerow z pliku - plik pusty");
            this.customers = new ArrayList<>();
        }
        this.rents = new ArrayList<>();
        this.movies = new ArrayList<>();





    }

    public MovieRental(List<Customer> customers, List<Rent> rents, List<Movie> movies) {
        this.customers = customers;
        this.rents = rents;
        this.movies = movies;
    }

    public void addCustomer(Customer customer) throws NullCustomerExeption {
        if (customer == null) {
            throw new NullCustomerExeption();
        }

         customers.add(customer);

    }

    public void addMovie(Movie movie) throws NullMovieExeption, MovieAlreadyExistsExeption {

        if(movie == null){throw new NullMovieExeption();}


        if(movies.contains(movie)){throw new MovieAlreadyExistsExeption();}

        movies.add(movie);



    }

    public void rent(Rent rent){
        // TODO handle errors
        rents.add(rent);

    }


    public void printAllData() {


        System.out.println("____CUSTOMERS___");
        System.out.println(Arrays.toString(customers.toArray()));
        System.out.println("___ MOVIES ____");
        System.out.println(Arrays.toString(movies.toArray()));
        System.out.println("___RENTS___");
        System.out.println(Arrays.toString(rents.toArray()));


    }




    //_________________________________//



    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Rent> getRents() {
        return rents;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
