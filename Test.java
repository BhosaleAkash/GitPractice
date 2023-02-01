
class Test
{
	
	//Reverse the string
	public static void main1(String args[])
	{
		String s = "Welcomw to mumbai";
		
		for(int i = s.length()-1; i >=0 ; i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}
	
	//calculate the character of the string
	public static void main2(String args[])
	{
		String a = "Akash Bhosale";
		
		int count = 0;
		for(int i=0; i< a.length(); i++)
		{
			count++;
		}
		
		System.out.print(count);
	}
	
	
	//Calculate the character of the string
	public static void main4(String args[])
	{
		String a = "Akash Bhosale";
		
		int count = 0;
		for(int i=0; i< a.length(); i++)
		{
			if(a.charAt(i) == ' ')
				count = count ;
			else
				count++;
		}
		
		System.out.print(count);
	}
	
	//Calculate the count of perticular character
	public static void main8(String args[])
	{
		String a = "Akash Bhosale";
		
		int count = 0;
		for(int i=0; i< a.length(); i++)
		{
			if(a.charAt(i) == 'A' || a.charAt(i) == 'a')
				count++;
			else
				count = count;
				
		}
		
		System.out.print(count);
	}
	
	
	public static void main(String args[])
	{
		
		int a = 10;
		int c;
		
		try{
			
			 c = a + 10;
			 System.out.println(c);
		}
		
		
		finally{
			
			System.out.println("hello finally");
		}
			
	}
}