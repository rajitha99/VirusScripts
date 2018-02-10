package TestDefinationLayer;

import java.io.IOException;
import java.util.List;
import org.testng.annotations.DataProvider;

import com.relevantcodes.extentreports.ExtentReports;

import ReportFactory.SimpleReportFactory;
import CrossBrowserFramework.UserActions;
public class StaticProvider extends UserActions{

public static ExtentReports reporter= SimpleReportFactory.getReporter("HtmlOutput\\F001_"+returnUnique()+".html");

@DataProvider(name="createReport")
public static Object[][] createData1() throws IOException
{
	Object[][] obj= new Object[1][1];
	obj[0][0]=StaticProvider.reporter;
	return obj;
}
}