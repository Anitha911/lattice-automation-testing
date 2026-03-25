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
        String[] LOV = {"LOV11", "LOV12", "LO1V3", "LOV14", "LOV15", "LOV16"};
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

    public String generateConnectivity_Category() {
        String[] Connectivity_Category = {"CC1", "CC2", "CC3", "CC4", "CC5", "CC6"};
        return Connectivity_Category[random.nextInt(Connectivity_Category.length)];
    }

    public String generateConnectivity() {
        String[] Connectivity = {"C1", "C2", "C3", "C4", "C5", "C6"};
        return Connectivity[random.nextInt(Connectivity.length)];
    }

    public String generateBuilding_Category() {
        String[] Building_Category = {"BC1", "BC2", "BC3", "BC4", "BC5", "BC6"};
        return Building_Category[random.nextInt(Building_Category.length)];
    }

    public String generateStructure_Type() {
        String[] Structure_Type = {"ST1", "ST2", "ST3", "ST4", "ST5", "ST6"};
        return Structure_Type[random.nextInt(Structure_Type.length)];
    }

    public String generateBuilding_Type() {
        String[] Building_Type = {"BT1", "B2", "BT3", "BT4", "BT5", "B6"};
        return Building_Type[random.nextInt(Building_Type.length)];
    }

    public String generateSP_Classification() {
        String[] SP_Classification = {"SP1", "SP", "SP3", "SP4", "SP5", "SP6"};
        return SP_Classification[random.nextInt(SP_Classification.length)];
    }

    public String generateViolation_Type() {
        String[] Violation_Type = {"VT1", "VT2", "VT3", "VT4", "VT5", "VT6"};
        return Violation_Type[random.nextInt(Violation_Type.length)];
    }

    // Administration
    public String generateNote_Type_Category() {
        String[] Note_Type_Category = {"NT1", "NT2", "NT3", "NT4", "NT5", "NT6"};
        return Note_Type_Category[random.nextInt(Note_Type_Category.length)];
    }

    public String generateDocument_Type() {
        String[] Document_Type = {"DT1", "DT2", "DT3", "DT4", "DT5", "DT6"};
        return Document_Type[random.nextInt(Document_Type.length)];
    }

    public String generateHoliday() {
        String[] Holiday = {"H1", "H2", "H3", "H4", "H5", "H6"};
        return Holiday[random.nextInt(Holiday.length)];
    }

     public String generateAnnouncement()  {
        String[] Announcement = {"AN1", "AN2", "AN3", "AN4", "AN5", "AN6"};
        return Announcement[random.nextInt(Announcement.length)];
    }

    public String generateEmail_Server()  {
            String[] Email_Server = {"ES1", "ES2", "ES3", "ES4", "ES5", "ES6"};
            return Email_Server[random.nextInt(Email_Server.length)];
    }

   //ASSET MANAGEMENT
    public String generateAsset_Class()  {
        String[] Asset_Class = {"AS1", "AS2", "AS3", "AS4", "AS5", "AS6"};
        return Asset_Class[random.nextInt(Asset_Class.length)];
    }

    public String generateAsset_Master_Category()  {
        String[] Asset_Master_Category = {"AMC1", "AMC2", "AMC3", "AMC4", "AMC5", "AMC6"};
        return Asset_Master_Category[random.nextInt(Asset_Master_Category.length)];
    }

    public String generateAsset_Category()  {
        String[] Asset_Category = {"AC1", "AC2", "AC3", "AC4", "AC5", "AC6"};
        return Asset_Category[random.nextInt(Asset_Category.length)];
    }

    public String generateAsset_Sub_Category()  {
        String[] Asset_Sub_Category = {"ASC1", "ASC2", "ASC3", "ASC4", "ASC5", "ASC6"};
        return Asset_Sub_Category[random.nextInt(Asset_Sub_Category.length)];
    }

    public String generateOEM() {
        String[] OEM = {"OEM1", "OEM2", "OEM3", "OEM4", "OEM5", "OEM6"};
        return OEM[random.nextInt(OEM.length)];
    }

    public String generateMake() {
        String[] Make = {"Make1", "Make2", "Make3", "Make4", "Make5", "Make6"};
        return Make[random.nextInt(Make.length)];
    }

        public String generateModel() {
            String[] Model = {"Model1", "Model2", "Model3", "Model4", "Model5", "Model6"};
            return Model[random.nextInt(Model.length)];
        }

    public String generateDerating_Factor_Code() {
        String[] Derating_Factor = {"DF1", "DF2", "DF3", "DF4", "DF5", "DF6"};
        return Derating_Factor[random.nextInt(Derating_Factor.length)];
    }

    public String generateDerating_Factor_Description() {
        String[] Derating_Factor_Description = {"Description1", "Description2", "Description3", "Description4", "Description5", "Description6"};
        return Derating_Factor_Description[random.nextInt(Derating_Factor_Description.length)];
    }

    public String generateShort_Code_Reading_Unit() {
        String[] Short_Code_Reading_Unit = {"SCU1", "SCU2", "SCU3", "SCU4", "SCU5", "SCU6"};
        return Short_Code_Reading_Unit[random.nextInt(Short_Code_Reading_Unit.length)];
    }

    public String generateReading_Unit() {
        String[] Reading_Unit = {"RU1", "RU2", "RU3", "RU4", "RU5", "RU6"};
        return Reading_Unit[random.nextInt(Reading_Unit.length)];
    }

    public String generateTechnical_Parameters() {
        String[] Technical_Parameters = {"TP1", "TP2", "TP3", "TP4", "TP5", "TP6"};
        return Technical_Parameters[random.nextInt(Technical_Parameters.length)];
       }

    public int generateTechnical_Parameters_Max_Length() {
        int[] Technical_Parameters_Max_Length = {1, 2, 3, 4, 5, 6};
        return Technical_Parameters_Max_Length[random.nextInt(Technical_Parameters_Max_Length.length)];
    }

    public String generateMetering_Attributes() {
        String[] Metering_Attributes = {"MA1", "MA2", "MA3", "MA4", "MA5", "MA6"};
        return Metering_Attributes[random.nextInt(Metering_Attributes.length)];
    }

    public int generateMetering_Attributes_Decimals() {
        int[] Metering_Attributes_Decimals = {1, 2, 3, 4, 5, 6};
        return Metering_Attributes_Decimals [random.nextInt(Metering_Attributes_Decimals.length)];
    }

    public String generateTools_And_Equipments() {
        String[] Tools_And_Equipments = {"TAE1", "TAE2", "TAE3", "TAE4", "TAE5", "TAE6"};
        return Tools_And_Equipments[random.nextInt(Tools_And_Equipments.length)];
    }

    public int generateTools_And_Equipments_Hourly_Charges() {
        int[] Hourly_Charges = {100, 250, 300, 450, 500, 600};
        return Hourly_Charges [random.nextInt(Hourly_Charges.length)];
    }

}


