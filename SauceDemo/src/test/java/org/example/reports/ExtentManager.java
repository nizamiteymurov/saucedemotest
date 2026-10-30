//package org.example.reports;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import junit.framework.Assert;
//import org.openqa.selenium.devtools.v146.network.model.Response;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Locale;
//
//public class ExtentManager {
//
//    public static ExtentReports extent;
//
//
//    public static ExtentReports getInstance() throws IOException {
//
//        Locale.setDefault(Locale.ENGLISH);
//
//        //Report faylin saxlanilmasi ucun path
//        String reportPath = System.getProperty("user.dir") + "/reports/SeleniumReportDark.html";
//
//        //HTML hesabat ucun SpartReporter obyekti yaradilir
//        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
////        sparkReporter.loadXMLConfig(new File("extent-config.xml"));
//
//
//        sparkReporter.config().setReportName("Cucumber Selenium Report");
//        //sparkReporter.config().setDocumentTitle("Automation report");
//
//
//
//
//        extent = new ExtentReports();
//        extent.attachReporter(sparkReporter);
//
//
//        // Report faylinda environment haqqinda melumatlar gostermek ucun
//        extent.setSystemInfo("Environment", "QA");
//        extent.setSystemInfo("Tester", "Nizami");
//
//        return  extent;
//    }
//
//
//    public static void setLog(Response response, ExtentTest test, int id){
//
//
//        try {
//            String responseBody = "test";//response.getBody().asPrettyString();
//            if(responseBody.equals("test")){
//                String collapsibleHTML = "<details><summary>Click to expand response Body</summary><pre>" + responseBody + "</pre></details>";
//
//                if (id == 0) {
//                    test.log(Status.INFO, "Request sent: https://restful-booker.herokuapp.com/booking");
//                } else {
//                    test.log(Status.INFO, "Request sent: https://restful-booker.herokuapp.com/booking/" + id);
//                }
//
//                test.log(Status.PASS, "Response status code: " + response.getStatus() + collapsibleHTML);
//            }else{
//                Assert.fail();
//            }
//        }catch(AssertionError e){
//            test.log(Status.FAIL, "Response: " + e.getMessage());
//        }catch(Exception e){
//            test.log(Status.FAIL, "Response: " + e.getMessage());
//        }
//
//    }
//
//    public static void renameReport(String oldPath){
//
//        //Tarix formalasdiraq
//        String timestamp = new SimpleDateFormat("yyyy-MM-dd__HH-mm-ss").format(new Date());
//
//        //Yeni faylin adin deyisirik
//        String newPath = oldPath.replace("SeleniumReportDark.html", "SeleniumReportDark_" + timestamp + ".html");
//
//        //Fayli deyisirik
//        File oldFile = new File(oldPath);
//        File newFile = new File(newPath);
//
//        if(oldFile.renameTo(newFile)){
//            System.out.println("Report faylin adi deyisdirildi: "+ newPath);
//        }else{
//            System.out.println("Faylin adini deyisdirmek mumkun olmadi!");
//        }
//
//    }
//
//
//}
