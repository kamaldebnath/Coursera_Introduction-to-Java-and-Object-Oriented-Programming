import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;  
public class CustomString{
	String myString;
	boolean isSet;

	public CustomString() {
		// TODO Implement constructor
        this.myString = null;
        this.isSet = false;
	}

	public String getString() {
		// TODO Implement method
        if (this.myString != null) {
            return myString;
        }
        else
            return null;
	}

	public void setString(String string) {
		// TODO Implement method
        if (this.myString == null) {
            this.myString = string;
            this.isSet = true;
        } else {
            this.isSet = false;
        }
	}

   
	public String remove(String arg) {
		// TODO Implement method
		if (this.myString==null || this.myString == "") {
            return this.myString;
        }
        if (myString != null) {
            this.myString = myString.replaceAll(arg,"");
            System.out.println(myString);
        }
		
		return null;
	}
	
	
	public String reverse(String arg) {
		// TODO Implement method 
		char[] charArray = myString.toCharArray();
            for(int i=0; i < charArray.length; i++){
                if( Character.isUpperCase(charArray[i]) ){
                    charArray[i] = Character.toLowerCase( charArray[i] );
                }
                else if(Character.isLowerCase(charArray[i]) ){
                    charArray[i] = Character.toUpperCase( charArray[i] );
                }    
            }
        myString = new String(charArray);
		return null;
	}

    
	public String filterLetters(char n, boolean more) {
		// TODO Implement method
	String newStr = "";
        for (int i = 0; i < this.myString.length(); i++) {
            if (myString.charAt(i) >= n && more) {
                newStr = newStr + myString.charAt(i);
            } else if (myString.charAt(i) <= n && !more) {
                newStr = newStr + myString.charAt(i);
            }

            if(!Character.isLetter(myString.charAt(i))) {
                newStr = newStr + myString.charAt(i);
            }
        }
        return newStr;

	}
}
