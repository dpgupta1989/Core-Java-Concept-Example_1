package com.java.collection.arrayList;

public class Country {
	
	String name;
	String language;
	
	public Country(String name, String language){
		System.out.println("Calling Constructor");
		this.name=name;
		this.language=language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
