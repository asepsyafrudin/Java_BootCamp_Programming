package co.g2academy.io;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress iA = InetAddress.getByName("www.javatpoint.com");
        System.out.println("HostName : " + iA.getHostName());
        System.out.println("IP Address : " + iA.getHostAddress());
    }
}
