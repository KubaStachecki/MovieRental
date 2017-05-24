package com.kuba;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-05-24.
 */
public class IdReaderTest {

    @Test
    public void IdReader_Simple() throws IOException {

        int t = IdReader.readIdFromFile("Customers.csv");

        assertEquals(t, 3);



    }

}