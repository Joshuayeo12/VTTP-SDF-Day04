package day04;

import java.io.File;


public class InclassServer {
public static void main(String[] args) throws IOException {
    
    
    File photo = new File (photo);
    
    // Set the default port to 3000
    int port = 3000;
    if (args.length > 0)
       port = Integer.parseInt(args[0]);

    // Create a server port, TCP
    ServerSocket server = new ServerSocket(port);

  while (true) {
      
  
    // Wait for an incoming connection
    System.out.printf("[%s] Waiting for connection on port %d\n", threadName, port);
    //most impt code
    Socket sock = server.accept();

    System.out.println("Got a new connection");

//set up both client and server, then get the input and output stream. get the connection done.
// then 


}


    
}
