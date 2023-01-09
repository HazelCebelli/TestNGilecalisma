package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static{

        try {

            FileInputStream fis=new FileInputStream("onfiguration.properties");

            properties=new Properties();
            properties.load(fis);

        } catch (IOException e) {
            System.out.println("properties dosyasi okunamadi");
        }
    }


        public static String getProperty(String key){
            return properties.getProperty(key);
        }


}
