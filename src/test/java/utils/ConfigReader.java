package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConfigReader {

    private static final Logger LOGGER = Logger.getLogger(ConfigReader.class.getName());
    private static final Properties PROPERTIES = new Properties();
    private static final String PROPERTY_FILE_PATH = "src/test/resources/config.properties";

    // STATIC BLOCK TO LOAD PROPERTIES ON CLASS LOAD
    static {
        loadProperties();
    }

    /**
     * LOADS THE CONFIGURATION PROPERTIES FILE.
     */
    private static void loadProperties() {
        LOGGER.info(() -> "[CONFIG] LOADING CONFIGURATION PROPERTIES FROM: " + PROPERTY_FILE_PATH);

        try (InputStream inputStream = new FileInputStream(PROPERTY_FILE_PATH)) {
            PROPERTIES.load(inputStream);
            LOGGER.info("[CONFIG] CONFIGURATION PROPERTIES LOADED SUCCESSFULLY.");
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE,
                    "[CONFIG] FAILED TO LOAD CONFIGURATION PROPERTIES FILE AT: " + PROPERTY_FILE_PATH, e);
            throw new RuntimeException("CONFIGURATION PROPERTIES FILE CANNOT BE FOUND AT: " + PROPERTY_FILE_PATH, e);
        }
    }

    /**
     * FETCH A PROPERTY VALUE BY KEY.
     *
     * @param key THE KEY TO LOOK UP IN THE PROPERTIES FILE.
     * @return THE VALUE ASSOCIATED WITH THE PROVIDED KEY.
     */
    public static String getProperty(String key) {
        LOGGER.info(() -> "[CONFIG] FETCHING PROPERTY VALUE FOR KEY: " + key.toUpperCase());

        String value = PROPERTIES.getProperty(key);

        if (value != null) {
            LOGGER.info(() -> "[CONFIG] PROPERTY FOUND - " + key.toUpperCase() + ": " + value);
            return value;
        } else {
            LOGGER.severe(() -> "[CONFIG] PROPERTY KEY NOT FOUND IN CONFIG FILE: " + key.toUpperCase());
            throw new RuntimeException("PROPERTY KEY NOT FOUND IN CONFIG FILE: " + key);
        }
    }
}
