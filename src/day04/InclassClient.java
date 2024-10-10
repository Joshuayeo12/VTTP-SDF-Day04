package day04;

import java.io.*;
import java.net.*;
import Reader;

public class InclassClient {
    public static void main(String[] args) throws IOException {

        File mp3File = new File("test.mp3");

        // Set the default port to 3000
        int port = 3000;
        if (args.length > 0)
           port = Integer.parseInt(args[0]);
  
        // Create a connection to the server
        // Connect to the port on the server
        // localhost - 127.0.0.1
        System.out.println("Connecting to the server");
        Socket sock = new Socket("localhost", port);
  
        System.out.println("Connected!");
        
        Console cons = System.console();
        // Write a message to the server
        String theMessage = cons.readLine("input: ");
  


    
}
