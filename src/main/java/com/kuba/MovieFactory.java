package com.kuba;

import java.text.ParseException;

/**
 * Created by RENT on 2017-05-24.
 */
public class MovieFactory implements MyFactory<Movie> {
    @Override
    public Movie create(String text) {
        try {
            return new Movie(text);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}