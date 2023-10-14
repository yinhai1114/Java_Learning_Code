public class chapter2Exercise08{
	public static void main(String[] args){
		double sum = 0.0;
		int count = 0;
		while(count < 100){
			count++;
			if(count % 2 == 0){
				sum -= 1.0 / count;//注意，这里由于count是int型，做除法要记得加小数
//自动转换为double型
			}
			else{
				sum += 1.0 / count;
			}
		}
		System.out.println(sum);
	}
}
