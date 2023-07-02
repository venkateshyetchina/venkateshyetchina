package com.risvaRachana;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentTestc {

	
		
		public static void main(String[] args) throws IOException  {
	        // Set the path to the ChromeDriver executable
	   

	        // Create a new instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));
	        driver.get("https://amazon.in");

	        // 2. Search for "Wrist Watches"
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.sendKeys("Wrist Watches");
	        searchBox.submit();
	        //3.Applying filter ="Analogue"
	        driver.findElement(By.linkText("Analogue")).click();
	      //4.Applying filter ="Leather"
	        driver.findElement(By.linkText("Leather")).click();
	      //5.Applying filter ="Titan" 
	        driver.findElement(By.linkText("Titan")).click();
	   //6.Applying filter =25% Off or more
	        driver.findElement(By.linkText("25% Off or more")).click();
	       
	        // getting fifth element from search
	WebElement fifthElement=driver.findElement(By.xpath("(//div[@data-index='7']//a)[1]"));
	fifthElement.click();
	//closing browser
	
	
	
	}

	}
   
	


