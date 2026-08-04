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
    public String generateCityName()
    {
        String[] cities = {"Dubai", "Abu Dhabi", "Sharjah", "Fujairah", "Ajman", "Ras Al Khaimah", "Umm Al Quwain", "Kalba"};
        return cities[random.nextInt(cities.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateAGName()
    {
        String[] Areagroups = {"Central Dubai", "Downtown Area", "Residential Community", "Suburbs", "Industrial", "Outer Areas", "New Developments", "Municipality systems"};
        return Areagroups[random.nextInt(Areagroups.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateAreaName()
    {
        String[] AreaName = {"Deira", "Downtown Dubai", "Oud Metha", "Business Bay", "Jumeirah", "Mirdif", "Dubai Marina", "International city"};
        return AreaName[random.nextInt(AreaName.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generatePropertyName()
    {
        String[] PropertyName = {"Dubai South", "Palm Jumeirah", "Arabian Ranches", "The Springs", "Town Square", "Bluewater Island", "City walk", "Emirates Hills"};
        return PropertyName[random.nextInt(PropertyName.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateZoneName()
    {
        String[] ZoneName = {"Jebel Ali Free Zone", "Dubai Airport Free Zone", "Silicon Oasis", "Master Panned Zones", "Mainland Areas"};
        return ZoneName[random.nextInt(ZoneName.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateSubZoneName()
    {
        String[] SubZoneName = {"JNaif", "Al Ras", "DIFC", "Al Barsha South", "Abu Hail"};
        return SubZoneName[random.nextInt(SubZoneName.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateBUName()
    {
        String[] BUName = {"Block A", "Lift A", "Garden A", "Corridor A", "Pool A"};
        return BUName[random.nextInt(BUName.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateBURemarks()
    {
        String[] BURemarks = {"Remarks 1", "Remarks 2", "Remarks 3"};
        return BURemarks[random.nextInt(BURemarks.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateZoneCriticality()
    {
        String[] ZoneCriticality = {"Critical", "High", "Medium", "Low", "Non-Critical"};
        return ZoneCriticality[random.nextInt(ZoneCriticality.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateZoneGroupCriticality()
    {
        String[] ZoneGroupCriticality = {"Safety-Critical Zone", "Production-Critical Zone", "Operational-Support Zone", "Non-Critical / Administrative Zone", "Environmental-Sensitive Zone"};
        return ZoneGroupCriticality[random.nextInt(ZoneGroupCriticality.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateBUFunctionalType()
    {
        String[] BUFunctionalType = {"Operations", "Maintenance", "HSE", "Finance", "Supply Chain", "Digital", "HR", "Sales"};
        return BUFunctionalType[random.nextInt(BUFunctionalType.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }

    public String generateBUFunctionalSubType()
    {
        String[] BUFunctionalSubType = {"Utilities Operations", "Electrical Maintenance", "Occupational Safety", "Cost Control", "Warehousing", "Infrastructure & Network", "Workforce Planning", "Vendor Performance"};
        return BUFunctionalSubType[random.nextInt(BUFunctionalSubType.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }

    public String generateBUSizeAttributeCode()
    {
        String[] BUSizeAttributeCode = {"BUAC -"};
        return BUSizeAttributeCode[random.nextInt(BUSizeAttributeCode.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateBUSizeAttributeName()
    {
        String[] BUSizeAttributeName = {"Headcount","Square Feet","Volume", "Annual turnover"};
        return BUSizeAttributeName[random.nextInt(BUSizeAttributeName.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateBUSizeTypeCode()
    {
        String[] BUSizeTypeCode = {"STC -"};
        return BUSizeTypeCode[random.nextInt(BUSizeTypeCode.length)] + " " + UUID.randomUUID().toString().substring(0, 3);
    }
    public String generateBUSizeTypeName()
    {
        String[] BUSizeTypeName = {"Common","Studio Apartment","Roof Top Apartment", "Watchman Room"};
        return BUSizeTypeName[random.nextInt(BUSizeTypeName.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generateBUCriticalityName()
    {
        String[] BUCriticalityName = {"Severe","Major","Moderate", "Minor"};
        return BUCriticalityName[random.nextInt(BUCriticalityName.length)] + " " + UUID.randomUUID().toString().substring(0, 6);
    }
    public String generatePTWType()
    {
        String[] PTWType = {"High Risk Work Permits","Maintenance and Operations Permits","Specialized Work Permits", "Facility and Civil Work Permits", "General or Administrative Permits"};
        return PTWType[random.nextInt(PTWType.length)] + " " + UUID.randomUUID().toString().substring(0, 3);
    }
    public String generateSN()
    {
        String[] ShortName = {"HWP","MOP","SWP", "Civil", "Common"};
        return ShortName[random.nextInt(ShortName.length)] + " " + UUID.randomUUID().toString().substring(0, 3);
    }
    public String generateTOWI()
    {
        String[] TOWI = {"Welding or Soldering","Mechanical or Pipeline Work","Chemical or Radiation", "Drilling or Scaffolding", "Site Access or Inspection"};
        return TOWI[random.nextInt(TOWI.length)] + " " + UUID.randomUUID().toString().substring(0, 3);
    }
}
