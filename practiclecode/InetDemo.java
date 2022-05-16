package practiclecode;

import java.io.*;
import java.net.*;
public class InetDemo{
    public static void main(String args[]){
        try{
            InetAddress ip = InetAddress.getByName("www.google.com");

            System.out.print("Host name:" + ip.getHostName());
            System.out.println("Host Address:" + ip.getHostAddress());

        }catch(UnknownHostException e){
            System.out.println(e);


        }
    }
}	