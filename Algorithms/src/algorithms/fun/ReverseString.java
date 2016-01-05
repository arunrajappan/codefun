package algorithms.fun;

public class ReverseString {
	public String reverse(String input){
		if("".equalsIgnoreCase(input) || input == null){
			return "";
		}
		if(input.length() == 1){
			return input;
		}
		
		String rightString = reverse(input.substring(0, 1));
		String leftString = reverse(input.substring(1));
		
		return (leftString + rightString);
		
	}
}
