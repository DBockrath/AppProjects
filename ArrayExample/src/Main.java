class Main {
	
	public static void Main(String[] args) {
		
		int [] nums = {34, 56, 27, 94, 85, 73, 95, 47, 28, 76, 85};
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 45) {
				
				count++;
				
			}
			
		}
		
		System.out.println(count);
		
	}
	
}
