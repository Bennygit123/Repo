package org.ict.pages;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ict.base.BaseClass;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contactus extends BaseClass


	{
		public Contactus(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		@FindBy(name="name")
		private WebElement myname;

		@FindBy(xpath="//input[@name=\"email\" and @placeholder=\"Email id\"]")
		private WebElement email;

		@FindBy(xpath="//input[@name=\"coursename\" and @placeholder=\"What you love\"]")
		private WebElement lookingfor;

		@FindBy(xpath="//input[@name=\"subject\" and @placeholder=\"I want to say that...\"]")
		private WebElement message;

		//@FindBy(xpath="//div[@class=\"col-md-6 text-end ms-auto\"]")
		@FindBy(xpath="//div[@class='col-md-6 text-end ms-auto']")
		private WebElement sendbutton;

		@FindBy(xpath="//a[@href=\"/LandingPage/contactus\"]")
		private WebElement Contactus;

		public void Contactuspageload()
		{
		Contactus.click();
		}
		public void setName(String name)
		{
		myname.sendKeys(name);
		}

		public void setemail(String emailfield)
		{
		email.sendKeys(emailfield);
		}

		public void setlookingfor(String lookingfield)
		{
		lookingfor.sendKeys(lookingfield);
		}

		public void setmessage(String yourmessage)
		{
		message.sendKeys(yourmessage);
		}

		public void sendmessage()
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(sendbutton));
			
		sendbutton.click();
		}

}
