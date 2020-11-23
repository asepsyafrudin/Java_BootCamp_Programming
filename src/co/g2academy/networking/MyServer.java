package co.g2academy.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(6666);

            while(true) {
                Socket s = ss.accept(); //establish connection from client;
                DataInputStream dis = new DataInputStream(s.getInputStream());
                String messageCLient = (String)dis.readUTF();
                System.out.println("Message from Client = " + messageCLient);

                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                dos.writeUTF("Hai Kamu Telah Terhubung ke Server");
                dos.flush();

                dis.close();
                dos.close();

            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
