package com.kuba;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class DataFileWriter {

    public static void main(String[] args) throws IOException {
//        Date testData = new Date();
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//
//
//        Customer customer1 = new Customer("1234", "Kowalski", "Janusz", "Warszawa", testData);
//        Customer customer2 = new Customer("65", "gfgf", "dfg", "dfgdg", testData);
//        Customer customer3 = new Customer("456", "dfgdfg", "dfgdfgdfg", "fdgdfg", testData);
//
//        List<Customer> test1 = new ArrayList<>() ;
//
//        test1.add(customer1);
//        test1.add(customer2);
//        test1.add(customer3);
//
//        writeCustomersToFile("Customers.csv",test1);
    }

    public static void writeCustomersToFile(String fileName, List<Customer> customers) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);

            for (Customer customer : customers) {
                fileWriter.write(customer.toCVSString() + System.lineSeparator());
                // prawie to samo co:
//				fileWriter.write(customer.toCSVString() + "\n");
            }

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



}}
