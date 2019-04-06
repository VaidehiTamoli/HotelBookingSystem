package com.fujitsu.shop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("welcome");
		System.out.println("welcome");
		System.out.println("java and JEE");
		Product pro = new Product(1001,"LED TV","Sony",56000);
		pro.display();
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded");
		}catch(Exception e) {
		e.printStackTrace();
		}
    }
}
