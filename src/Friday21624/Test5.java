package Friday21624;

public class Test5 {
	static void findDuplicate(String s1) {
		char[] carray=s1.toCharArray();
		int length=carray.length;
		int count=0;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(carray[i]==carray[j]) {
					count++;
					System.out.print(carray[i]+""+count);
				}
			}
		}
	}

	public static void main(String[] args) {
		String s1=new String("Programming");
		findDuplicate(s1);
		

	}

}
