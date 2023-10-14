public class chapter2Exercise05{
	public static void main(String[] args){
		int num = 1;
		int count = 0;
		while (num <= 100){
			if(num % 5 != 0){
				count++;
				System.out.printf("%-6d",num);
				if (count % 5 == 0){
					System.out.printf("\n");
				}
			}
			num++;
		}
	}
}
