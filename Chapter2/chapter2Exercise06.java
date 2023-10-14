public class chapter2Exercise05{
	public static void main(String[] args){
		int num = 1;
		int count = 0;
		while (num <= 100){
			if(!(num % 5 == 0)){
				count++;
				if (count % 5 == 0){
					System.out.printf("%-6d\n",num);
				}
				else{
					System.out.printf("%-6d",num);
				}
			}
			num++;
		}
	}
}
