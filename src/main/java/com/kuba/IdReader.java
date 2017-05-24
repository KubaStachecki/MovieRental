package com.kuba;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class IdReader {

    public static int readIdFromFile(String fileName) throws IOException {

        List<Customer> customers = new ArrayList<>();

        List<String> fileLines = Files.readLines(new File(fileName), Charsets.UTF_8);

       String last = fileLines.get(fileLines.size() - 1);

       String [] lastArr = last.split(",");

       int lastIndex = Integer.parseInt(lastArr[0]);

        return lastIndex;


    }




}
