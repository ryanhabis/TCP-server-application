import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        String serverIP = "localhost"; // Server's IP address
        int serverPort = 6789; // Must match the server's port

        try (Socket socket = new Socket(serverIP, serverPort);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            // Send message to server
            String message = "Hello from TCP Client";
            out.println(message);
            System.out.println("Message sent: " + message);

            // Receive response from server
            String response = in.readLine();
            System.out.println("Response from server: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
