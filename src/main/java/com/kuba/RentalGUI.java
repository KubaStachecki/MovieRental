package com.kuba;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class RentalGUI extends JFrame {

    public MovieRental rental1;
    private List<Customer> customers;
    private JList<Customer> customerJlist = new JList<>();
    private JList movieJlist = new JList<>();
    private JList rentJlist = new JList<>();


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
      //  setSize(600, 400);
        setLayout(null);


        showCustomers();
        showMovies();
        showRents();

JScrollPane csp = new JScrollPane(customerJlist);
csp.setPreferredSize(new Dimension(300,300));



        customerJlist.setSize(300, 300);
        customerJlist.setLocation(1, 0);
        add(customerJlist);

        movieJlist.setSize(300, 300);
        movieJlist.setLocation(320, 0);
        add(movieJlist);

        rentJlist.setSize(300, 300);
        rentJlist.setLocation(640, 0);
        add(rentJlist);

        RentalGUI rentalGUI = this;


        JButton btnShow = new JButton("Odswiez listy");
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
        JButton btnCreateCustomer = new JButton("Dodaj Customera");
        btnCreateCustomer.setSize(200, 50);
        btnCreateCustomer.setLocation(400, 400);
        add(btnCreateCustomer);
//
        JButton changeCustomer = new JButton("Edytuj Klienta");
        changeCustomer.setSize(200, 50);
        changeCustomer.setLocation(400, 500);
        add(changeCustomer);

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
        changeCustomer.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Customer selectedCustomer =  customerJlist.getSelectedValue();

                if (selectedCustomer == null) {
                    JOptionPane.showMessageDialog(changeCustomer, "zaden nie jest zaznaczony");
                }

                AddEditCustomerWindow add = new AddEditCustomerWindow(rental1, rentalGUI, selectedCustomer);

            }
            });
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

        btnCreateCustomer.addActionListener(new

            AbstractAction() {
                @Override
                public void actionPerformed (ActionEvent e){

                    AddEditCustomerWindow add = new AddEditCustomerWindow(rental1, rentalGUI, null);

                }
            });
//
//

        btnShow.addActionListener(new

            AbstractAction() {
                @Override
                public void actionPerformed (ActionEvent e){
                    showCustomers();
                    showMovies();
                    showRents();

                }
            });

            repaint();
        }

    public void showCustomers() {
        List<Customer> customers2 = rental1.getCustomers();

        Customer[] customersArray = customers2.toArray(new Customer[customers2.size()]);

     //  JList<Customer> customerJlist = new JList<>();
        customerJlist.setListData(customersArray);


    }

    private void showMovies() {
        List<Movie> movies2 = rental1.getMovies();

        Movie[] moviesArray = movies2.toArray(new Movie[movies2.size()]);

     //   movieJlist = new JList<>();
        movieJlist.setListData(moviesArray);


    }

    private void showRents() {
        List<Rent> rents2 = rental1.getRents();

        Rent[] rentsArray = rents2.toArray(new Rent[rents2.size()]);

      //  rentJlist = new JList<>();
        rentJlist.setListData(rentsArray);


    }
}









