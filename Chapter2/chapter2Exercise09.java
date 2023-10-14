public class chapter2Exercise09{
	public static void main(String[] args){
		int sum = 0;
		int i = 0;
		while(i < 100){
			i++;
			int j = 0;
			while(j < i){
				j++;
				sum += j;
			}
		}	
		System.out.println(" sum=" + sum);
	}
}

