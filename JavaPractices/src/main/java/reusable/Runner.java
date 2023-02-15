package reusable;

public class Runner {
	public static void main(String[] args) {
		String name1="AGNI";
		String name2="agni";
		
		IStringUtills iStringUtills=new StringUtillImplementation();
		String convertedString1=iStringUtills.convertToLowerCase(name1);
		String convertedString2=iStringUtills.convertToUpperCase(name2);
		System.out.println(convertedString1);
		System.out.println(convertedString2);

	}
	
}
