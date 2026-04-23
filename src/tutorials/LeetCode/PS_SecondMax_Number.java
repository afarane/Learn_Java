package LeetCode;

public class PS_SecondMax_Number {

	public static void main(String[] args) {
		
		
		 int[] a = { 6, 8, 2, 4, 3, 1, 5, 7 };
		 int max = Integer.MIN_VALUE;
		 int second_max = Integer.MIN_VALUE;
		 int temp;
		 
		 for(int i =0; i < a.length; i++) {
			 if (a[i] > max) {
				 temp = max;
				 max = a[i];
				 second_max = temp;
			 }else if (a[i] > second_max && a[i] != max) {
				 second_max = a[i];
			 }
		 }
		 
		 if(second_max == Integer.MIN_VALUE) {
			 System.out.println("No Max value");
			 
		 }else {
			 System.out.println(second_max);
		 }


	
	}

}
