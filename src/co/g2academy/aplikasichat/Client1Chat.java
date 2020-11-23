package co.g2academy.aplikasichat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1Chat {
    public static void main(String[] args) throws Exception{

    Scanner scan = new Scanner(System.in);

    while(true) {
        Socket s = new Socket("localhost", 3000);
        DataOutputStream dataOutputClient1 = new DataOutputStream(s.getOutputStream());
        System.out.print("Enter Your Message Here : ");
        dataOutputClient1.writeUTF(scan.nextLine());
        dataOutputClient1.flush();

        DataInputStream dataInput = new DataInputStream(s.getInputStream());
        String messageServer = (String) dataInput.readUTF();
        System.out.println(messageServer);

        dataInput.close();
        dataOutputClient1.close();
        s.close();
    }



    }
}
