package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

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
    //Inventory-Item type
    public String generateItemTypeCode() {
        String[] mode = {"ITCd1", "ITCd2", "ITCd3", "ITCd4", "ITCd5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generateItemTypeCodeName() {
        String[] mode = {"tstItemTypeName1", "tstItemTypeName2", "tstItemTypeName3", "tstItemTypeName4", "tstItemTypeName5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Inventory-Item Category
    public String generateItemCategoryCode() {
        String[] mode = {"ICCd1", "ICCd2", "ICCd3", "ICCd4", "ICCd5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generateItemCategoryCodeName() {
        String[] mode = {"tstItemCategoryName1", "tstItemCategoryName2", "tstItemCategoryName3", "tstItemCategoryName4", "tstItemCategoryName5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Inventory-Item SubCategory
    public String generateItemSubCategoryCode() {
        String[] mode = {"ISCd1", "ISCd2", "ISCd3", "ISCd4", "ISCd5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generateItemSubCategoryCodeName() {
        String[] mode = {"tstItemSubCatName1", "tstItemSubCatName2", "tstItemSubCatName3", "tstItemSubCatName4", "tstItemSubCatName5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generateItemName() {
        String[] mode = {"tstItemName1", "tstItemName2", "tstItemName3", "tstItemName4", "tstItemName5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Inventory-Unit Conversion
    public String generateConvFactor() {
        return String.valueOf(random.nextInt(1000000000));
    }
    //Inventory-Service Group
    public String generateStoreGroup() {
        String[] mode = {"tstStoreGrp1", "tstStoreGrp2", "tstStoreGrp3", "tstStoreGrp4", "tstStoreGrp5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generateStoreLocationDetails() {
        String[] mode = {"tstStoreLoc1", "tstStoreLoc2", "tstStoreLoc3", "tstStoreLoc4", "tstStoreLoc5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Inventory UOM code
    public String generateUOMCode() {
        String[] mode = {"tsUOM1", "tsUOM2", "tsUOM3", "tsUOM4", "tsUOM5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Inventory UOM Name
    public String generateUOMName() {
        String[] mode = {"tstUOMName1", "tstUOMName2", "tstUOMName3", "tstUOMName4", "tstUOMName5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Inventory SupplierType
    public String generateSupplierType() {
        String[] mode = {"tstSupplerType1", "tstSupplerType2", "tstSupplerType3", "tstSupplerType4", "tstSupplerType5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Inventory-Action Reason
    public String generateActionReason() {
        String[] mode = {"tstAR1", "tstAR2", "tstAR3", "tstAR4", "tstAR5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Inventory-Action Reason Desc
    public String generateActionReasondesc() {
        String[] mode = {"tstARDes1", "tstARDesc2", "tstARDesc3", "tstARDesc4", "tstARDesc5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-SG
    public String generateSGName() {
        String[] mode = {"tstSGDes1", "tstSGDesc2", "tstSGDesc3", "tstSGDesc4", "tstSGDesc5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-Fault Category
    public String generateFCName() {
        String[] mode = {"tstFCDes1", "tstFCDes2", "tstFCDes3", "tstFCDes4", "tstFCDes5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-Fault Code
    public String generateFCodeName() {
        String[] mode = {"tstFCodeDes1", "tstFCodeDes2", "tstFCodeDes3", "tstFCodeDes4", "tstFCodeDes5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-Fault Priority
    public String generatePriorityName() {
        String[] mode = {"tstP1", "tstP2", "tstP3", "tstP4", "tstP5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generatePriorityNote() {
        String[] mode = {"tstPNote1", "tstPNote2", "tstPNote3", "tstPNote4", "tstPNote5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-WO Source
    public String generateWOSourceName() {
        String[] mode = {"tstWOS1", "tstWOS2", "tstWOS3", "tstWOS4", "tstWOS5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-RC Name
    public String generateRCName() {
        String[] mode = {"tstRC1", "tstRC2", "tstRC3", "tstRC4", "tstRC5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-ResolutionCode Name
    public String generateResolutionCodeName() {
        String[] mode = {"tstResCde1", "tstResCde2", "tstResCde3", "tstResCde4", "tstResCde5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-Priority Change Reason Name
    public String generatePCRName() {
        String[] mode = {"tstPCR1", "tstPCR2", "tstPCR3", "tstPCR4", "tstPCR5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-Contract Group Change Reason Name
    public String generateCGCR() {
        String[] mode = {"tstCGCR1", "tstCGCR2", "tstCGCR3", "tstCGCR4", "tstCGCR5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-SLA Failure Justification Reason Name
    public String generateSLAFJR() {
        String[] mode = {"tstSLAFJR1", "tstSLAFJR2", "tstSLAFJR3", "tstSLAFJR4", "tstSLAFJR5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-CTI Reason Name
    public String generateCTIR() {
        String[] mode = {"tstCTIR1", "tstCTIR2", "tstCTIR3", "tstCTIR4", "tstCTIR5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //RM Master-Service Request Reason Name
    public String generateSRR() {
        String[] mode = {"tstSRR1", "tstSRR2", "tstSRR3", "tstSRR4", "tstSRR5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Sales Transaction
    public String generateCustomerName() {
        String[] mode = {"tstCust1", "tstCust2", "tstCust3", "tstCust4", "tstCust5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generateContactPerson() {
        String[] mode = {"tstContact1", "tstContact2", "tstContact3", "tstContact4", "tstContact5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generateCustEmail() {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        return "user_" + timestamp + "_" + UUID.randomUUID().toString().substring(0, 5) + "@example.com";
    }
    //Price unit
    public String generatePrice() {
        double price = 1 + (10000 - 1) * random.nextDouble();
        return String.format("%.2f", price);
    }
    // Generate a unique phone number
    public String generateCustMobile() {
        return "03" + (random.nextInt(900000000) + 100000000) + random.nextInt(10);
    }
    // Generate a unique address
    public String generateCustAddress() {
        return (random.nextInt(999) + 1) + " Test Street, Test City " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generateEnqDesc() {
        String[] mode = {"tstDESC1", "tstDESC2", "tstDESC3", "tstDESC4", "tstDESC5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);    }
    public String generateComments() {
        String[] mode = {"tstEnqComment1", "tstEnqComment2", "tstEnqComment3", "tstEnqComment4", "tstEnqComment5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);    }

    public String generateCurrentDateSales() {
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
        return currentDate.format(formatter);
    }
    public String generateIntName() {
        String[] mode = {"tstIntName1", "tstIntName2", "tstIntName3", "tstIntName4", "tstIntName5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);    }
    public String generateDisplayName() {
        String[] mode = {"tstDisName1", "tstDisName2", "tstDisName3", "tstDisName4", "tstDisName5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);    }
    public String generateShortDesc() {
        String[] mode = {"tstShortDesc1", "tstShortDesc2", "tstShortDesc3", "tstShortDesc4", "tstShortDesc5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);    }
    public String generateInspecCharges() {
        double price = 1 + (10000 - 1) * random.nextDouble();
        return String.format("%.2f", price);
    }

    //Sales Transaction End
    //Energy Utility start
    public String generateEnergyType() {
        String[] mode = {"tstEnergyType1", "tstEnergyType2", "tstEnergyType3", "tstEnergyType4", "tstEnergyType5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generateEnergyTypeShortName() {
        String[] mode = {"tstEnergyTypeShrt1", "tstEnergyTypeShrt2", "tstEnergyTypeShrt3", "tstEnergyTypeShrt4", "tstEnergyTypeShrt5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    public String generatePremiseMeterAccDescNumber() {
        String[] mode = {"tstPMAD1", "tstPMAD2", "tstPMAD3", "tstPMAD4", "tstPMAD5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);    }
    public String generateManualEntryCharges() {
        double price = ThreadLocalRandom.current().nextDouble(1, 10000);
        return String.format(Locale.US, "%.2f", price);
    }
    public String generateEnergyGrpName() {
        String[] mode = {"tstEnergyGrp1", "tstEnergyGrp2", "tstEnergyGrp3", "tstEnergyGrp4", "tstEnergyGrp5"};
        return mode[random.nextInt(mode.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
    }
    //Energy Utility End
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
