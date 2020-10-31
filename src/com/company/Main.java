package com.company;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Scanner;

/* Marco Aurelio
*   null-cmd 31/10/2020 */


public class Main {
   public static String to;
   public static String subject;
   public static String bodyMessage;

    public static void main(String[] args) {

        /*Input data*/
        System.out.println("###### Teste - SMTP email #########\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Para: ");

        to = input.nextLine();

        System.out.print("Titulo: ");

        subject = input.nextLine();

        System.out.println("\nMensagem: ");
        bodyMessage = input.nextLine();

        /*Setting smpt protocol*/
        Properties props = new Properties();
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EmailConfig.emailFrom, EmailConfig.passwordFrom);
            }
        });

        /*Configure object message with data of email*/
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(EmailConfig.emailFrom));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(bodyMessage);

            try{
                /*Send email using Transport.send(message)*/
                Transport.send(message);
                System.out.println("### Aguarde a chegada da mensagem!! #####");
            } catch (MessagingException e) {
                e.printStackTrace();
            }

        } catch (MessagingException e) {
            e.printStackTrace();
        }



    }


}
