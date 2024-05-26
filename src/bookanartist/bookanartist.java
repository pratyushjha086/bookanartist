package bookanartist;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookanartist {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromeDriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get("https://hireanartist.com.au/post-a-job");
        driver.manage().window().maximize();
        WebElement pname = driver.findElement(By.xpath("//input[@id='project_name']")); 
        pname.sendKeys("Public Window Mural – Canada.");
        WebElement art = driver.findElement(By.xpath("//*[@id=\"category_id\"]/label[1]/span[2]")); 
        art.click();                           
        Thread.sleep(1000);
        WebElement mural = driver.findElement(By.xpath("//input[@value='Window']"));
        mural.click();
        WebElement width = driver.findElement(By.xpath("//input[@id='width']"));
        width.sendKeys("5");
        WebElement height = driver.findElement(By.xpath("//input[@id='height']"));
        height.sendKeys("5");
        WebElement abc = driver.findElement(By.xpath("//span[normalize-space()='ft.']"));
        abc.click();
        WebElement location = driver.findElement(By.xpath("//input[@placeholder='Search your location...']"));
        location.sendKeys("canada");
        Thread.sleep(1000);
        WebElement loct = driver.findElement(By.xpath("//span[normalize-space()='Cañada de Gómez, Santa Fe Province, Argentina']"));
        loct.click();
        WebElement top = driver.findElement(By.xpath("//span[normalize-space()='Public/Government']"));
        top.click();
        WebElement cont = driver.findElement(By.xpath("//button[@class='ant-btn css-6rzz9k ant-btn-primary custom-btn custom-btn__long btn__solid-primary']"));
        cont.click();
        Thread.sleep(1000);
        WebElement design = driver.findElement(By.xpath("//input[@value='No idea']"));
        design.click();
        WebElement details = driver.findElement(By.xpath("//textarea[@id='job_description']"));
        details.sendKeys("We are seeking an experienced mural artist to create\r\n"
        		+ "a captivating mural for a public window space measuring 5ft x 5ft in Canada.");
        WebElement fileattach = driver.findElement(By.xpath("//span[@class='custom-display-flex custom-flex-row column-gap-10 mt-10']"));
        fileattach.click();
        //Thread.sleep(1000);
        Robot rb = new Robot();
        rb.delay(2000);
        StringSelection ss = new StringSelection("C:\\Users\\Asus\\Downloads\\pk.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        WebElement contin = driver.findElement(By.xpath("//button[@class='ant-btn css-6rzz9k ant-btn-primary custom-btn custom-btn__long btn__solid-primary']"));
        contin.click();
        
        WebElement budget = driver.findElement(By.xpath("//input[@id='budget']"));
        budget.sendKeys("100.50");
          
        WebElement currency = driver.findElement(By.xpath("//input[@id='currency']"));
        currency.sendKeys("USD");
        Thread.sleep(1000);
        WebElement curr = driver.findElement(By.xpath("//div[@class='ant-select-item-option-content']//span[@class='countryCodeTxt'][normalize-space()='USD']"));
        curr.click();
        
        WebElement bd = driver.findElement(By.xpath("//input[@placeholder='Before date']"));
        bd.click();
        WebElement date = driver.findElement(By.xpath("//td[@title='2024-05-30']//div[@class='ant-picker-cell-inner'][normalize-space()='30']"));
        date.click();
        WebElement conti = driver.findElement(By.xpath("//button[@class='ant-btn css-6rzz9k ant-btn-primary custom-btn custom-btn__long btn__solid-primary']")) ;
        conti.click();
        WebElement indi = driver.findElement(By.xpath("//span[normalize-space()='An Individual']"));
        indi.click();
        WebElement phone = driver.findElement(By.xpath("//input[@id='mobile']"));
        phone.sendKeys("8210800948");
        WebElement fname = driver.findElement(By.xpath("//input[@id='first_name']"));
        fname.sendKeys("Pratyush");
        WebElement lname = driver.findElement(By.xpath("//input[@id='last_name']"));
        lname.sendKeys("Kumar");
        WebElement  email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("pratyushjha086@gmail.com");
        WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
        pwd.sendKeys("prat#@$");
        WebElement  agree = driver.findElement(By.xpath("//input[@id='terms_privacy']"));
        agree.click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        Thread.sleep(5000);
        WebElement captcha = driver.findElement(By.cssSelector(".recaptcha-checkbox-border"));
        captcha.click();
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        WebElement  submit = driver.findElement(By.cssSelector("button[type='submit'] span"));
        submit.click();
       // driver.quit();
        
	}  
	}
        
 
        
        
        
        
        