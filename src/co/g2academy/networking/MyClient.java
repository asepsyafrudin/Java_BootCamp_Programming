package co.g2academy.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            while(true) {
                Socket s = new Socket("localhost", 6666);
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                System.out.print("Say to server : ");
                dos.writeUTF(scan.nextLine());
                dos.flush();

                DataInputStream dis = new DataInputStream(s.getInputStream());
                String serverAnswer = (String)dis.readUTF();





                System.out.println("Message from Sever : " + serverAnswer);


                dos.close();
                dis.close();
                s.close();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
