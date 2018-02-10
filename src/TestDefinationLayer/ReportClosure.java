package TestDefinationLayer;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportClosure {
@Test(dataProvider ="createReport",dataProviderClass=StaticProvider.class)
public static void closeReport(ExtentReports reporter)
{
	reporter.close();
}
}
 