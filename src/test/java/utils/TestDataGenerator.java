package utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

public class TestDataGenerator {
    private final Random random = new Random();
    // Generate a unique email with timestamp and UUID
    public String generateTimestampedEmail() {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        return "user_" + timestamp + "_" + UUID.randomUUID().toString().substring(0, 5) + "@example.com";
    }

    //Generate Random Email
    public String generateRandomEmail() {
        String[] domains = {"gmail.com", "lattice.com", "glic.com", "yahoo.com", "outlook.com"};
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomName = new StringBuilder();
        Random random = new Random();
        // Generate random 8 character name
        for (int i = 0; i < 8; i++) {
            randomName.append(chars.charAt(random.nextInt(chars.length())));
        }
        // Get random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        return randomName + "@" + randomDomain;
    }

    // Generate a unique phone number
    public String generatePhoneNumber() {
        return "03" + (random.nextInt(900000000) + 100000000) + random.nextInt(10);
    }

    // Generate a unique random name
    public String generatePersonName() {
        String[] names = {"John", "Jane", "Alice", "Bob", "Charlie", "Daisy"};
        return names[random.nextInt(names.length)] + " " + (char)(random.nextInt(26) + 'A') + "."
                + UUID.randomUUID().toString().substring(0, 3);
    }

    // Generate a unique company name
    public String generateCompanyName() {
        String[] companies = {"Acme Corp", "Globex Inc", "Initech", "Umbrella Corp", "Wayne Enterprises"};
        return companies[random.nextInt(companies.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }

    // Generate a unique short name
    public String generateShortName() {
        TestDataGenerator data = new TestDataGenerator();
        return data.generateRandomStringwithLength(5);
    }

    public String generateRandomNumbericwithLength(int length){
        String alphabets ="1234567890";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length;i++){
            sb.append(alphabets.charAt(random.nextInt(alphabets.length())));
        }
        return sb.toString();
    }

    //Generate Unique String with Length
    public String generateRandomStringwithLength(int length){
        String alphabets ="ABCDEFGHIJKLMNOPQRSTUWXYZ";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length;i++){
            sb.append(alphabets.charAt(random.nextInt(alphabets.length())));
        }
        return sb.toString();
    }

    //Genrate Unique .com String with length
    public String generateRandomCOMStringwithLength(int length) {
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            sb.append(alphabets.charAt(random.nextInt(alphabets.length())));
        }

        String randomString = sb.toString().toLowerCase();
        String finalString = randomString.substring(0, 1).toUpperCase() + randomString.substring(1);

        return finalString + ".com";
    }


    // Generate a unique category name
    public String generateCategoryName() {
        TestDataGenerator data = new TestDataGenerator();
        return data.generateRandomStringwithLength(50);
    }

    // Generate a unique address
    public String generateAddress() {
        return (random.nextInt(999) + 1) + " Test Street, Test City " + UUID.randomUUID().toString().substring(0, 4);
    }

    // Generate a unique designation
    public String generateDesignation() {
        String[] roles = {"QA Engineer", "Software Developer", "Project Manager", "Business Analyst"};
        return roles[random.nextInt(roles.length)] + " " + UUID.randomUUID().toString().substring(0, 3);
    }

    // Generate a unique course name
    public String generateCourseName() {
        String[] courses = {"Automation Testing", "Web Development", "Data Science", "Cloud Computing", "Cyber Security"};
        return courses[random.nextInt(courses.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }

    // Generate course details
    public String generateCourseDetails() {
        String[] details = {
                "An in-depth training covering core and advanced topics.",
                "Comprehensive course with hands-on projects.",
                "Introductory and advanced concepts explained clearly.",
                "Covers both theoretical and practical applications.",
                "Focused on real-world problem solving and projects."
        };
        return details[random.nextInt(details.length)];
    }

    // Generate a course category
    public String generateCourseCategory() {
        String[] categories = {"Technology", "Business", "Design", "Marketing", "Management"};
        return categories[random.nextInt(categories.length)];
    }

    // Generate a course link
    public String generateCourseLink() {
        String base = "https://example.com/course/";
        return base + UUID.randomUUID().toString().substring(0, 8);
    }

    // Generate a unique level name
    public String generateLevelName() {
        String[] levels = {"Beginner", "Intermediate", "Advanced", "Expert", "Master"};
        return levels[random.nextInt(levels.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }

    // Generate weightage (0–100 as string)
    public String generateWeightage() {

        return String.valueOf(random.nextInt(101)); // 0–100
    }

    //Generate Single digit (1-9 as String)
    public String generateRandomSingledigit() {

        return String.valueOf(random.nextInt(9) + 1); // 1–9
    }

    //Generate Four digit (0-9999 as String)
    public String generateRandomFourDigit() {
        return String.valueOf(random.nextInt(10000)); // 0–9999
    }

    //Generate RandomCode (A-Z + 0-9 as string)
    public String generateRandomCode(int length) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String allChars = letters + digits;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            // randomly pick from letters + digits
            sb.append(allChars.charAt(random.nextInt(allChars.length())));
        }
        return sb.toString();
    }


    // Generate random frequency - both numbered and fixed
    public String generateRandomFrequencyName() {
        String[] fixedFrequencies = {
                "Yearly", "Half-Yearly", "Quarterly", "Daily", "Monthly", "Weekly"
        };

        String[] numberedTypes = {
                "Monthly", "Daily", "Quarterly", "Half-Yearly", "Annually", "Weekly"
        };

        // Randomly pick fixed or numbered
        if (random.nextBoolean()) {
            // Fixed: "Yearly", "Weekly" etc.
            return fixedFrequencies[random.nextInt(fixedFrequencies.length)];
        } else {
            // Numbered: "3 Monthly", "7 Daily" etc.
            int number = random.nextInt(12) + 1; // 1 to 12
            String type = numberedTypes[random.nextInt(numberedTypes.length)];
            return number + " " + type;
        }
    }

    // Generate a unique frequency name
    public String generateFrequencyName() {
        String[] frequencies = {"Daily", "Weekly", "Monthly", "Quarterly", "Yearly"};
        return frequencies[random.nextInt(frequencies.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }

    // Generate a unique frequency name
    public String generateVenueName() {
        String[] venues = {"Main Hall", "Conference Room", "Auditorium", "Training Center", "Lab 1"};
        return venues[random.nextInt(venues.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }

    public String generateMaxNoParticipants() {
        return String.valueOf(random.nextInt(100) + 1); // 1 to 100 participants
    }
    public String generateCompanyType() {
        String[] levels = {"Consultancy", "Expertise", "Digital Provider", "Technical", "Academic"};
        return levels[random.nextInt(levels.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generateDuplicateCompanyType() {
        String[] levels = {"Technical Training", "Soft Skills Training", "Leadership Development", "Management Training", "Facility Management Training"};
        return levels[random.nextInt(levels.length)] + " " + UUID.randomUUID();
    }
    public String generateCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return currentDate.format(formatter);
    }

    // Generate current time in HH:mm format
    public String generateCurrentTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return currentTime.format(formatter);
    }

    // Generate future date (current date + days) in dd/MM/yyyy format
    public String generateFutureDate(int daysToAdd) {
        LocalDate futureDate = LocalDate.now().plusDays(daysToAdd);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return futureDate.format(formatter);
    }

    // Generate future time (current time + hours) in HH:mm format
    public String generateFutureTime(int hoursToAdd) {
        LocalDateTime futureTime = LocalDateTime.now().plusHours(hoursToAdd);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return futureTime.format(formatter);
    }
    public String generateRandomRemarks() {
        String[] prefixes = {"Testing", "Verification", "Automation", "Schedule"};
        String[] suffixes = {"Confirmed", "Review Pending", "Success", "Draft"};
        Random random = new Random();

        return prefixes[random.nextInt(prefixes.length)] + " " +
                suffixes[random.nextInt(suffixes.length)] + " " +
                UUID.randomUUID().toString().substring(0, 5);
    }


    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.ENGLISH);

    public static String getFormattedDate(LocalDate date) {
        return date.format(FORMATTER);
    }

    public static String getPlusOneDayDate() {
        return getFormattedDate(LocalDate.now().plusDays(0));
    }

    public static String getPlusFifteenDaysDate() {
        return getFormattedDate(LocalDate.now().plusDays(7));
    }

    private static final DateTimeFormatter TIME_FORMATTER =
            DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);

    public static String getCurrentTime() {
        return LocalTime.now().format(TIME_FORMATTER);
    }

    public static String getCurrentTimePlus3Minutes() {
        return LocalTime.now().plusMinutes(3).format(TIME_FORMATTER);
    }

}
