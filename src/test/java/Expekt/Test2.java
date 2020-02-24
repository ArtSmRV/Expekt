package Expekt;

import java.security.PublicKey;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.reflect.MethodMatcherException;


public class Test2 {
    private WebDriver driver;
    @BeforeMethod
    public void lounchBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Artur\\Downloads\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        driver = new ChromeDriver();
        driver.get("https://en.expekt.com/register");
        driver.manage().window().maximize();
    }
    @DataProvider(name = "Registration")
    public Object[][] getData()
    {
        Object[][] data=new Object[5][10];

        data[0][0]="ussSSS";
        data[0][1]="pass11";
        data[0][2]="urerЫЫЫ1";
        data[0][3]="paЭЭЭЄЄЄЄss";
        data[0][4]="lkkk";
        data[0][5]="1233";
        data[0][6]="11";
        data[0][7]="sdfsdf";
        data[0][8]="sdf";
        data[0][9]="dasa1";



        data[1][0]="2123";
        data[1][1]="";
        data[1][2]="фыв";
        data[1][3]="@@@";
        data[1][4]="@$@!!!";
        data[1][5]="12312321";
        data[1][6]="sasdadsa";
        data[1][7]="dasdas@bbb";
        data[1][8]="asdasdasd";
        data[1][9]="";


        data[2][0]="";
        data[2][1]="asd@gmal";
        data[2][2]=",./.";
        data[2][3]="";
        data[2][4]="231231";
        data[2][5]="asdaфывфыв!!!";
        data[2][6]="фывфыв";
        data[2][7]="1321   ";
        data[2][8]="    ";
        data[2][9]="";



        data[3][0]="sdada";
        data[3][1]="adasd";
        data[3][2]="";
        data[3][3]="asdas 1111";
        data[3][4]="*****";
        data[3][5]="asds фывфы";
        data[3][6]="111";
        data[3][7]="ыыыыыыыыыыыыыыыыыыыыы";
        data[3][8]="  1 ";
        data[3][9]="йуйцу";


        data[4][0]="";
        data[4][1]="";
        data[4][2]="";
        data[4][3]="";
        data[4][4]="1";
        data[4][5]="pass";
        data[4][6]="uфывфывrer1";
        data[4][7]="pas2№№33s";
        data[4][8]="  ыва";
        data[4][9]="s";




        return data;
    }


    @Test(dataProvider = "Registration")
    public void login(String name,String sur, String addr, String code, String town, String mob, String user, String pass, String mail, String conf)
    {
        driver.get("https://en.expekt.com/register");
        driver.findElement(By.id("FirstName")).click();
        driver.findElement(By.id("FirstName")).sendKeys(name);
        driver.findElement(By.id("Surname")).click();
        driver.findElement(By.id("Surname")).sendKeys(sur);
        driver.findElement(By.id("Address")).click();
        driver.findElement(By.id("Address")).sendKeys(addr);
        driver.findElement(By.id("Postcode")).click();
        driver.findElement(By.id("Postcode")).sendKeys(code);
        driver.findElement(By.id("Town")).click();
        driver.findElement(By.id("Town")).sendKeys(town);
        driver.findElement(By.id("MobileNumber")).click();
        driver.findElement(By.id("MobileNumber")).sendKeys(mob);
        driver.findElement(By.id("UserName")).click();
        driver.findElement(By.id("UserName")).sendKeys(user);
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).sendKeys(pass);
        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).sendKeys(mail);
        driver.findElement(By.id("EmailConfirm")).click();
        driver.findElement(By.id("EmailConfirm")).sendKeys(conf);
        driver.close();
    }



}