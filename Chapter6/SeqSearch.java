import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		String[] arr = {"A","B","C","D","E","F"};
		int len = arr.length;
		int count = 0;
		Scanner myScanner = new Scanner(System.in);

		while(true){
			System.out.println("Please enter a string to find");	
			String enter = myScanner.next();
			for(int i = 0;i < len;i++){
				if(enter.equals(arr[i])){
					System.out.println("Find string=" + arr[i] 
						+ " Its subscript is " + i);
					count ++;
					return;
				}
			}
			if (count == 0){
				System.out.println("Cant find the string,please try again");
			}
		}
	}
}