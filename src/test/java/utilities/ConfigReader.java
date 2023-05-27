package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    public static Properties properties;


    static {
        String filePath= "src/test/Configrations.properties";
        properties=new Properties();
        try {
            FileInputStream fis=new FileInputStream(filePath);
            properties.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String getProperty(String key){

        return properties.getProperty(key);
    }

}