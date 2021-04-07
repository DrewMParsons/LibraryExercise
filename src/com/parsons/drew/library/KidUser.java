package com.parsons.drew.library;

public class KidUser implements LibraryUser
{
	private static final String KIDS ="Kids";
	//instance variables
	private int age;
	private String bookType;
	
	//Constructor
	public KidUser(int age, String bookType)
	{
		super();
		this.age = age;
		this.bookType = bookType;
	}

	//Getters and Setters
	protected int getAge()
	{
		return age;
	}

	protected void setAge(int age)
	{
		this.age = age;
	}

	protected String getBookType()
	{
		return bookType;
	}

	protected void setBookType(String bookType)
	{
		this.bookType = bookType;
	}

	@Override
	public void registerAccount(int age)
	{
		if(age <=12) {
			System.out.println
			("You have successfully registered under a Kids Account");
		}else {
			System.out.println
			("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook(String bookType)
	{
		if(bookType.equals(KIDS)) {
			System.out.println
			("Book Issued successfully, please return the book within 10 days");
		}else {
			System.out.println
			("Oops, you are allowed to take only kids books");
		}
		
	}
	
	
	
	
	

}
