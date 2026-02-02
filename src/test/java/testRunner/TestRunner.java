package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "hooks"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:test-output/html/cucumber-report.json",
                "pretty"
        },
        monochrome = true,
        //DATA CONFIG
        //GuardMode
        //tags = "@addPatrolModes",
        //tags = "@PatrolModesEdit",
        //tags = "@PatrolModesDelete",
        //tags = "@ExportToExcelMode",
        //GuardShift
        //tags = "@addPatrolGuardShifts",
        //tags = "@PatrolShiftEdit",
        //tags = "@PatrolShiftDelete",
        //tags = "@ExportToExcelMode",
        //Transaction Guard-Route
        //tags = "@addPatrolRoute",
        //tags = "@EditPatrolRoute",
        //tags="@EditPatrolRouteUpdateStatus",
        //tags="@EditPatrolRouteAddRouteCheckPoints",
        //tags="@EditPatrolRouteAddRouteTimings",
        //tags="@DeletePatrolRoute",
        //tags="@ExportToExcelPatrolRoute",
        //Transaction Guard-Schedule
        //tags = "@AddPatrolSchedule",
        //tags = "@ExportToExcelPatrolSchedule",
        //tags = "@PatrolScheduleDetailPageViewUpdateButtonClick",
        //tags = "@PatrolScheduleLeftSideMenu",

//DATA CONFIG SALES ENQUIRY
        //Client Types
        //tags = "@SalesMasteraddClientTypes",
        //tags = "@SalesMasterEditClientTypes",
        //tags = "@SalesMasterDeleteClientTypes",
        //tags = "@ExporttoExcelClientTypes",
        //Enquiry Types
        //tags = "@SalesMasteraddEnquiryTypes",
        //tags = "@SalesMasterEditEnquiryTypes",
        //tags="@SalesMasterDeleteEnquiryTypes",
        //tags="@ExporttoExcelEnquiryTypes",
        //Enquiry Sources
        //tags="@SalesMasteraddEnquirySources",
        //tags="@SalesMasterEditEnquirySources",
        //tags="@SalesMasterDeleteEnquirySources",
        //tags="@ExporttoExcelEnquirySources",
        //Terms and Conditions
        //tags="@SalesMasteraddTermsandConditions",
        //tags="@SalesMasterEditTermsandConditions",
        //tags="@SalesMasterDeleteTermsandConditions",
        //tags="@SalesMasterExporttoExcelTermsandConditions",
        //Exclusion
        //tags="@SalesMasteraddExclusions",
        //tags="@SalesMasterEditExclusions",
        //tags="@SalesMasterDeleteExclusions",
        //tags="@SalesMasterExportToExcelExclusions",
        //Payment Terms
        //tags="@SalesMasteraddPaymentTerms",
        //tags="@SalesMasterEditPaymentTerms",
        //tags="@SalesMasterDeletePaymentTerms",
        //tags="@SalesMasterExportToExcelPaymentTerms",
        //Quotation Type NO ADD
        //tags="@SalesMasterEditQuotationTypes",
        //tags="@SalesMasterDeleteQuotationTypes",
        //tags="@SalesMasterExportToExcelQuotationTypes",
        //Quotation Line type and other cost ----Cannot edit as it affects sales quotation calculation
        //tags="@SalesMasterExportToExcelQuotationLineTypes",
        // tags="@SalesMasterOtherCostSortitemCode",
        //tags="@SalesMasterExportToExcelOtherCost",

        //DATA CONFIG Inventory
        //Item Type
        //tags="@addItemType",
        tags="@EditItemType",



//tags = "@addCompany",
 //tags="@CompanyDelete",
        dryRun = false
)
@Test
class TestRunner extends AbstractTestNGCucumberTests {
}
