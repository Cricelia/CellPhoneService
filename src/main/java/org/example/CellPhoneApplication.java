package org.example;

import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner asking = new Scanner(System.in);

            Cellphone phone = new Cellphone("", "", "", "");

            System.out.println("Please answer the questions below");
            System.out.println("What is the serial number? ");
            asking.nextLine();
            phone.setSerialNumber("0");
            System.out.println("What model is the phone?");
            asking.nextLine();
            phone.setModel(" ");
            System.out.println("Who is the carrier?");
            asking.nextLine();
            phone.setCarrier(" ");
            System.out.println("What is the phone number?");
            asking.nextLine();
            phone.setPhoneNumber(" ");
            System.out.println("Who is the owner of the phone?");
            asking.nextLine();
            phone.setOwner(" ");


            System.out.println(phone.getSerialNumber());
            System.out.println(phone.getModel());
            System.out.println(phone.getCarrier());
            System.out.println(phone.getPhoneNumber());
            System.out.println(phone.getOwner());
        }
    }

