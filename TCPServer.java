import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        int port = 6789; // Port for communication

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("TCP Server is running on port " + port);

            while (true) {
                // Accept client connection
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                // Read data from client
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String receivedMessage = in.readLine();
                System.out.println("Received: " + receivedMessage);

                // Send response
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                out.println("Server received: " + receivedMessage);

                // Close connection
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
