package com.kuba;

import com.kuba.exeptions.MovieAlreadyExistsExeption;
import com.kuba.exeptions.NullCustomerExeption;
import com.kuba.exeptions.NullMovieExeption;

import java.util.ArrayList;
import java.util.List;

public class MovieRental {

    private  List<Customer> customers;
    private  List<Rent> rents;
    private  List<Movie> movies;

    public MovieRental() {

        this.customers = new ArrayList<>();
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
