package com.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static Alert t;
	public static TakesScreenshot s;
	public static JavascriptExecutor j;
	public static Select se;
	public static WebDriverWait wWait;
	public static FluentWait<WebDriver> fWait;
		
	
	
	//1.Launch browser
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	//2.Url
	public static void loadUrl(String url) {
		driver.get(url);
	}
	//3.Maximize
	public static void winMax() {
		driver.manage().window().maximize();
	}
	//4.Title
	public static void printTitle() {
		System.out.println(driver.getTitle());
	}
	//5.CurentUrl
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	//6.SendKeys
	public static void fill(WebElement ele , String value) {
		ele.sendKeys(value);
	}
	//7.Click
	public static void btnClick(WebElement ele) {
		ele.click();
	}
	//8.Close
	public static void close() {
		driver.close();
	}
	//9.quit
	public static void quit() {
		driver.quit();
	}		
	//10.by id
	public static void id(String value) {
		driver.findElement(By.id(value));		
	}
	//11.by name
	public static void name(String value) {
		driver.findElement(By.name(value));
	}
	//12.by class name 
	public static void cName(String value ) {
		driver.findElement(By.className(value));
	}
	//13.by tag name
	public static void tName(String value) {
		driver.findElement(By.tagName(value));
	}
	//14.get text
	public static void getTxt(WebElement ele) {
		System.out.println(ele.getText());
	}
	//15.get attribute
	public static void gAtt(WebElement ele, String value) {
		ele.getAttribute(value);
	}
	//16.print get attribute
	public static void pAtt(WebElement ele,String value) {
		System.out.println(ele.getAttribute(value));
	}
	//17.move to element
	public static void moveToEle(WebElement ele) {
		a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//19.drag and drop
	public static void drag(WebElement source,WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	//20.double click
	public static void dClick(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	//21.context click
	public static void cClick(WebElement ele) {
		a = new Actions(driver);
		a.contextClick().perform();
	}
	//22.build
	public static void build() {
		a = new Actions(driver);
		a.build().perform();
	}
	//23.send Keys using actions
	public static void sKeys(WebElement target,String keys) {
		a = new Actions(driver);
		a.sendKeys(target, keys);
	}
	//24.click using actions
	public static void clk() {
		a.click().perform();
	}
	//25.select all using robot
	public static void selectAll() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}
	//26. cut using robot
	public static void cut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);	
	}
	//27.copy
	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	//28.paste
	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	//29.tab
	public static void tab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	//30.shift
	public static void shift() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);
	}
	//31.enter
	public static void enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	//32.switch to alert 
	public static void switchToAl() {
		t = driver.switchTo().alert();
	}
	//33.accept
	public static void accept() {
		t = driver.switchTo().alert();
		t.accept();
	}
	//34.dismiss
	public static void dimiss() {
		t = driver.switchTo().alert();
		t.dismiss();
	}
	//35.send keys using alert
	public static void fill(String value) {
		t = driver.switchTo().alert();
		t.sendKeys(value);
	}
	//36.get text using alert
	public static void getText() {
		t = driver.switchTo().alert();
		System.out.println(t.getText());
	}
	//37.switch into frame using string id
	public static void idFrame(String id) {
		driver.switchTo().frame(id);
	}
	//38.switch into frame using string name
	public static void nameFrame(String name) {
		driver.switchTo().frame(name);
	}
	//39.switch into frame using int index
	public static void intFrame(int index) {
		driver.switchTo().frame(index);
	}
	//40.switch into frame using webElement ref
	public static void webEleFrame(WebElement ref) {
		driver.switchTo().frame(ref);
	}
	//41.switch into parent frame
	public static void parFrame() {
		driver.switchTo().parentFrame();
	}
	//42.switch to main frame
	public static void mainFrame() {
		driver.switchTo().defaultContent();
	}
	//43.to take a screenshot and save
	public static void screenshot(String path, String filename) throws IOException {
		s = (TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File des = new File(path + filename + ".jpg");
		FileUtils.copyDirectory(src, des);		
	}
	//44.send keys using javascript executor
	public static void fill(String attribute, String value, WebElement ele) {
		j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('" + attribute + "','" + value + "')", ele);
	}
	//45.get attribute using javascript executor
	public static void jsGetAtt(String attributeName, WebElement ele) {
		j = (JavascriptExecutor) driver;
		Object executeScript = j.executeScript("return arguments[0].getAttribute('" + attributeName + "')", ele);
		String text = executeScript.toString();
		System.out.println(attributeName + " :" + text);
	}
	//46.java Script Excecutor by Click
	public static void jsClk(WebElement ele) {
		j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click ()", ele);
	}
	//47.java Script Excecutor by Scroll top view
	public static void jsTop(WebElement ele) {
		j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
	//48.java Script Excecutor by Scroll bottom view
	public static void jsBottom(WebElement ele) {
		j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(false)", ele);
	}
	//49.java Script Excecutor by Send Key
	public static void jsHighlight(String backgoungColour, int pixel, String broderColour,
			WebElement ele) {
		j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('style','background:" + backgoungColour + "; border:" + pixel
				+ "px " + broderColour + ";');", ele);
	}
	//50.select by value
	public static void value(WebElement ele, String value) {
		se = new Select(ele);
		se.selectByValue(value);
	}
	//51.select by visible text
	public static void text(WebElement ele, String text) {
		se = new Select(ele);
		se.selectByVisibleText(text);
	}
	//52.select by index
	public static void index(WebElement ele, int index) {
		se = new Select(ele);
		se.selectByIndex(index);
	}
	//53.is multiple
	public static void isMulti(WebElement ele) {
		se = new Select(ele);
		se.isMultiple();
	}
	//54.get options
	public static void getOption(WebElement ele) {
		se = new Select(ele);
		List<WebElement> options = se.getOptions();
		System.out.println("Number of Options :" + options.size());
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).toString();
			System.out.println(text);
	     }
	}
	//55.get all selected options
	public static void getAllSelectedOptions(WebElement ele) {
		se = new Select(ele);
		List<WebElement> options = se.getAllSelectedOptions();
		System.out.println("Number of Options :" + options.size());
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).toString();
			System.out.println(text);
		}
	}
	//56.get First select Options
	public static void getFirstSelectedOption(WebElement ele) {
		se = new Select(ele);
		WebElement firstSelectedOption = se.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}
	//57.Deselect all Options
	public static void deSelecteAll(WebElement ele) {
		se = new Select(ele);
		se.deselectAll();
	}
	//58.deselect by value
	public static void deSelectValue(WebElement ele, String value) {
		se = new Select(ele);
		se.deselectByValue(value);
	}
	//59.deselect by index
	public static void deSelectindex(WebElement ele, int index) {
		se = new Select(ele);
		se.deselectByIndex(index);
	}
    //60.deselect by visible text
	public static void deSelecttext(WebElement ele, String text) {
		se = new Select(ele);
		se.deselectByVisibleText(text);
	}
	//61.single window handle
	public static void sinWinHandle() {
		String windowHandle = driver.getWindowHandle();		
		System.out.println(windowHandle);
	}
	//62.multi window handles
	public static void multiWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String eachId : windowHandles) {
			System.out.println(eachId);
		}
	}
	//63.switch to window
	public static void switchWindows() {
		String parentId = driver.getWindowHandle();	
		Set<String> allWindowsId = driver.getWindowHandles();
		for (String eachId : allWindowsId) {
			if(!parentId.equals(eachId)) {
			driver.switchTo().window(eachId);
		}
	}
	}
	//64.implicit wait
	public static void implicit(int secs) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	}
	//65.webdriver wait
	public static void WebDriver(int secs) {
		wWait = new WebDriverWait(driver,secs);
	}
	//66.fluent wait
	public static void fluent(int secs,int sec) {
		fWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(secs)).pollingEvery(Duration.ofSeconds(sec)).ignoring(Throwable.class);
	}
	//67.navigate and refresh
	public static void ref() {
		driver.navigate().refresh();
	}
	//68.Java script executer for drag and drop
	public static void draganddrop_javascript(WebElement from,WebElement to) {
		//JavascriptExecutor js = (JavascriptExecutor)driver
				j.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
				                    + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
				                    + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
				                    + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
				                    + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
				                    + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
				                    + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
				                    + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
				                    + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
				                    + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
				                    + "var dropEvent = createEvent('drop');\n"
				                    + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
				                    + "var dragEndEvent = createEvent('dragend');\n"
				                    + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
				                    + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
				                    + "simulateHTML5DragAndDrop(source,destination);", from, to);
		
	}
	//69.
	public static String proptxt(String proptext) throws IOException {
		String proppath = "C:\\workspace\\Certa\\src\\test\\java\\Locators.properties";
		FileReader reader = new FileReader(proppath);
		Properties p =new Properties();
		p.load(reader);
		return p.getProperty(proptext);

	}

}

