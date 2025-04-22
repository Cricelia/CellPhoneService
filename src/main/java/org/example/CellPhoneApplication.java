package org.example;

import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner asking = new Scanner(System.in);

        Cellphone phone = new Cellphone("54555169", "Galaxy 22", "AT&T", "800-145-2145", "Greg");
        Cellphone phone1 = new Cellphone("2637418", "Galaxy 1", "T-mobile", "800-540-3718", "Sandy");

       /* System.out.println("Please answer the questions below");
        System.out.println("What is the serial number? ");
        String serialNumber = asking.nextLine();
        phone.setSerialNumber(serialNumber);
        System.out.println("What model is the phone?");
        String model = asking.nextLine();
        phone.setModel(model);
        System.out.println("Who is the carrier?");
        String carrier = asking.nextLine();
        phone.setCarrier(carrier);
        System.out.println("What is the phone number?");
        String phoneNumber = asking.nextLine();
        phone.setPhoneNumber(phoneNumber);
        System.out.println("Who is the owner of the phone?");
        String owner = asking.nextLine();
        phone.setOwner(owner); */



        display(phone, phone1);
        display(phone1, phone1);

        phone.dial(phone1.getPhoneNumber());
        phone1.dial( phone.getPhoneNumber() );



    }
        public static void display(Cellphone phone, Cellphone phone1) {


            System.out.println("Serial Number: " + phone.getSerialNumber());
            System.out.println("Model: " + phone.getModel());
            System.out.println("Carrier: " + phone.getCarrier());
            System.out.println("Phone #: " + phone.getPhoneNumber());
            System.out.println("Owner: " + phone.getOwner());

        }


    }

