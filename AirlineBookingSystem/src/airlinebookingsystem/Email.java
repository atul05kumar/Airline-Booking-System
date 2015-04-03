
package airlinebookingsystem;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Email {
    
      String username = "atulvermaonmail@gmail.com";
      String password = "luckyis*no.1";
      Properties props = new Properties();
      
      void sendEmail(String to,String pass) throws MessagingException
      {
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        
        Session session = Session.getInstance(props,new javax.mail.Authenticator() {

        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(username,password);
        }
        });
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("atulvermaonmail@gmail.com"));//from email address
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Airline Booking System");
            message.setContent("<h:body style =background-color:white> " + "Dear User Your password is : " +pass + "</body>","text/html;  charset=utf-8");
            Transport.send(message);
            System.out.println("Message Sent");
        
    }
      
     void sendTicket(String to,String [] m) throws MessagingException
      {
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        
        Session session = Session.getInstance(props,new javax.mail.Authenticator() {

        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(username,password);
        }
        });
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("atulvermaonmail@gmail.com"));//from email address
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Password Recovery-Airline Booking System");
            message.setContent("Dear "+m[9]+"<BR/>       You Have Successfully Completed Your Booking!<br/> The Details of Your Reservation are as Follows :<br/>"
                    + "Reservation ID :"+m[0]+"<br/> Flight ID : "+m[1]+"<br/>AirLine : "+m[2]+"<br/>Departure Time :"+m[4]+"<br/>Airport :"+m[7]+"<br/>"
                    + "Arrives At :"+m[3]+"<br/>Airport :"+m[8]+" <br/> No. of Passenger Travelling : "+m[5]+"<br/>Total Amount Paid :"+m[6]+"<br/><br/>Thank you for using "
                    + "Airline Booking System","text/html;  charset=utf-8");
            Transport.send(message);
            System.out.println("Message Sent");
        
    }
      
      
}
    

