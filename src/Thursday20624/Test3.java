package Thursday20624;

public class Test3 {

	public static void main(String[] args) {
		int[] array= {5,36,2,9,4,11,30,1};
		int max=array[0];
		int min=array[0];
		
		for(int i=1;i<array.length;i++) {
			if (array[i]>max) {
				max=array[i];
			}
			if (array[i]<min) {
				min=array[i];
			}
		}
	System.out.println("Maximum value:"+max);
	System.out.println("Minimum value:"+min);

	}

}
