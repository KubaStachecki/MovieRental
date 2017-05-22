package com.kuba;

import com.kuba.exeptions.MovieAlreadyExistsExeption;
import com.kuba.exeptions.NullCustomerExeption;
import com.kuba.exeptions.NullMovieExeption;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-05-22.
 */
public class MovieRentalTest_simple {

    @Test
    public void CustomerAdd_Simple() throws NullMovieExeption, MovieAlreadyExistsExeption {

        //giv

        MovieRental wypo = new MovieRental();
        Movie movie = new Movie("Tytanic", "romans", "nudny jak cholera");

        //when
        wypo.addMovie(movie);

        //then

        assertEquals(1, wypo.getMovies().size());
        assertTrue(wypo.getMovies().contains(movie));

    }

        @Test(expected = MovieAlreadyExistsExeption.class)
        public void CustomerAdd_Double() throws NullMovieExeption, MovieAlreadyExistsExeption {

            //giv

            MovieRental wypo = new MovieRental();
            Movie movie = new Movie("Tytanic", "romans", "nudny jak cholera");

            //when
            wypo.addMovie(movie);
            wypo.addMovie(movie);

            //then

            assertEquals(1, wypo.getMovies().size());
            assertTrue(wypo.getMovies().contains(movie));




    }

}