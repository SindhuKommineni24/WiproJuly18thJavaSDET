package labsession2;

public class Stringss {
	public static void main(String[] args) {
		String str5 = "Core Java";		 
		String str6 = "Selenium";
		System.out.println(str5.equals(str6));//false
		
		System.out.println(str5.equalsIgnoreCase(str6));//false
		
		System.out.println(str5.concat(str6));//Core JavaSelenium
		
		System.out.println(str5.substring(3)); //e Java
		
		System.out.println(str5.substring(1,3)); //or
		
		System.out.println(str5.replace("a","s")); //Core Jsvs
		
		System.out.println(str5.replaceAll(str5,"Telangana"));//Telangana
		
		System.out.println(str5.isEmpty()); //false
		
		System.out.println(str5.endsWith("d")); //false
		
		String str7=String.join("-","Hyderabad","Pune");
		
		System.out.println(str7);//Hyderabad-Pune
		
		System.out.println(str5.compareTo(str6));//-16
		
		
	}
}
