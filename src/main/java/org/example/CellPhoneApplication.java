package org.example;

import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner asking = new Scanner(System.in);

        Cellphone phone = new Cellphone("54555169", "Galaxy 22", "AT&T", "800-145-2145", "Greg");
        Cellphone phone1 = new Cellphone("2637418", "Galaxy 1", "T-mobile", "800-540-3718", "Sandy");

        Cellphone phone2 = new Cellphone(10220205, "Galaxy21", "AT&T", "800-136-1520", "Philip");

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



        display(phone);
        display(phone1);
        display(phone2);

        phone.dial(phone1.getPhoneNumber());
        phone1.dial( phone.getPhoneNumber() );
        phone2.dial(phone.getPhoneNumber());

    }
        public static void display(Cellphone cellphone) {


            System.out.println("Serial Number: " + cellphone.getSerialNumber());
            System.out.println("Model: " + cellphone.getModel());
            System.out.println("Carrier: " + cellphone.getCarrier());
            System.out.println("Phone #: " + cellphone.getPhoneNumber());
            System.out.println("Owner: " + cellphone.getOwner());

        }


    }

