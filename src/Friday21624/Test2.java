package Friday21624;

public class Test2 {

	public static void main(String[] args) {
		String n1="Work";
		String n2="Hard";
		System.out.println(n1.concat(n2));
		
		System.out.println(n2.replace('H', 'M'));
		System.out.println(n2.replaceAll("Hard", "Smart"));

		System.out.println(n1.indexOf('W'));
		String s=new String("Success is always under construction");
		
		System.out.println(s.replaceFirst("S", "a"));
		
		String ss="java is programming language";
		if(ss.contains("is")) {
			System.out.println("string avaialble");
		}
		else {
			System.out.println("Not available");
		}
		String str1="    Learn By Yourself    m";
		System.out.println(str1);
		System.out.println(str1.trim());
		
		String st="java is platform independent";
		System.out.println(st.substring(0,10));

	}

}
