package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class TestDataGenerator {
    private final Random random = new Random();

    // Generate a unique email with timestamp and UUID
    public String generateTimestampedEmail() {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        return "user_" + timestamp + "_" + UUID.randomUUID().toString().substring(0, 5) + "@example.com";
    }

    // Generate a unique phone number
    public String generatePhoneNumber() {
        return "03" + (random.nextInt(900000000) + 100000000) + random.nextInt(10);
    }

    // Generate a unique random name
    public String generatePersonName() {
        String[] names = {"John", "Jane", "Alice", "Bob", "Charlie", "Daisy"};
        return names[random.nextInt(names.length)] + " " + (char) (random.nextInt(26) + 'A') + "."
                + UUID.randomUUID().toString().substring(0, 3);
    }

    // Generate a unique company name
    public String generateCompanyName() {
        String[] companies = {"Acme Corp", "Globex Inc", "Initech", "Umbrella Corp", "Wayne Enterprises"};
        return companies[random.nextInt(companies.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
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

    //Generate Incident Type Code
    public String generateIncident_Type_Code() {
        String[] codes = {"TRA1", "UI78", "IPJK6", "COG07", "JIN9", "PAM1"};
        return codes[random.nextInt(codes.length)];
    }

    //Generate Incident Type
    public String generateIncident_Type() {
        String[] incidentType = {
                "Fire Incident",
                "Medical",
                "Security Incident",
                "Workplace Incident",
                "Chemical Spill Hazard",
                "Power Incident",
                "Network Incident",
                "Unauthorized Access Hazard",
                "Nature Hazard",
                "Equipment Malfunction "
        };
        return incidentType[random.nextInt(incidentType.length)];
    }

    //Generate Incident Sub Type Code
    public String generateIncident_Sub_Type_Code() {
        String[] codes = {"SK", "U7", "56", "C6", "L7", "P3"};
        return codes[random.nextInt(codes.length)];
    }

    //Generate Incident Sub Type
    public String generateIncident_Sub_Type() {
        String[] incidentSubType = {
                "Plane",
                "Medical",
                "Security",
                "Work",
                "Chemical",
                "Power",
                "Network",
                "Spill",
                "Nature",
                "Equip"
        };
        return incidentSubType[random.nextInt(incidentSubType.length)];
    }

    public String generateIncident_Severity() {
        String[] codes = {"P5", "P1", "P2", "P3", "P4", "P6"};
        return codes[random.nextInt(codes.length)];
    }

    public String generateAffected_Group() {
        String[] codes = {"Children", "Family Members", "Victims/Employees", "Local Residents", "Organization", "Coworkers"};
        return codes[random.nextInt(codes.length)];
    }

    public String generateCaused_By() {
        String[] codes = {"Human Factors", "Negligent Acts", "System Failures", "Faulty equipments", "Improper supervision", "Ignoring safety protocols"};
        return codes[random.nextInt(codes.length)];
    }

    public String generateImpact_Type() {
        String[] codes = {"Critical", "Low", "None", "High", "Informational", "Maintenance"};
        return codes[random.nextInt(codes.length)];
    }

    public int generateImpact_Type_Sort_Order() {
        int[] codes = {1, 2, 3, 4, 5, 6};
        return codes[random.nextInt(codes.length)];
    }

    public String generateSection_Name() {
        String[] codes = {"Resolution Details", "Incident Details", "Business Impact", "Related Records", "Activity/Notes", "Impact/Urgency/Priority"};
        return codes[random.nextInt(codes.length)];
    }

    public int generateSection_Sort_Order() {
        int[] codes = {1, 2, 3, 4, 5, 6};
        return codes[random.nextInt(codes.length)];
    }

    public String generateField_Name() {
        String[] codes = {"Description of the Incident", "Incident Details", "Who Caused The Incident", "Incident Photos", "Reason for the Incident Happened", "Where the Incident happens"};
        return codes[random.nextInt(codes.length)];
    }

    public String generateList_of_Values() {
        String[] LOV = {"LOV1", "LOV2", "LOV3", "LOV4", "LOV5", "LOV6"};
        return LOV[random.nextInt(LOV.length)];
    }

    public String generateRegulatory_Body() {
        String[] Regulatory_Body = {"RGB1", "RGB2", "RGB3", "RGB4", "RGB5", "RGB6"};
        return Regulatory_Body[random.nextInt(Regulatory_Body.length)];
    }

    public String generateDescription() {
        String[] Description = {"RBD1", "RBD2", "RBD3", "RBD4", "RBD5", "RBD6"};
        return Description[random.nextInt(Description.length)];
    }
}



