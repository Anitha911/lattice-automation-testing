package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


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
        return getFormattedDate(LocalDate.now().plusDays(0));
    }

    private static final DateTimeFormatter TIME_FORMATTER =
            DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);

    public static String getCurrentTime() {
        return LocalTime.now().format(TIME_FORMATTER);
    }

    public static String getCurrentTimePlus3Minutes() {
        return LocalTime.now().plusMinutes(120).format(TIME_FORMATTER);
    }

    public String generateCriticality() {
        String[] levels = {"Working at Height", "Confined Space Entry", "Hot Work Welding or Cutting", "Electrical Isolation", "Chemical Handling"};
        return levels[random.nextInt(levels.length)] + " " + UUID.randomUUID().toString().substring(0, 4);
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
        return "NoteType" + System.currentTimeMillis();
    }

    public String generateDocument_Type() {
        return "DocumentType" + System.currentTimeMillis();
    }

    public String generateHoliday() {
        return "Holiday" + System.currentTimeMillis();
    }

    public String generateAnnouncement() {
        return "Announcement" + System.currentTimeMillis();
    }

    public String generateRandomDate() {
        Random random = new Random();
        LocalDate startDate = LocalDate.now().plusDays(random.nextInt(30) + 1);
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return startDate.format(formatter);
    }

    public String generateRandomEndDate(String startDateStr) {
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate =LocalDate.parse(startDateStr, formatter);
        LocalDate endDate = startDate.plusDays(new Random().nextInt(10) + 1);
        return endDate.format(formatter);
    }

    public String generateMaster_Administration_Email_Server() {
        return "EmailServer" + System.currentTimeMillis();
    }

    public String generateMaster_Administration_PortNumber() {
        return String.valueOf(1000 + new Random().nextInt(9000));
    }

    public String generateMaster_Administration_ClientId() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder clientId = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            clientId.append(chars.charAt(random.nextInt(chars.length())));
        }
        return clientId.toString();
    }

    public String generateMaster_Administration_ClientSecret() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder clientSecret = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            clientSecret.append(chars.charAt(random.nextInt(chars.length())));
        }
        return clientSecret.toString();
    }

    public String generateMaster_Administration_EmailAccount() {
        return "user" + System.currentTimeMillis() + "@gmail.com";
    }

    public String generateMaster_Administration_Password() {
        return "Pwd@" + System.currentTimeMillis();
    }

    public String generateURL(String prefix) {
        return "https://" + prefix + System.currentTimeMillis() + ".com";}

    public String generateScope() {
        String[] Master_Administration_Scope = {"Scope1", "Scope2", "Scope3", "Scope4", "Scope5", "Scope6"};
        return Master_Administration_Scope[random.nextInt(Master_Administration_Scope.length)];
    }

        //ASSET MANAGEMENT
    public String generateAsset_Class() {
        String[] Asset_Class = {"Asset Class1", "Asset Class2", "Asset Class3", "Asset Class4", "Asset Class5", "Asset ClassS6"};
        return Asset_Class[random.nextInt(Asset_Class.length)];
    }

    public String generateAsset_Master_Category() {
        String[] Asset_Master_Category = {"AMC1", "AMC2", "AMC3", "AMC4", "AMC5", "AMC6"};
        return Asset_Master_Category[random.nextInt(Asset_Master_Category.length)];
    }

    public String generateAsset_Category() {
        String[] Asset_Category = {"Asset Category1", "Asset Category2", "Asset Category3", "Asset Category4", "Asset Category5", "Asset Category6"};
        return Asset_Category[random.nextInt(Asset_Category.length)];
    }

    public String generateAsset_Sub_Category() {
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
        String[] Metering_Attributes = {"Metering Attribute1", "Metering Attribute3", "Metering Attribute4", "Metering Attribute5", "Metering Attribute6", "Metering Attribute7"};
        return Metering_Attributes[random.nextInt(Metering_Attributes.length)];
    }

      public String generateMetering_Parameters() {
        String[] Metering_Attributes = {"Metering Parameter1", "Metering Parameter2", "Metering Parameter3", "Metering Parameter4", "Metering Parameter5", "Metering Parameter6"};
        return Metering_Attributes[random.nextInt(Metering_Attributes.length)];
    }

    public String generateTools_And_Equipments() {
        String[] Tools_And_Equipments = {"Tools1", "Tool2", "Tool3", "Tool4", "Tool5", "Tool6"};
        return Tools_And_Equipments[random.nextInt(Tools_And_Equipments.length)];
    }

    public int generateTools_And_Equipments_Hourly_Charges() {
        int[] Hourly_Charges = {100, 250, 300, 450, 500, 600};
        return Hourly_Charges[random.nextInt(Hourly_Charges.length)];
    }

//    Transaction Incident

    public String generateIncident_Location() {
        String[] Incident_Location = {"ILTest1", "ILTest2", "ILTest3", "ILTest4", "ILTest5", "ILTest6"};
        return Incident_Location[random.nextInt(Incident_Location.length)];
    }

    public String generateIncident_Department() {
        String[] Incident_Department = {"IDTest1", "IDTest2", "IDTest3", "IDTest4", "IDTest5", "IDTest6"};
        return Incident_Department[random.nextInt(Incident_Department.length)];
    }

    public String generateincident_Remarks() {
        String[] Incident_Remarks = {"Remarks1", "Remarks2", "Remarks3", "Remarks4", "Remarks5", "Remarks6"};
        return Incident_Remarks[random.nextInt(Incident_Remarks.length)];
    }

    public String generateIncident_Approval_Comments() {
        String[] Incident_Approval_Comments = {"Comments1", "Comments2", "Comments3", "Comments4", "Comments5", "Comments6"};
        return Incident_Approval_Comments[random.nextInt(Incident_Approval_Comments.length)];
    }


//    Asset Management

    public String generateAsset_Name() {
        String[] Asset_Name = {"Asset_Name1", "Asset_Name2", "Asset_Name3", "Asset_Name4", "Asset_Name5", "Asset_Name6"};
        return Asset_Name[random.nextInt(Asset_Name.length)];
    }

    public String generateAddAsset_Ownership() {
        String[] Add_Asset_Ownership = {"Own", "Hired"};
        return Add_Asset_Ownership[random.nextInt(Add_Asset_Ownership.length)];
    }

    public String generateAddAsset_Criticality() {
        String[] Add_Asset_Criticality = {"High", "Medium", "Low"};
        return Add_Asset_Criticality[random.nextInt(Add_Asset_Criticality.length)];
    }

    public String generateAddAsset_Functional_Status() {
        String[] Add_Asset_Functional_Status = {"In Service", "Partially Faulty", "Out of Service"};
        return Add_Asset_Functional_Status[random.nextInt(Add_Asset_Functional_Status.length)];
    }

    public String generateAdd_Asset_Condition() {
        String[] Add_Asset_Condition = {"New", "Good", "Fair", "Poor", "Unserviceable"};
        return Add_Asset_Condition[random.nextInt(Add_Asset_Condition.length)];
    }


    public String generateAdd_Asset_Location_Level() {
        String[] Add_Asset_Location_Level = {
                "Property",
                "Zone",
                "Sub Zone",
                "Base Unit"
        };
        return Add_Asset_Location_Level[random.nextInt(Add_Asset_Location_Level.length)];
    }

    public String generateModify_Commercial_Purchase_Order_Number() {
        String[] Modify_Commercial_Purchase_Order_Number = {"PURONUM1", "PURONUM2", "PURONUM3", "PURONUM4", "PURONUM5", "PURONUM6"};
        return Modify_Commercial_Purchase_Order_Number[random.nextInt(Modify_Commercial_Purchase_Order_Number.length)];
    }

    public String generateAsset_Inventory_Verification_Name() {
        String[] Asset_Inventory_Verification_Name = {"Asset Inventory1", "Asset Inventory2", "Asset Inventory3", "Asset Inventory4", "Asset Inventory5", "Asset Inventory6"};
        return Asset_Inventory_Verification_Name[random.nextInt(Asset_Inventory_Verification_Name.length)];
    }

    public String generateAlert_Code() {
        String[] Alert_Code = {"Alert_11", "Alert_12", "Alert_13", "Alert_14", "Alert_15", "Alert_16"};
        return Alert_Code[random.nextInt(Alert_Code.length)];
    }

    public String generateAlert_Code_Description() {
        String[] Decommission_Remarks = {"Alert_Code_Description11", "Alert_Code_Description12", "Alert_Code_Description13", "Alert_Code_Description14", "Alert_Code_Description15", "Alert_Code_Description16"};
        return Decommission_Remarks[random.nextInt(Decommission_Remarks.length)];
    }


    public String generateAsset_Transfer_Reason() {
        String[] assetTransferReason = {
                "Replacement",
                "Not in Use",
                "Temporary Use",
                "Others"};
        return assetTransferReason[random.nextInt(assetTransferReason.length)];
    }

    public String generateAsset_Transfer_Remarks() {
        String[] Asset_Transfer_Remarks = {"Remarks1", "Remarks2", "Remarks3", "Remarks4", "Remarks5", "Remarks6"};
        return Asset_Transfer_Remarks[random.nextInt(Asset_Transfer_Remarks.length)];
    }

    public String generateAsset_Location_Level() {
        String[] Asset_Location_Level = {
                "Property",
                "Zone",
                "Sub-zone",
                "Base Unit"
        };
        return Asset_Location_Level[random.nextInt(Asset_Location_Level.length)];
    }

    public String generatePPM_Applicability_Remarks() {
        String[] PPM_Applicability_Remarks = {"Remarks1", "Remarks2", "Remarks3", "Remarks4", "Remarks5", "Remarks6"};
        return PPM_Applicability_Remarks[random.nextInt(PPM_Applicability_Remarks.length)];
    }

    public String generateDecommission_Remarks() {
        String[] Alert_Code_Description = {"Remarks1", "Remarks2", "Remarks3", "Remarks4", "Remarks5", "Remarks6"};
        return Alert_Code_Description[random.nextInt(Alert_Code_Description.length)];
    }


    public String generateAssetNotes() {
        String[] Asset_Notes = {"Notes1", "Notes2", "Notes3", "Notes4", "Notes5", "Notes6"};
        return Asset_Notes[random.nextInt(Asset_Notes.length)];
    }

    public String generateCondition_Update_To_Condition() {
        String[] ToCondition = {
                "New",
                "Good",
                "Fair",
                "Poor",
                "Unserviceable"};
        return ToCondition[random.nextInt(ToCondition.length)];
    }

    public String generateCondition_Update_Remarks() {
        String[] Condition_Update_Remarks = {"Remarks1", "Remarks2", "Remarks3", "Remarks4", "Remarks5", "Remarks6"};
        return Condition_Update_Remarks[random.nextInt(Condition_Update_Remarks.length)];
    }


    public String generateCondition_Update_Possible_Cause() {
        String[] Possible_Cause = {
                "PossibleCauseName",
                "End of Life",
                "Improper Operation",
                "Lack of Maintenance"};
        return Possible_Cause[random.nextInt(Possible_Cause.length)];
    }

    public String generateCondition_Update_Anticipated_Action() {
        String[] Anticipated_Action = {
                "Refurbishment",
                "Repair",
                "Replace"
        };
        return Anticipated_Action[random.nextInt(Anticipated_Action.length)];
    }


    public String generateFunctional_Update_To_Status() {
        String[] To_Status = {
                "In Service",
                "Partially Faulty",
                "Out of Service"};
        return To_Status[random.nextInt(To_Status.length)];
    }

    public String generateFunctional_Update_Reason() {
        String[] Reason = {
                "Abnormal Noise/Vibration",
                "Electrical Issues",
                "Excess Usage/Wear Out",
                "Health and Safety Issues",
                "Not in Service",
                "Overheating",
                "Others"
        };
        return Reason[random.nextInt(Reason.length)];
    }

    public String generateFunctional_Update_Remarks() {
        String[] Functional_Update_Remarks = {"Remarks1", "Remarks2", "Remarks3", "Remarks4", "Remarks5", "Remarks6"};
        return Functional_Update_Remarks[random.nextInt(Functional_Update_Remarks.length)];
    }


    public String generateAsset_Inventory_Location_Level() {
        String[] Asset_Inventory_Location_Level = {
                "Property",
                "Zone",
                "Sub Zone",
                "Base Unit"
        };
        return Asset_Inventory_Location_Level[random.nextInt(Asset_Inventory_Location_Level.length)];
    }

    public String generateTrigger() {
        String[] Asset_Trigger_Name = {"Trigger1", "Trigger2", "Trigger3", "Trigger4", "Trigger5", "Trigger6"};
        return Asset_Trigger_Name[random.nextInt(Asset_Trigger_Name.length)];
    }

    public String generateComparison_Type() {
        String[] Asset_Trigger_Comparison_Type = {"Standard", "Commissioning", "Design"};
        return Asset_Trigger_Comparison_Type[random.nextInt(Asset_Trigger_Comparison_Type.length)];
    }

    public String generateAsset_Trigger_Work_Order_Type() {
        String[] Asset_Trigger_Work_Order_Type = {"RM", "PM"};
        return Asset_Trigger_Work_Order_Type[random.nextInt(Asset_Trigger_Work_Order_Type.length)];
    }

    public String generateAsset_Trigger_Description() {
        String[] Asset_Trigger_Description = {"TriggerDescription1", "TriggerDescription2", "TriggerDescription3", "TriggerDescription4", "TriggerDescription5", "TriggerDescription6"};
        return Asset_Trigger_Description[random.nextInt(Asset_Trigger_Description.length)];
    }

//    Scheduled Maintenance

    public String generateSS_Task_Sheet_Type() {
        String[] SS_Task_Sheet_Type = {"SST"};
        return SS_Task_Sheet_Type[random.nextInt(SS_Task_Sheet_Type.length)];
    }

    public String generateSS_Task_Sheet_Name() {
        String[] SS_Task_Sheet_Name = { "SS Task Sheet1", "SS Task Sheet2",  "SS Task Sheet3", "SS Task Sheet4", "SS Task Sheet5", "SS Task Sheet6",  "SS Task Sheet7"   };
        return SS_Task_Sheet_Name[  random.nextInt(SS_Task_Sheet_Name.length)];
    }

    public String generatePPM_Task_Sheet_Type() {
        String[] PPM_Task_Sheet_Type = {"PPM" , "SCM"};
        return PPM_Task_Sheet_Type[random.nextInt(PPM_Task_Sheet_Type.length)];
    }

    public String generatePPM_Task_Sheet_Name() {
        String[] PPM_Task_Sheet_Name = { "PPM Task Sheet1", "PPM Task Sheet2",  "PPM Task Sheet3", "PPM Task Sheet4", "PPM Task Sheet5", "PPM Task Sheet6",  "PPM Task Sheet7"   };
        return PPM_Task_Sheet_Name[  random.nextInt(PPM_Task_Sheet_Name.length)];
    }

    public String generateTask_Sheet_Contract_Group() {
        String[] Task_Sheet_Contract_Group = {"ALPHATPPM - Alpha Tower PPM Contract Group", "AK1306 - AK1306 CONTRACT GROUP"};
        return Task_Sheet_Contract_Group[random.nextInt(Task_Sheet_Contract_Group.length)];
    }

    public String generateTask_Sheet_Service_Group() {
        String[] Task_Sheet_Service_Group = {"BMS/Vertical Transport System", "BMS/Mechanical System/HVAC System", "BMS/Fire Fighting System", "BMS/Electrical System"};
        return Task_Sheet_Service_Group[random.nextInt(Task_Sheet_Service_Group.length)];
    }

    public String generateTask_Header_Name() {
        String[] Task_Header_Name = { "Task Header1", "Task Header2",  "Task Header3", "Task Header4", "Task Header5", "Task Header6",  "Task Header7"   };
        return Task_Header_Name[  random.nextInt(Task_Header_Name.length)];
    }

    public String generateTask_Line_Description() {
        String[] Task_Line_Description = { "Task Description1", "Task Description2",  "Task Description3", "Task Description4", "Task Description5", "Task Description6",  "Task Description7"   };
        return Task_Line_Description[  random.nextInt(Task_Line_Description.length)];
    }

    public String generateTask_Sheet_Approval_Comments() {
        String[] Task_Sheet_Approval_Comments = { "Comments1", "Comments2",  "Comments3", "Comments4", "Comments5", "Comments6",  "Comments7"   };
        return Task_Sheet_Approval_Comments[  random.nextInt(Task_Sheet_Approval_Comments.length)];
    }


//    Scheduled Maintenance Master

    public String generateTask_Frequency_Code_Master_Scheduled_Maintenance() {
        char letter = (char) ('A' + random.nextInt(26));
        int digit = random.nextInt(10);

        return "" + letter + digit;
    }
    public String generateTask_Frequency_Name_Master_Scheduled_Maintenance() {
        return "TaskFrequency" + System.currentTimeMillis();
    }

    public int generateFrequency_Period_Master_Scheduled_Maintenance() {
        return random.nextInt(99) + 1;
    }

    public int generateFirst_Run_Period_Master_Scheduled_Maintenance() {
        int[] First_Run_Period_Master_Scheduled_Maintenance = {10, 20, 30, 40, 50, 60};
        return First_Run_Period_Master_Scheduled_Maintenance[random.nextInt(First_Run_Period_Master_Scheduled_Maintenance.length)];
    }

    public String generateParameter_Master_ScheduledMaintenance() {
        return "Parameter" + System.currentTimeMillis();
    }


}