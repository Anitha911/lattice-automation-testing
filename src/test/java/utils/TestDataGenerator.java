package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        return names[random.nextInt(names.length)] + " " + (char)(random.nextInt(26) + 'A') + "."
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
    //Guard Data Config
    //Guard Mode  Generate a random Patrol Mode
    public String generatePatrolMode() {
        String[] mode = {"tstSeg way", "tstFoot", "tstCar", "tstMopped", "tstVan"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Guard Shift Generate a random Patrol Shift Name
    public String generatePatrolShiftName() {
        String[] shift = {"tstMorShift", "tstEveShift", "tstNightShift", "tstHeavyShift", "tstShortShift"};
        return shift[random.nextInt(shift.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Guard Shift Generate a random Patrol Shift Code
    public String generatePatrolShiftCode() {
            return String.valueOf(random.nextInt(1000));
        }
    //Sales-Client type
    public String generateClientType() {
        String[] mode = {"tstClient1", "tstClient2", "tstClient3", "tstClient4", "tstClient5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Sales-Enquiry type
    public String generateEnquiryType() {
        String[] mode = {"tstEnqType1", "tstEnqType2", "tstEnqType3", "tstEnqType4", "tstEnqType5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Sales Enquiry Source
    public String generateEnquirySource() {
        String[] mode = {"tstEnqSource1", "tstEnqSource2", "tstEnqSource3", "tstEnqSource4", "tstEnqSource5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Sales T and C
    public String generateEnquiryTandC() {
        String[] mode = {"tstEnqTandC1", "tstEnqTandC2", "tstEnqTandC3", "tstEnqTandC4", "tstEnqTandC5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Sales Exclusions
    public String generateEnquiryExclusions() {
        String[] mode = {"tstEnqExclusion1", "tstEnqExclusion2", "tstEnqExclusion3", "tstEnqExclusion4", "tstEnqExclusion5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Sales Payment Terms
    public String generateEnquiryPaymentTerms() {
        String[] mode = {"tstEnqPaymentTerms1", "tstEnqPaymentTerms2", "tstEnqPaymentTerms3", "tstEnqPaymentTerms4", "tstEnqPaymentTerms5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Guard Route
    public String generateRouteCode() {
        String[] mode = {"tRC1", "tRC2", "tRC3", "tRC4", "tRC5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 3);
    }
    public String generateRouteName() {
        String[] mode = {"tstRouteName1", "tstRouteName2", "tstRouteName3", "tstRouteName4", "tstRouteName5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generateRouteDesc() {
        String[] mode = {"tstRouteDesc1", "tstRouteDesc2", "tstRouteDesc3", "tstRouteDesc4", "tstRouteDesc5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Guard Schedule Generate a random Patrol Schedule Name
    public String generatePatrolScheduleName() {
        String[] schedule = {"tstSchedule1", "tstSchedule2", "tstSchedule3", "tstSchedule4", "tstSchedule5"};
        return schedule[random.nextInt(schedule.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
}
