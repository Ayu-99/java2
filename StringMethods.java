public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Strings are immutable
		
		String names = "John, Jack, Joe";
		System.out.println("String before:"+names);
		String newNames =  names.toUpperCase();
		System.out.println("String names after:"+names);
		System.out.println("String newNames after:"+newNames);
		
		// toLowerCase() 
		
		String names2 = names.concat(", Mike");
		System.out.println("Names now is:"+names);
		System.out.println("Names 2 after concatenation is:"+names2);
		
		String s2 = names.replace('J', 'K');
		System.out.println(">> Names after replacing is:"+names);
		System.out.println("s2 is:"+s2);
		
		char ch = names.charAt(2);
		System.out.println("ch is:"+ch);
		
		int length = names.length();
		System.out.println("Length is:"+length);
		
		
		int idx = names.indexOf('o');
		System.out.println("Index of o is:"+idx);
		
		int id = names.lastIndexOf('o');
		System.out.println("Index of o is:"+id);
		
		int i = names.indexOf("Joe");
		System.out.println("Index of Joe is:"+i); // Starting letter of Joe
		
		char[] arr = names.toCharArray(); //get data as Character Arrays from Strings
		
		int count = 0;
		for(char c:arr){
			if(c == 'J'){
				count++;
			}
			System.out.print(c+"");
		
			
		}
		System.out.println();
		System.out.println(count);
		
		//rest see from github
		//session13
		
		
		String students = "Mike, Leo, Harry, George, David";
		 String sarr[] = students.split(",");
		System.out.println(students);
		for(String s: sarr){
			System.out.println(s.trim());
			
		}
		
		//see h.w
		String quote = "Ayushi Sharma";
		String word = quote.substring(5);
		System.out.println("word is >>"+word);
		
		
		String salutation = "Mr.";
		String s4 = "John";
		String greeting = "Hello, "+ salutation + s4;
		// String greeting = "Hello".concat(salutation).concat(s4)
		
		System.out.println(greeting);
	}

}
