package com.kuba;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.List;

public class RentalGUI extends JFrame {

    private MovieRental rental1;
    private List<Customer> customers;
    private JList customerJlist = new JList<>();


    public static void main(String[] args) {

        MovieRental rental1 = new MovieRental();


        new RentalGUI(rental1);
    }


    // private MovieRental rental1;

    //private List<Customer> customerList = rental1.getCustomers();
    //private JList<Customer> customerJList;// = customerList.toArray();


    public RentalGUI(MovieRental rental1) {

        this.rental1 = rental1;

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(null);


        showCustomers();


        customerJlist.setSize(800, 300);
        customerJlist.setLocation(0, 0);
        add(customerJlist);


        JButton btnShow = new JButton("Odswiez liste customerow");
        btnShow.setSize(200, 50);
        btnShow.setLocation(0, 350);
        add(btnShow);
//
//        JLabel lblBrand = new JLabel("Brand");
//        lblBrand.setSize(200, 50);
//        lblBrand.setLocation(300, 0);
//        add(lblBrand);
//
//        JTextField txtBrand = new JTextField();
//        txtBrand.setSize(200, 50);
//        txtBrand.setLocation(300, 50);
//        add(txtBrand);
//
//        JLabel lblModel = new JLabel("Model");
//        lblModel.setSize(200, 50);
//        lblModel.setLocation(300, 100);
//        add(lblModel);
//
//        JTextField txtModel = new JTextField();
//        txtModel.setSize(200, 50);
//        txtModel.setLocation(300, 150);
//        add(txtModel);
//
//        JLabel lblYear = new JLabel("Manufacture year");
//        lblYear.setSize(200, 50);
//        lblYear.setLocation(300, 200);
//        add(lblYear);
//
//        JTextField txtYear = new JTextField();
//        txtYear.setSize(200, 50);
//        txtYear.setLocation(300, 250);
//        add(txtYear);
//
//        JLabel lblPower = new JLabel("Power");
//        lblPower.setSize(200, 50);
//        lblPower.setLocation(300, 300);
//        add(lblPower);
//
//        JTextField txtPower = new JTextField();
//        txtPower.setSize(200, 50);
//        txtPower.setLocation(300, 350);
//        add(txtPower);
//
//        JButton btnCreateCar = new JButton("Stwórz nowy");
//        btnCreateCar.setSize(200, 50);
//        btnCreateCar.setLocation(400, 400);
//        add(btnCreateCar);
//
//        JButton btnSaveChanges = new JButton("Zapisz zmiany");
//        btnSaveChanges.setSize(200, 50);
//        btnSaveChanges.setLocation(400, 500);
//        add(btnSaveChanges);
//
//        JButton btnSaveToFile = new JButton("Zapisz do pliku");
//        btnSaveToFile.setSize(200, 50);
//        btnSaveToFile.setLocation(0, 400);
//        add(btnSaveToFile);
//
//        JButton btnReadFromFile = new JButton("Wczytaj z pliku");
//        btnReadFromFile.setSize(200, 50);
//        btnReadFromFile.setLocation(0, 450);
//        add(btnReadFromFile);
//
//        JButton btnDeleteCar = new JButton("Usuń samochód");
//        btnDeleteCar.setSize(200, 50);
//        btnDeleteCar.setLocation(0, 500);
//        add(btnDeleteCar);

//        btnDeleteCar.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//
//        btnReadFromFile.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//
//        btnSaveToFile.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//
//
//        btnSaveChanges.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//
//
//            }
//        });
//
//        btnCreateCar.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//
//
//
        btnShow.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCustomers();

            }
        });

        repaint();
    }

    private void showCustomers() {
        List<Customer> customers2 = rental1.getCustomers();

        Customer[] customersArray = customers2.toArray(new Customer[customers2.size()]);

        customerJlist = new JList<>();
        customerJlist.setListData(customersArray);


        //   customerJList = new JList(customers);


    }
}









