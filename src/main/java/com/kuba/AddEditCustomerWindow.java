package com.kuba;

import com.kuba.exeptions.NullCustomerException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by RENT on 2017-05-24.
 */
public class AddEditCustomerWindow extends JFrame {


    public AddEditCustomerWindow(MovieRental rental1, RentalGUI mainGUI, Customer toEdit) {


        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(200, 400);
        setLayout(null);


        JTextField txtFirstName = new JTextField("imie");
        txtFirstName.setSize(200, 50);
        txtFirstName.setLocation(0, 0);
        add(txtFirstName);


        JTextField txtLastName = new JTextField("nazwisko");
        txtLastName.setSize(200, 50);
        txtLastName.setLocation(0, 60);
        add(txtLastName);

        JTextField txtCity = new JTextField("miasto");
        txtCity.setSize(200, 50);
        txtCity.setLocation(0, 130);
        add(txtCity);

        JTextField txtPesel = new JTextField("pesel");
        txtPesel.setSize(200, 50);
        txtPesel.setLocation(0, 190);
        add(txtPesel);



        String butt = "";
        if(toEdit == null){
         butt = "dodaj";}else{ butt = "edutuj";}

        JButton btnAddCustomer = new JButton(butt);
        btnAddCustomer.setSize(200, 50);
        btnAddCustomer.setLocation(0, 280);
        add(btnAddCustomer);


        btnAddCustomer.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (toEdit == null) {



                    Customer buttAction = new Customer(txtPesel.getText(), txtFirstName.getText(), txtLastName.getText(), txtCity.getText(), new Date());
                    try {
                        rental1.addCustomer(buttAction);
                    } catch (NullCustomerException e1) {
                        e1.printStackTrace();
                    }
                    rental1.printAllData();
                    JOptionPane.showMessageDialog(btnAddCustomer, "Dodales klienta");

                }



                else{


                    toEdit.setCity(txtCity.getText());
                    toEdit.setFirstName(txtFirstName.getText());
                    toEdit.setPesel(txtPesel.getText());
                    toEdit.setLastName(txtLastName.getText());

                    JOptionPane.showMessageDialog(btnAddCustomer, "udalo sie zmienic dane");




                }

                mainGUI.showCustomers();

                setVisible(false);
                dispose();}


            }
        );


    }
}
