package com.kuba;

import com.kuba.exeptions.MovieAlreadyExistsException;
import com.kuba.exeptions.NullMovieException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-05-22.
 */
public class MovieRentalTest_simple {

    @Test
    public void CustomerAdd_Simple() throws NullMovieException, MovieAlreadyExistsException {

        //giv

        MovieRental wypo = new MovieRental();
        Movie movie = new Movie("Tytanic", "romans", "nudny jak cholera");

        //when
        wypo.addMovie(movie);

        //then

        assertEquals(1, wypo.getMovies().size());
        assertTrue(wypo.getMovies().contains(movie));

    }

        @Test(expected = MovieAlreadyExistsException.class)
        public void CustomerAdd_Double() throws NullMovieException, MovieAlreadyExistsException {

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