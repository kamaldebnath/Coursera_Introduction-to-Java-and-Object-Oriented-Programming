import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;  

public class CustomString{

	//instance variables
	
	String myString;
	
	boolean isSet;
	
	//constructor
	
	public CustomString() {
		// TODO Implement constructor
		this.myString = null;
		this.isSet = false;
	}
	
	// methods 
	
	public String getString() {
		// TODO Implement method
		if(this.myString == null || this.isSet == false)
			return null;
		else
			return this.myString;
	}
	
	public void setString(String string) {
		// TODO Implement method
		if(string == null)
			this.isSet = false;
		else
		{
			this.myString = string;
			this.isSet = true;
		}
	}
		
	public String remove(String arg) {
		 // TODO Implement method
		String newString = "";
		
		if(this.myString == null || this.myString.isEmpty() || this.isSet == false)
			return newString;
		else
		{
			newString = this.myString;
			
			String temp;
			
			for(int i=0; i<arg.length(); ++i)
			 {
				temp = "";
						
				if(Character.isLetter(arg.charAt(i)))
				{
					for(int j=0; j<newString.length(); ++j)
					{
						if(newString.charAt(j) != arg.charAt(i))
							temp = temp + newString.charAt(j);
					}	
					
					newString = temp;
				}
				
			 }
				 
			 return newString;
		}
	}
	
	public String reverse(String arg) {
		 // TODO Implement method 
		String newString = "";
		
		if(this.myString == null || this.myString.isEmpty() || this.isSet == false)
			return newString;
		else
		{
			newString = this.myString;
			
			String temp;
			
			for(int i=0; i<arg.length(); ++i)
			 {
				temp = "";
						
				if(Character.isLetter(arg.charAt(i)))
				{
					for(int j=0; j<newString.length(); ++j)
					{
						char c1 = newString.charAt(j);
						char c2 = arg.charAt(i);
						
						if(Character.toLowerCase(c1) == Character.toLowerCase(c2))
						{
							if(Character.isLowerCase(c1))
								temp = temp + Character.toUpperCase(c1);
							else
								temp = temp + Character.toLowerCase(c1);
						}
						else
							temp = temp + c1;
					}	
					
					newString = temp;
				}
				
			 }
				 
			 return newString;
		}
	}
		   
	public String filterLetters(char n, boolean more) {
		 // TODO Implement method
		String newString = "";
		
		if(this.myString == null || this.myString.isEmpty() || this.isSet == false || !Character.isLetter(n))
			return newString;
		else
		{			
			if(more)
			{
				for(int i=0; i<this.myString.length(); ++i)
				{
					char c = myString.charAt(i);
					
					if(Character.isLetter(c))
					{
						if((c >= 'a' && c < Character.toLowerCase(n)) || (c >= 'A' && c < Character.toUpperCase(n)))
							newString = newString + c;						
					}
					else
						newString = newString + c;
				}
			}
			else
			{
				for(int i=0; i<this.myString.length(); ++i)
				{
					char c = myString.charAt(i);
					
					if(Character.isLetter(c))
					{
						if((c > Character.toLowerCase(n) && c <= 'z') || (c > Character.toUpperCase(n) && c <= 'Z'))
							newString = newString + c;
					}
					else
						newString = newString + c;
				}
			}
			
			return newString;
		}
	}
}
