import java.io.*;
import java.net.*;
import java.util.Scanner;
public class TCPClientServerChat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Run as (1) Server or (2) Client?");
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        if (choice == 1) {
            runServer();
        } else {
            runClient();
        }
    }
    public static void runServer() {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server started. Waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");
            handleChat(socket, "Client");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void runClient() {
        try (Socket socket = new Socket("localhost", 1234)) {
            System.out.println("Connected to server.");
            handleChat(socket, "Server");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void handleChat(Socket socket, String peerName) {
        try (
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String msg;
            while (true) {
                System.out.print("You: ");
                output.println(console.readLine());
                msg = input.readLine();
                if (msg == null) break;
                System.out.println(peerName + ": " + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

