package nguyen.xuan;

import java.util.ArrayList;

public class HelloWorld {

	public static void main (String args[]) {
		ArrayList<String> dictionary = new ArrayList<String>();
		dictionary.add("Hello");
		dictionary.add("My name is Xuan");
		dictionary.add("I\'m thirty three years old");
		dictionary.add("Nice to meet you");
		dictionary.add("Goodbye");
		System.out.println("Cac cau tieng anh trong list la:");
		for (int i = 0; i < dictionary.size(); i ++) {
			System.out.println(dictionary.get(i));
		}
		System.out.println("Cac phan tu co trong list la: ");
		System.out.print(dictionary);
	}
}
