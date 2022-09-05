package unchecked_exceptions;

public class IndexOutofBoundsException {
	public static void main(String[] args) {
		int[] nums = new int[5] ;
		
		nums[0] = 25;
		nums[1] = 100;
		nums[2] = 35;
		nums[3] = 45;
		nums[4] = 78;
//		nums[5] = 718;
		
		for(int i=0; i< nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
