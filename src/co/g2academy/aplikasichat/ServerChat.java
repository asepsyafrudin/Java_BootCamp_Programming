package co.g2academy.aplikasichat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {

    public static void main(String[] args) throws Exception{
        try{
            ServerSocket ss = new ServerSocket(3000);
            while(true) {
                Socket s = ss.accept();
                DataInputStream dataInput = new DataInputStream(s.getInputStream());
                DataOutputStream dataOutput = new DataOutputStream(s.getOutputStream());
                String message = (String)dataInput.readUTF();
                System.out.println(message);

                if(message.toLowerCase().equals("ping")) {
                    dataOutput.writeUTF("pong");
                    dataOutput.flush();
                } else if(message.toLowerCase().equals("shutdown")) {
                    break;
                }
                else {
                    dataOutput.writeUTF(message);
                    dataOutput.flush();
                }

                dataInput.close();
                dataOutput.close();

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
