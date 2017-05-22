package com.kuba;

import com.kuba.exeptions.NullCustomerExeption;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

import static org.junit.Assert.*;


public class addCustomer_simpleCase {

    @Test
    public void CustomerAdd_Simple() throws NullCustomerExeption {

        //giv

        MovieRental wypo = new MovieRental();
        Customer customer1 = new Customer("1234", "Kowalski", "Janusz", "Warszawa", new Date());

        //when
        wypo.addCustomer(customer1);

        //then

        assertEquals(1, wypo.getCustomers().size());
        assertTrue(wypo.getCustomers().contains(customer1));

    }


    @Test
    public void CustomerCSV_simple() {


        Date testData = new Date();

        Customer customer1 = new Customer("1234", "Kowalski", "Janusz", "Warszawa", testData);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");



       String testCSV =  customer1.toCVSString();
        System.out.println(customer1.toCVSString());


       assertEquals(testCSV , customer1.getId() + ",1234,Kowalski,Janusz,Warszawa," + sf.format(testData));


    }

}