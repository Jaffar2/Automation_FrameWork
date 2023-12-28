package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {

	public WebElement getWebElement(String identifierType, String identyfierValue) {

		switch (identifierType) {

		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(identyfierValue));

		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(identyfierValue));

		case "ID":
			return BaseTest.driver.findElement(By.id(identyfierValue));

		case "NAME":
			return BaseTest.driver.findElement(By.name(identyfierValue));

		case "TAGNAME":
			return BaseTest.driver.findElement(By.tagName(identyfierValue));

		case "LINKTEXT":
			return BaseTest.driver.findElement(By.linkText(identyfierValue));

		case "PARTIANLINKTEXT":
			return BaseTest.driver.findElement(By.partialLinkText(identyfierValue));

		default:
			return null;

		}

	}
	
	public List<WebElement> getWebElements(String identifierType, String identyfierValue) {

		switch (identifierType) {

		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identyfierValue));

		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(identyfierValue));

		case "ID":
			return BaseTest.driver.findElements(By.id(identyfierValue));

		case "NAME":
			return BaseTest.driver.findElements(By.name(identyfierValue));

		case "TAGNAME":
			return BaseTest.driver.findElements(By.tagName(identyfierValue));

		case "LINKTEXT":
			return BaseTest.driver.findElements(By.linkText(identyfierValue));

		case "PARTIANLINKTEXT":
			return BaseTest.driver.findElements(By.partialLinkText(identyfierValue));

		default:
			return null;

		}

	}

}
