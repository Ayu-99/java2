
public class StringConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		String s1 = String.valueOf(i);
		float f =2.2F;
		String s2 = String.valueOf(f);
		System.out.println("i is:"+i);
		System.out.println("f is:"+f);
		
		
		char[] arr = {'j', 'o', 'h', 'n'};
		String s4 = new String(arr);
		System.out.println(">>s4 is:"+s4);
		
		String s5 = arr.toString();
		System.out.println(s5); // reference copy because arr is reference copys
	}

}
