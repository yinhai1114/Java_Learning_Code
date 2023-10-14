public class chapter2Exercise07{
	public static void main(String[] args){
		char letter = 'a';
		int count = 0;
		while(letter <= 'z'){
			count++;
			System.out.printf("%-3c",letter);
			if (count % 5 == 0){
				System.out.printf("\n");
			}
			letter++;
		}
		System.out.printf("\n");
		letter = 'Z';
		count = 0;
		while(letter >= 'A'){
			count++;
			System.out.printf("%-3c",letter);
			if (count % 5 == 0){
				System.out.printf("\n",letter);
			}
			letter--;
		}
	}
}
