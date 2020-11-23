package co.g2academy.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfigStore {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("server" , "localhost");
        prop.setProperty("port", "666");

        try {
            FileOutputStream out = new FileOutputStream("config.properties");
            prop.store(out , null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
