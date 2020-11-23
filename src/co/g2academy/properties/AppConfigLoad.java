package co.g2academy.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AppConfigLoad {
    public static void main(String[] args) {
        Properties prop = new Properties();
        FileInputStream in = null;
        try {
            in = new FileInputStream("config.properties");
            prop.load(in);
            String server = prop.getProperty("server");
            String port = prop.getProperty("port");
            System.out.println(server);
            System.out.println(port);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
