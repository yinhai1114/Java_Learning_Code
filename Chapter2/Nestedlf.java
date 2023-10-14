import java.util.Scanner;//
public class Nestedlf{
	public static void main(String[] args){
		double score;
		char gender;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter your score(0.00~10.00)");
		score = myScanner.nextDouble();
		System.out.println("Enter your gender(male or female)");
		gender = myScanner.next().charAt(0);
		if((score >= 0.00 && score <= 10.00) && (gender == 'm' || 
			+ gender == 'f')){
			if(score > 8.0){
				if (gender == 'm') {
					System.out.println("Congratulations on the male final");
				}
				else {
					System.out.println("Congratulations on the female final");
				}
       		}
       	    else {
       			System.out.println("Regret,can't reach the final");
       	 	}
       }
        else{
        	System.out.println("Wrong date,pleas enter again");
       }
	}
}