# TCP Socket Communication in Java

This project demonstrates how to implement a **TCP Socket API** using **Java TCP (Transmission Control Protocol)**. It includes both a **TCP server** and a **TCP client**, allowing reliable and ordered communication over a network.

## Features
- **Connection-oriented communication** using TCP.
- **Server listens** for client connections and responds.
- **Client establishes** a connection, sends a message, and waits for a response.
- Uses Java's `ServerSocket`, `Socket`, `BufferedReader`, and `PrintWriter` for data transmission.

## Requirements
- Java 8 or later
- Any Java IDE (e.g., IntelliJ, Eclipse, or VS Code) or a terminal with `javac`

## Setup & Usage

### 1. Compile the Files
```sh
javac TCPServer.java TCPClient.java
```

### 2. Run the TCP Server
```sh
java TCPServer
```

### 3. Run the TCP Client
```sh
java TCPClient
```

## Code Structure

### TCP Server (`TCPServer.java`)
- Listens on port `6789` for incoming connections.
- Accepts a client connection and reads the data.
- Sends a response back to the client.
- Closes the connection after communication.

### TCP Client (`TCPClient.java`)
- Establishes a connection to `localhost:6789`.
- Sends a message to the server.
- Waits for and prints the server’s response.
- Closes the connection after communication.

## Example Output
### **Server Output**
```sh
TCP Server is running on port 6789
Client connected: /127.0.0.1
Received: Hello from TCP Client
```

### **Client Output**
```sh
Message sent: Hello from TCP Client
Response from server: Server received: Hello from TCP Client
```

## Notes
- The **server must be started before the client**.
- The IP address in `TCPClient.java` can be changed from `localhost` to a remote server IP.
- This program demonstrates **basic TCP communication**; for production use, consider **error handling, multi-threading for multiple clients, and security measures**.

## Author
Ryan Habis

