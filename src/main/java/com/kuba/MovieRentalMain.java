package com.kuba;


import com.kuba.exeptions.NullCustomerExeption;

import java.util.Arrays;
import java.util.Date;

public class MovieRentalMain {

    public static void main(String[] args) {


Date data = new Date();


        Date testData = new Date();

        Customer customer1 = new Customer("1234", "Kowalski", "Janusz", "Warszawa", testData);

        System.out.println(customer1.toCVSString());




    }
}
