package nguyen.xuan;

public class HelloWorld {

	public static void main (String args[]) {
	
		String s;
		s = "Hello World!";
		
		System.out.println("Vi tri ki tu o trong chuoi la: " + s.indexOf("o"));
		
		System.out.println("Tai vi tri thu 7 cua chuoi la ki tu: " + s.charAt(7));
			
		System.out.println("Chuoi s co do dai la: " + s.length());
		
		System.out.println("Bien doi chuoi toan bo thanh chu hoa: " + s.toUpperCase());
		
		System.out.println("Bien doi chuoi toan bo thanh chu thuong: " + s.toLowerCase());
		
	
		
	}
}
