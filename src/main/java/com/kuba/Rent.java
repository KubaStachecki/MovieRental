package com.kuba;


import java.util.Date;

public class Rent {

    private int customerId;
    private int movieId;
    private Date date;

    public Rent(int customerId, int movieId, Date date) {
        this.customerId = customerId;
        this.movieId = movieId;
        this.date = new Date();
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getMovieId() {
        return movieId;
    }

    public Date getDate() {
        return date;
    }
}
