package com.sevenrmartsupermarket.utilities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class GeneralUtility {
	public String get_attribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);

	}

	public String get_Cssproperty(WebElement element, String cssvalue) {
		return element.getCssValue(cssvalue);
	}

	public List<String> getTextofElements(List<WebElement> elements) {
		List<String> data = new ArrayList<String>();
		for (WebElement element : elements) {
			data.add(element.getText());
		}
		return data;
	}
	public static String getRandomName() {
		Faker faker = new Faker();
		return faker.name().firstName();
	}
	public static String getRandomAddress() {
		Faker faker = new Faker();
		return faker.address().fullAddress();
		
	}
	public static String getRandomFullName() {
		Faker faker = new Faker();
		return faker.name().fullName();
		
	}
	public static String getTimeStamp() {
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
		return timeStamp;
		
	}
}
