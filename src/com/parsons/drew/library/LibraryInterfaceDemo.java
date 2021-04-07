package com.parsons.drew.library;

public class LibraryInterfaceDemo
{

	public static void main(String[] args)
	{
		//TestCase #1
		KidUser k1 = new KidUser(10, "Kids");
		KidUser k2 = new KidUser(18, "Fiction");
		k1.registerAccount(k1.getAge());
		k2.registerAccount(k2.getAge());
		k1.requestBook(k1.getBookType());
		k2.requestBook(k2.getBookType());
		
		//TestCase #2
		AdultUser a1 = new AdultUser(5, "Kids");
		AdultUser a2 = new AdultUser(23,"Fiction");
		a1.registerAccount(a1.getAge());
		a2.registerAccount(a2.getAge());
		a1.requestBook(a1.getBookType());
		a2.requestBook(a2.getBookType());
		

	}

}
