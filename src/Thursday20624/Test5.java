package Thursday20624;

public class Test5 {
	public static int removeDuplicates(int array[],int n) {
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(array[i]!=array[i+1]) {
				temp[j++]=array[i];
			}
		}
		temp[j++]=array[n-1];
		for(int i=0;i<j;i++) {
			array[i]=temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int array[]= {1,1,2,3,3,4,4,4,4,5,5,6,6,7,7,7,4,8,6,9,9,10,10,11};
		int length=array.length;
		System.out.println(length);
		System.out.println("Array before Removing Duplicates:");
		for(int i=0;i<length;i++) {
			System.out.print(array[i]+"");
			length=removeDuplicates(array,length);
			}
		System.out.println("\n Array After Removing Duplicates:");
		for(int i=0;i<length;i++) {
			System.out.print(array[i]+"");
		}
		
		
	

	}

}
