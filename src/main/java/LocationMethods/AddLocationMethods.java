package LocationMethods;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddLocationMethods {
	public static Boolean addValidLocation(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			Random gen = new Random();
			int g = gen.nextInt(1000);
			wd.findElement(By.id("locAdd")).click();

			WebElement name=wd.findElement(By.xpath
					("//form/md-dialog-content/div/div/md-input-container[1]/input[1]"));
			name.sendKeys("Unused Test Location " + g);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement city = wd.findElement(By.xpath
					("//form/md-dialog-content/div/div/md-input-container[2]/input[1]"));
			city.sendKeys("Worldgate Test City");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement state = wd.findElement(By.xpath
					("//form/md-dialog-content/div/div/md-input-container[3]/md-select[1]"));
			state.sendKeys("k");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement save = wd.findElement(By.xpath
					("//form/md-dialog-actions/button[1]"));
			save.click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return wd.getPageSource().contains("Unused Test Location " + g);
		}
		else {
			return false;
		}
	}
	
	public static boolean addInvalidLocation(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			wd.findElement(By.id("locAdd")).click();
			
			WebElement city = wd.findElement(By.xpath
					("//form/md-dialog-content/div/div/md-input-container[2]/input[1]"));
			city.sendKeys("Fail Case City");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement state = wd.findElement(By.xpath
					("//form/md-dialog-content/div/div/md-input-container[3]/md-select[1]"));
			state.sendKeys("k");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement save = wd.findElement(By.xpath
					("//form/md-dialog-actions/button[1]"));
			save.click();
			state.sendKeys(Keys.ESCAPE);
			return wd.getPageSource().contains("Intended to fail");
		}
		else {
			return false;
		}
	}
	
	public static Boolean addPrevUsedName(WebDriver wd) {
		if(wd.getCurrentUrl().contains("location")) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			wd.findElement(By.id("locAdd")).click();

			
			WebElement name=wd.findElement(By.xpath
					("//form/md-dialog-content/div/div/md-input-container[1]/input[1]"));
			name.sendKeys("Worldgate Test Location");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement city = wd.findElement(By.xpath
					("//form/md-dialog-content/div/div/md-input-container[2]/input[1]"));
			city.sendKeys("Worldgate Test City");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement state = wd.findElement(By.xpath
					("//form/md-dialog-content/div/div/md-input-container[3]/md-select[1]"));
			state.sendKeys("k");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement save = wd.findElement(By.xpath
					("//form/md-dialog-actions/button[1]"));
			save.click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return wd.getPageSource().contains("Worldgate Test Location");
		}
		else {
			return false;
		}
	}
}
