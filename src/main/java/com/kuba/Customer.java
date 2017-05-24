package com.kuba;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements CsvObject {

    public static final String CSV_SEPARATOR = ",";
    private String lastName;
    private String firstName;
    private String pesel;
    private String city;
    private Date date;
    private int id;
    private int nextId;


    public Customer(String pesel, String firstName, String lastName, String city, Date date) {
        id = nextId;
        nextId++;

        this.date = date;
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }


    public Customer(String csv) throws ParseException {


        String[] csvSplit = csv.split(",");

        this.date = date;
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.id = id;

        id = Integer.parseInt(csvSplit[0]);
        pesel = csvSplit[1];
        firstName = csvSplit[2];
        lastName = csvSplit[3];
        city = csvSplit[4];

        String dateS =  csvSplit[5];
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        this.date = sdf2.parse(dateS);

    }



    public String toCVSString() {

        StringBuilder sb = new StringBuilder();

        sb.append(id);
        sb.append(CSV_SEPARATOR);
        sb.append(pesel);
        sb.append(CSV_SEPARATOR);
        sb.append(firstName);
        sb.append(CSV_SEPARATOR);
        sb.append(lastName);
        sb.append(CSV_SEPARATOR);
        sb.append(city);
        sb.append(CSV_SEPARATOR);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(date);
        sb.append(formattedDate);

        return sb.toString();

    }


    //______________________________________//

    @Override
    public String toString() {
        return "Customer{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", city='" + city + '\'' +
                ", date=" + date +
                ", id=" + id +
                ", nextId=" + nextId +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
