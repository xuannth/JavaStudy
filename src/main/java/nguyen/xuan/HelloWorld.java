package nguyen.xuan;

public class HelloWorld {

	public static void main (String args[]) {
		String s = new String("Hello World");
		System.out.println("Doi chu o thanh chu O: " + s.replace('o', 'O'));
		
		char[] arr1= s.toCharArray();
		int len = arr1.length;
		
		System.out.println("Chuoi truoc khi dao nguoc la: ");
		for (int i = 0; i<len; i ++ ) {
			System.out.print(arr1[i]); 
		}
		
		char[] arr2 = new char[len];
		
		System.out.println("\nChuoi sau khi dao nguoc la: ");
		String result = "";
		
		for (int i = len - 1; i >= 0; i --) {
				arr2[len - 1 - i] = arr1[i];
				result += arr2[len - 1 -i];
		}	
		System.out.println(result);
		
		String str = s.toLowerCase();
		char[] arr3= str.toCharArray();
		int[] arr = new int[len];
		
		System.out.println("Chuoi truoc khi sap xep: ");
		
		for (int i = 0; i < len; i++) {
			arr[i] = (int)arr3[i];
			System.out.print((char)arr[i]);
		}
		
		int temp = arr[0];
		for (int i = 0; i < len-1; i++) {
			for (int j = i + 1; j < len; j++) {
	    		if (arr[i] > arr[j]) {
	    			temp = arr[j];
	    			arr[j] = arr[i];
	    			arr[i] = temp ;
	    		}
	    	}
		}
		
		System.out.println("\nSap xep chuoi theo Alphabet: ");
		for (int i = 0; i < len; i++) {
			System.out.print((char)arr[i]);
		}
		
	}
}
