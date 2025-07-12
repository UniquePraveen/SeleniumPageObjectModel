package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

    FileInputStream fis = null;

    public Properties readPropertyFile(String fileName) {

        try {
            fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//" + fileName + ".properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Properties prop = new Properties();

        try {
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return prop;

    }

    public String returnProperty(String filename, String key){
        return readPropertyFile(filename).getProperty(key);
    }
}
