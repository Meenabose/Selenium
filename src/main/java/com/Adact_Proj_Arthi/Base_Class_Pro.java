package com.Adact_Proj_Arthi;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class_Pro {
	
	public static WebDriver driver;
	public static Alert al;
	
	public static Select s;
	public static Actions ac;
	public static Robot ro;
	
	public static void browser_Launch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Meena\\chromedriver_99chromedriver99.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void get(String url)
	{
		driver.get(url);
	}
	public static void send_Keys(WebElement element, String input)
	{
		element.sendKeys(input);
	}
	public static void click(WebElement element)
	{
		element.click();	
	}
	public static void close()
	{
		driver.close();
	}
	public static void quit()
	{
		driver.quit();
	}
	public static void navigate_To(String next)
	{
		driver.navigate().to(next);
	}
	public static void navigate_Back()
	{
		driver.navigate().back();
	}
	public static void navigate_Forward()
	{
		driver.navigate().forward();
	}
	public static void navigate_Refresh()
	{
		driver.navigate().refresh();
	}
	public static void get_Title()
	{
		System.out.println(driver.getTitle());
	}
	public static void get_CurrentUrl()
	{
		System.out.println(driver.getCurrentUrl());
	}
	public static void is_Displayed(WebElement display, String input)
	{
		boolean dis=false;
		
		if(dis=display.isDisplayed())
		{
			System.out.println("The element is displayed "+dis);
			display.sendKeys(input);
		}
		else
		{
			System.out.println("The element is not displayed");
		}
	}
	public static void is_Enabled(WebElement enable, String input)
	{
		boolean enab=false;
	
		if(enab = enable.isEnabled())
		{
			System.out.println("The element is enabled "+enab);
			enable.sendKeys(input);
		}
		else
		{
			System.out.println("The element is not enabled");
		}
	}
	public static void is_Selected(WebElement selec, String input)
	{
		boolean sel=false;
		if(sel = selec.isSelected())
		{
			System.out.println("The element is enabled "+sel);
			selec.sendKeys(input);
		}
		else
		{
			System.out.println("The element is not enabled");
		}
	}
	public static void get_Text(WebElement element)
	{
		element.getText();
	}
	public static void get_Attribute(WebElement element, String input)
	{
		element.getAttribute(input);
	}
	public static void is_Multiple(WebElement element)
	{
		s=new Select(element);
		boolean mul = false;
		if(mul = s.isMultiple())
		{
			System.out.println("The dropdown box is multiple drop down." +mul);
		}
		else
		{
			System.out.println("The dropdown box is not multiple drop down.");				
		}
	}
	public static void get_Options()
	{		
		List<WebElement> all = s.getOptions();
		for(WebElement al_op : all)
		{
			String text =al_op.getText();
			System.out.println(text);
		}
	}	
	public static void get_First_Selected_Options(WebElement element, String text)
	{
		s.getFirstSelectedOption();
		text = element.getText();
		System.out.println(text);
	}
	public static void get_All_Selected()
	{
		List<WebElement> allSel = s.getAllSelectedOptions();
		for(WebElement sel_opt : allSel)
		{
			String text=sel_opt.getText();
			System.out.println(text);			
		}	
	}
	public static void select_By_Index(WebElement element, int index)
	{
		s=new Select(element);
		s.selectByIndex(index);		
	}
	public static void select_By_Value(WebElement element, String text)
	{
		s=new Select(element);
		s.selectByValue(text);		
	}	
	public static void select_By_Visible_Text(WebElement element, String text)
	{
		s=new Select(element);
		s.selectByVisibleText(text);	
	}
	public static void deselect_By_Index(WebElement element, int index)
	{
		s=new Select(element);
		s.deselectByIndex(index);	
	}
	public static void deselect_By_Value(WebElement element, String text)
	{
		s=new Select(element);
		s.deselectByValue(text);		
	}	
	public static void deselect_By_Visible_Text(WebElement element, String text)
	{
		s=new Select(element);
		s.deselectByVisibleText(text);	
	}
	public static void deselect_All(WebElement element)
	{
		s=new Select(element);
		s.deselectAll();	
	}
	public static void scroll_Up_Down(WebElement element, int value, int value1)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(value, value1);", element);
	}
	public static void check_Box(WebElement element)
	{
		element.click();
	}
	public static void sim_alert(WebElement sim_element )
	{
		sim_element.click();
		al=driver.switchTo().alert();
		al.accept();	
	}
	public static void con_alert(WebElement element)
	{
		element.click();
		al=driver.switchTo().alert();
		al.dismiss();
	}
	public static void prompt_alert(WebElement element, String send)
	{
		element.click();
		al=driver.switchTo().alert();
		al.sendKeys(send);
		al.accept();
	}
	public static void Takescreenshot(String path) throws IOException
	{
		TakesScreenshot scr=(TakesScreenshot)driver;
		File src= scr.getScreenshotAs(OutputType.FILE);
		File Des=new File(path);
		FileUtils.copyFile(src, Des);
	}
	public static void action_Drag_Drop(WebElement drag, WebElement drop) throws AWTException
	{
		ac=new Actions(driver);
		ac.dragAndDrop(drag,drop).build().perform();		
	}
	public static void action_Drag_Drop(WebElement drag, int x, int y) throws AWTException
	{
		ac=new Actions(driver);
		ac.dragAndDropBy(drag, 60, 60).build().perform();
	}
	public static void action_Click_and_Hold(WebElement drag, WebElement drop) throws AWTException
	{
		ac=new Actions(driver);
		ac.clickAndHold(drag).moveToElement(drop).build().perform();
	}
	public static void action_Context_Click(WebElement righclick, WebElement drop) throws AWTException
	{		
		ac=new Actions(driver);
		ac.contextClick(righclick).build().perform();
	}
	public static void robot(int KeyEvent, int keycode) throws AWTException
	{
		ro = new Robot();
		ro.keyPress(KeyEvent);
		ro.keyRelease(keycode);
	}
	public static void implicit_Wait()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
	public static void explicit_Wait(WebElement wait_element)
	{		
		WebDriverWait wa= new WebDriverWait(driver, 30);
		wa.until(ExpectedConditions.visibilityOf(wait_element));
	}		
	public static void frame_By_Index(int frame_index)
	{
		driver.switchTo().frame(frame_index);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
	public static void frame_By_Name(String frame_name)
	{
		driver.switchTo().frame(frame_name);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
	public static void frame_By_element(WebElement frame_element)
	{
		driver.switchTo().frame(frame_element);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
	public static void window_Handle(String parent)
	{
		parent = driver.getWindowHandle();
	}
	public static void multiple_window_Handles(String title)
	{	
		Set<String> windowHandles = driver.getWindowHandles();
		for (String win_id : windowHandles) 
		{
			title = driver.switchTo().window(win_id).getTitle();
			System.out.println(title);
		}		
	}
	
/*	public static void fluent_Wait(int time)
	{
		
	Wait Flu_wa = new FluentWait(driver);
	
	Flu_wa.withTimeout(time, TimeUnit.MILLISECONDS);
	Flu_wa.pollingEvery(250, TimeUnit.MILLISECONDS);
	Flu_wa.ignoring(NoSuchElementException.class)
	Flu_wa.until(ExpectedConditions.alertIsPresent());
	}	
	
*/
	
}
