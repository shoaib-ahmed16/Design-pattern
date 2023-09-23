package StringBuilderOrStringBuilder;

public class AboutStringBuilder {

	public static void main(String[] args) {
		
		// String
		//Properties of String 
		// 1. Imputable. (we cannot change the string once created with the specific charaters.)
		// 2. All String store in specific Area in Heap memeory know as String pool.
		// 3. String pool has limited storing capacity.
		// 4. String pool is created once for the whole java application.
		
		
		// Due to the above properties and limitation of String java introduce the concept of
		//StringBuilder And StringBuffer;
		// Advantage --> we can create a mutable String which can be mutate any number of times 
		// for the same address of String or without changing the Address of string.
		//Stringbuilder and StringBuffer is defined as class in java.
		
		// how to use StringBuilder
		//	we create an object StringBuilder class.
			 StringBuilder sb = new StringBuilder();
		
	}
}
