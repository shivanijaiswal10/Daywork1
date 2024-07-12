package com.masai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcartopen {

	public static void main(String[] args) {
		
		  WebDriver  sj = new ChromeDriver(); // WebDriver is - Interface       and ChromeDriver is - Constructor   sj is - referance variable
		  sj.get("https://www.google.co.uk/");
		  sj.manage().window().maximize();
		  

	}

}
