package com.kuba;

import com.kuba.exeptions.NullCustomerException;
import org.junit.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;


public class addCustomer_simpleCase {

    @Test
    public void CustomerAdd_Simple() throws NullCustomerException, IOException {

        //giv

        MovieRental wypo = new MovieRental();
        Customer customer1 = new Customer("1234", "Kowalski", "Janusz", "Warszawa", new Date());

        //when
        wypo.addCustomer(customer1);

        //then

        assertEquals(1, wypo.getCustomers().size());
        assertTrue(wypo.getCustomers().contains(customer1));

//    }
//
//
//    @Test
//    public void CustomerCSV_simple() throws IOException {
//
//
//        Date testData = new Date();
//
//        Customer customer1 = new Customer("1234", "Kowalski", "Janusz", "Warszawa", testData);
//
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//
////
////
////       String testCSV =  customer1.toCVSString();
////        System.out.println(customer1.toCVSString());
//
//
//       assertEquals(testCSV , customer1.getId() + ",1234,Kowalski,Janusz,Warszawa," + sf.format(testData));
//
//
//    }
//
//
//    @Test
//    public void Customer_String_case() throws IOException {
//
//        Date testData = new Date();
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//
//
//        Customer customer1 = new Customer("1234", "Kowalski", "Janusz", "Warszawa", testData);
//
//        String text = "0,1234,Kowalski,Janusz,Warszawa," + sf.format(testData);
//
//
//
//        assertEquals(customer1.toCVSString(), text);
//
//
//
//
//
//    }
//
//}
    }}