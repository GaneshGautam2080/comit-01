package com.comit.course._04_Strings;

public class Straings {

	// A string is a data structure that holds a sequence of characters
	
	public static void main(String[] args) {
		
		char[] chars = {'C','O', 'M','I','T'};
		String str0 = new String(chars);
		System.out.println(str0);
		
		
		String str1 = "ComIT";
	//	System.out.println(str1);
		
		/*String size */
		
		/* String Concatenation or join strings
		 * 
		 */
		String str2 = "Hello";
		String str3 = str2+ " " +str1;
		// System.out.println(str3);
		
		String str4 = str2.concat(str1);
				
				System.out.println(str4);
				
		String str5 = "    Hello    ";
		System.out.println("-->" + str5.trim() + "<--");
		str5 = str5.trim();
		System.out.println("-->" + str5 + "<--");
		
		String str6 = "    Hello    ";
		/* index 01234 */
		//System.out.println( str6.charAt(3));
System.out.println(str6.contains("el1"));

System.out.println(str6.equals("Hello"));
System.out.println(str6.equalsIgnoreCase("hello"));
		
		/* 
		 * String Repalcce
		 */
		System.out.println(str6.replace("Hello", "ComIT", "I love Java"));
		str6 =str6.replace("Hello", "ComIT", "I Love Java");
		System.out.println(str6);
		
		String str7= "ComIT, I Love Java";
		*/
		
		
		}
		
	}


