package com.dms.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateDocPage{
	WebDriver driverL;
	
	
@FindBy(xpath="//*[text()='Create Document']")
private WebElement CreateDoc;

@FindBy(xpath="//*[@id=\"title\"]")
private WebElement DocTitle;

@FindBy(xpath="//div[@class='form-content flex']//div[contains(@class,'css-19bb58m')]")
private WebElement DocType;

@FindBy(xpath="//div[contains(@id,'react-select')][2]")
private WebElement DocTypeOption;

@FindBy(xpath="(//*[contains(@class,\"selected-process\")]) [1]")
private WebElement Process;

@FindBy(xpath="//*[@id=\"project-folderrepository\"]")
private WebElement Project;

@FindBy(xpath="//*[@id=\"project-folderrepository\"]")
private WebElement Categorization;

@FindBy(xpath="//*[@id=\"selectcategory\"]")
private WebElement Category;

@FindBy(xpath="//div[@id='selectkeywords']")
private WebElement Keywords;

@FindBy(xpath="(//*[contains(@for,\"keywords\")])[2]")
private WebElement KeywordsOptions;

@FindBy(xpath="//*[@id=\"description\"]")
private WebElement Description;

@FindBy(xpath="(//*[@class=\"rounded-0 text-white\"])[2]")
private WebElement Drive;

@FindBy(xpath="(//*[@type=\"submit\"])[2]")
private WebElement Submit;

@FindBy(xpath="//label[normalize-space()='IQ']")
private WebElement projectOption;

@FindBy(xpath="(//*[text()=\"Quality Assurance\"])[3]")
private WebElement processOption;

@FindBy(xpath="//*[@id=\"selectcategory\"]")
private WebElement category;

@FindBy(xpath="//label[normalize-space()='Test Categorry 2']")
private WebElement categoryOptions;


public	CreateDocPage(WebDriver driverR)
{
	driverL = driverR;
	PageFactory.initElements(driverR, this);
}



public void ClickonCreate1()
{
	CreateDoc.click();
}

public void sendDocTitle2() throws InterruptedException
{
	DocTitle.sendKeys("Test");
	Thread.sleep(2000);
	
}

public void SelectDocType3() throws InterruptedException
{
	DocType.click();
	Thread.sleep(3000);
//	Actions act = new Actions(driverL);
//	act.moveToElement(DocTypeOption);
	DocTypeOption.click();
//	DocType.sendKeys("t");
//	Thread.sleep(2000);
//	JavascriptExecutor js = (JavascriptExecutor)driverL;
//	js.executeScript("arguments[0].click();",DocTypeOption );
//		
}

public void SelectProcess4() throws InterruptedException
{
	Process.click();
	Thread.sleep(2000);
	processOption.click();
	Thread.sleep(2000);
	Process.click();
}

 public void SelectProject5() throws InterruptedException
 {
	 Project.click();
	 Thread.sleep(2000);
	 projectOption.click();
	 Thread.sleep(2000);
	 Project.click();
 }

 public void Selectcategory6() throws InterruptedException
 {
	 category.click();
	 Thread.sleep(2000);
	 categoryOptions.click();
	 Thread.sleep(2000);
	// category.click();
 }


 public void SelectKeywords7() throws InterruptedException
 {
	 Keywords.click();
	 Thread.sleep(2000);
	 KeywordsOptions.click();
	 Thread.sleep(2000);
	 Keywords.click();
 }

 
 public void AddDescription8() throws InterruptedException
 {
	 Description.click();
	 Description.sendKeys("Testing Data ");
	 Thread.sleep(2000);
 }

 public void SelectDrive9() throws InterruptedException
 {
	 Drive.click(); 
	 Thread.sleep(2000);
 }

 public void SubmitDoc10() throws InterruptedException
 {
	 Submit.click();
 }





}
