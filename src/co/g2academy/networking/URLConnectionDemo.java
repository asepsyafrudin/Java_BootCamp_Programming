package co.g2academy.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.vidio.com/categories/29-tv-show");
            URLConnection connection = url.openConnection();
            InputStream in = connection.getInputStream();
            int i ;
            while ((i=in.read())!=-1) {
                System.out.print((char) i);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
