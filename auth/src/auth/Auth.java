/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import javafx.scene.control.ComboBox;
//import javax.swing.JComboBox;
//import javax.swing.text.Element;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.Iterator;
//import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.PasswordAuthentication;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Auth {

    static ArrayList<WebElement> rows;
    static ArrayList<course> transcript = new ArrayList();
    static ArrayList<course> transcript2;
    public static void main(String[] args) {
//        try {			
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                String baseUrl = "https://webadvisor.barry.edu:443/WebAdvisor/WebAdvisor";

                // launch Chrome and direct it to the Base URL
                driver.get(baseUrl);

                LoginDialog lf = new LoginDialog(null,true);
                lf.setVisible(true);
                String uname = LoginDialog.username;
                String pword = LoginDialog.password;
                //String uname = "ricardo.gomez2";
                //String pword = "";
                WebDriverWait wait = new WebDriverWait(driver, 30);// 1 minute 
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("acctLogin")));
                WebElement lgn = driver.findElement(By.id("acctLogin"));
                lgn.click();
        
                WebElement username = driver.findElement(By.id("USER_NAME"));
                username.sendKeys(uname);
                WebElement pass = driver.findElement(By.id("CURR_PWD"));
                pass.sendKeys(pword);
                WebElement submit = driver.findElement(By.name("SUBMIT2"));
                submit.click();
                WebElement flist = driver.findElement(By.className("WBST_Bars"));
                flist.click();
                WebElement alist = driver.findElement(By.xpath("//*[@id=\"bodyForm\"]/div[3]/div[2]/ul[2]/li[3]/a"));
                alist.click();
                
                WebElement semSubmit = driver.findElement(By.name("SUBMIT2"));
                semSubmit.click();

                rows = (ArrayList)driver.findElements(By.xpath("//*[starts-with(@id,'LIST_VAR1')]"));
//                for (int i=0;i<rows.size();i++)
//                {
//                    System.out.println(rows.get(i).getAttribute("id"));
//                }
                

                WebElement table = driver.findElement(By.xpath("//*[@id=\"bodyForm\"]/div[4]/form/table/tbody/tr[1]/td/div/table/tbody"));
                List<WebElement> rows = table.findElements(By.tagName("tr"));
                System.out.println(rows.size());
                
                for (WebElement row:rows)
                {
                    List<WebElement> cells = row.findElements(By.tagName("td"));
                    if (cells.isEmpty()) continue;
                    String prefix="", number="", section="", title="", grade="", credits = "", term="";
                    String compound = "";
                    int dashIndex = 0, fSpace = 0, sSpace = 0; boolean skip = false;
                    for (int i=1;i<cells.size();i++) 
                    {
                        //System.out.println("i="+i);

                        switch(i)
                        {
                            case 1: 
                                compound = cells.get(i).getText(); 
                                
                                //System.out.println("*"+compound+"*");
                                if (compound.isEmpty()) continue;
                                
                                dashIndex = compound.indexOf('-');
                                if(dashIndex == -1)
                                {
                                    dashIndex = 0;
                                    skip = true;
                                    continue;
                                }
                                prefix = compound.substring(0,dashIndex);
                                if(prefix.isEmpty())
                                {
                                    skip = true;
                                    continue;
                                }
                                fSpace = compound.indexOf(' ');
                                number = compound.substring(dashIndex+1,fSpace);
                                sSpace = compound.indexOf(' ', fSpace+1);
                                section = compound.substring(fSpace+1, sSpace);
                                title = compound.substring(sSpace+1);
                                
                                break;
                            case 2: grade = cells.get(i).getText(); break;
                            case 3: credits = cells.get(i).getText();break;
                            case 6: term = cells.get(i).getText(); break;
                            default: break;
                        }
                    }
                    if(!skip)
                    {
                        if (term.isEmpty())
                            if (title.isEmpty())//one-word title
                                transcript.add(new course(prefix,number,"",section,"",grade,"TR"));
                            else//multi-word title
                                transcript.add(new course(prefix,number,"",section+" "+title,"",credits,"TR"));
                        else
                            transcript.add(new course(prefix,number,section,title,grade,credits,term));
                    }  
                }
                //Removes the unwanted invalid Course that is added to the transcript
                //prefix= number= section= title= grade= credits=CS-412 01 EMBEDDED MULTIMEDIA SYSTEMS term = TR
                transcript.remove(0);
                
                System.out.println("Number of classes on transcript: " + transcript.size() + "\n");
                
                for (int i=0;i<transcript.size();i++)
                {
//                    System.out.println(clist.get(i).title + " " + 
//                            clist.get(i).grade + " " + clist.get(i).credits
//                    + " " + clist.get(i).term);
                    transcript.get(i).print();
                    System.out.println();
                }
                transcript2 = (ArrayList<course>)transcript.clone();
                DegreeAudit da = new DegreeAudit(null,true);
                da.setVisible(true);

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        //if (actualTitle.contentEquals(expectedTitle)){
        //    System.out.println("Test Passed!");
        //} else {
        //    System.out.println("Test Failed");
        //}
       
        //close Chrome
        driver.close();
                    // Sets the authenticator that will be used by the networking code
		    // when a proxy or an HTTP server asks for authentication.
//                    Authenticator.setDefault(new CustomAuthenticator());			
//                    URL url = new URL("https://webadvisor.barry.edu:443/WebAdvisor/WebAdvisor");
//			
//                    // read text returned by server
//		    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
////		    
//		    String line;
//		    while ((line = in.readLine()) != null) {
//		    	System.out.println(line);
//		    }
//		    in.close();
		    
//		}
//		catch (MalformedURLException e) {
//			System.out.println("Malformed URL: " + e.getMessage());
//		}
//		catch (IOException e) {
//			System.out.println("I/O Error: " + e.getMessage());
//		}

    }
    public static class CustomAuthenticator extends Authenticator {

        // Called when password authorization is needed
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {

                // Get information about the request
                
                String prompt = getRequestingPrompt();
                String hostname = getRequestingHost();
                InetAddress ipaddr = getRequestingSite();
                int port = getRequestingPort();

                String username = "jharalambides";
                String password = "password";

                // Return the information (a data holder that is used by Authenticator)
                return new PasswordAuthentication(username, password.toCharArray());

        }

    }    
    public static class course {
        public String prefix, number, section, title, grade, credits, term;
        public course(String pref, String num, String sect, String ttl, 
                String crd, String gp, String trm)
        {
            prefix = pref;
            number = num;
            section = sect;
            title = ttl;
            grade = crd;
            credits = gp;
            term = trm;
        }
        public course(String pref, String num)
        {
            prefix = pref; number = num;
        }
        public String prefixNum(){
            return prefix + number;
        }
        public void print()
        {
            System.out.print("prefix = " + prefix + " number = " + number + " section = " + section + 
                    " title = " + title + " grade = " + grade + " credits = " + credits + " term = " + term);
        }
        public String printString()
        {
            return "prefix = " + prefix + " number = " + number + " section = " + section + 
                    " title = " + title + " grade = " + grade + " credits = " + credits + " term = " + term;
        }
    }
    public static class equiv
    {
        public course c;
        public ArrayList<course> ac;
        
        public equiv(course c, ArrayList<course> ac){
            this.c = c;
            this.ac = new ArrayList<course>(ac);
        }
        public boolean contains(String prefix, String num)
        {
            if ((c.prefix.contentEquals(prefix)) && (c.number.contentEquals(num)))
                    return true;
            else return false;
        }
        
    }
}
