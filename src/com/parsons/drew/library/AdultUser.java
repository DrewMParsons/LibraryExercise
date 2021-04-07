package com.parsons.drew.library;

public class AdultUser implements LibraryUser
{
	private static final String FICTION ="Fiction";
	//instance variables
	private int age;
	private String bookType;
	
	//Constructor
	public AdultUser(int age, String bookType)
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
		if(age >12) {
			System.out.println
			("You have successfully registered under an Adult Account");
		}else {
			System.out.println
			("Sorry, Age must be greater than 12 to register as an Adult");
		}
		
	}

	@Override
	public void requestBook(String bookType)
	{
		if(bookType.equals(FICTION)) {
			System.out.println
			("Book Issued successfully, please return the book within 7 days");
		}else {
			System.out.println
			("Oops, you are allowed to take only adult Fiction books");
		}
		
	}
	
	
	
	
	

}

