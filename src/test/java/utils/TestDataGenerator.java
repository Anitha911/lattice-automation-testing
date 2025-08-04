package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TestDataGenerator {

    private final Random random = new Random();

    // Generate an email with a timestamp
    public String generateTimestampedEmail() {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        return "user_" + timestamp + "@example.com";
    }

    // Generate a random phone number
    public String generatePhoneNumber() {
        return "03" + (random.nextInt(900000000) + 100000000);
    }

    // Generate a random name
    public String generateRandomName() {
        String[] names = {"John", "Jane", "Alice", "Bob", "Charlie", "Daisy"};
        return names[random.nextInt(names.length)] + " " + (char)(random.nextInt(26) + 'A') + ".";
    }

    // Generate a random company name
    public String generateCompanyName() {
        String[] companies = {"Acme Corp", "Globex Inc", "Initech", "Umbrella Corp", "Wayne Enterprises"};
        return companies[random.nextInt(companies.length)];
    }

    // Generate a random address
    public String generateAddress() {
        return (random.nextInt(999) + 1) + " Test Street, Test City";
    }

    // Generate a designation
    public String generateDesignation() {
        String[] roles = {"QA Engineer", "Software Developer", "Project Manager", "Business Analyst"};
        return roles[random.nextInt(roles.length)];
    }
}
