package ReportFactory;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class SimpleReportFactory {


private static ExtentReports reporter;
public synchronized static ExtentReports getReporter(String path)
{
if (reporter==null)
{
	reporter= new ExtentReports(path,true,DisplayOrder.NEWEST_FIRST);
	
}
return reporter;

}

public static synchronized void closeReporter()
{
	reporter.flush();
}
}