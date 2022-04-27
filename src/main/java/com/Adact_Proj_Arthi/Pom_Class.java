package com.Adact_Proj_Arthi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_Class {
	
	
	@FindBy(id="username")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="login")
	public static WebElement login;
	
	@FindBy(id="location")
	public static WebElement location;
	
	@FindBy(id="hotels")
	public static WebElement hotels;
	
	@FindBy(id="room_type")
	public static WebElement room_type;
	
	@FindBy(id="room_nos")
	public static WebElement no_of_rooms;
	
	@FindBy(id="datepick_in")
	public static WebElement check_in;
	
	@FindBy(id="datepick_out")
	public static WebElement check_out;
	
	@FindBy(id="adult_room")
	public static WebElement no_of_adults;
	
	@FindBy(id="child_room")
	public static WebElement no_of_children;
	
	@FindBy(id="Submit")
	public static WebElement search;
	
	@FindBy(id="Reset")
	public static WebElement reset;
	
	@FindBy(id="radiobutton_0")
	public static WebElement sele;
	
	@FindBy(id="continue")
	public static WebElement contin;
	
	@FindBy(id="cancel")
	public static WebElement cancel;
	
	@FindBy(id="first_name")
	public static WebElement first_name;
	
	@FindBy(id="last_name")
	public static WebElement last_name;
	
	@FindBy(id="address")
	public static WebElement address;
	
	@FindBy(id="cc_num")
	public static WebElement card_no;
	
	@FindBy(id="cc_type")
	public static WebElement card_type;
	
	@FindBy(id="cc_exp_month")
	public static WebElement expiry_month;
	
	@FindBy(id="cc_exp_year")
	public static WebElement expiry_year;
	
	@FindBy(id="cc_cvv")
	public static WebElement cvv;
	
	@FindBy(id="book_now")
	public static WebElement book_now;
	
	@FindBy(id="cancel")
	public static WebElement cancel1;
	
	@FindBy(id="logout")
	public static WebElement logout;	
}
