package co.g2academy.networking;

import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.vidio.com/categories/29-tv-show");
        System.out.println("Protocol : " + url.getProtocol());
        System.out.println("Host Name : " + url.getHost());
        System.out.println("Port Number : " + url.getPort());
        System.out.println("Default Port Number : " + url.getDefaultPort());
        System.out.println("Query String : " + url.getQuery());
        System.out.println("Path : " + url.getPath());
        System.out.println("File : " + url.getFile());
        System.out.println(url);
    }
}
