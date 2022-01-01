package com.juaracoding.shopdemoqa.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String username;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${valueShoesColor}")
	private String valueShoesColor;
	
	@Value("${valueShoesSize}")
	private String valueShoesSize;
	
	@Value("${search}")
	private String search;
	
	@Value("${valueGlassColor}")
	private String valueGlassColor;
	
	@Value("${valueGlassSize}")
	private String valueGlassSize;
	
	@Value("${firstname}")
	private String firstName;
	
	@Value("${lastname}")
	private String lastName;
	
	@Value("${company}")
	private String company;
	
	@Value("${country}")
	private String country;
	
	@Value("${address1}")
	private String address1;
	
	@Value("${address2}")
	private String address2;
	
	@Value("${city}")
	private String city;
	
	@Value("${state}")
	private String state;
	
	@Value("${postcode}")
	private String postcode;
	
	@Value("${phone}")
	private String phone;
	
	public String getBrowser() {
		return browser;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getValueShoesColor() {
		return valueShoesColor;
	}
	
	public String getValueShoesSize() {
		return valueShoesSize;
	}
	
	public String getInputSearch() {
		return search;
	}
	
	public String getValueGlassColor() {
		return valueGlassColor;
	}
	
	public String getValueGlassSize() {
		return valueGlassSize;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getValueCountry() {
		return country;
	}
	
	public String getAddress1() {
		return address1;
	}
	
	public String getAddress2() {
		return address2;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getValueState() {
		return state;
	}
	
	public String getPostcode() {
		return postcode;
	}
	
	public String getPhone() {
		return phone;
	}
	
}
