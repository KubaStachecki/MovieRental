package com.kuba;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-05-23.
 */
public class DataFileReader {

    public static List<Customer> readCustomersFromFile(String fileName) throws IOException {

        List<Customer> customers = new ArrayList<>();



            List<String> fileLines = Files.readLines(new File(fileName), Charsets.UTF_8);

            for (String line : fileLines) {

                Customer customer = null;
                try {


                    customer = new Customer(line);



                } catch (ParseException e) {
                    throw new IOException();
                }
                customers.add(customer);

            }



        return customers;


    }


}
