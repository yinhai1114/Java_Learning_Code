public class BreakDetail{
	public static void main(String[] args){
		label1:
		for(int j = 0;j < 4;j++){
			label2:
			for(int i = 0;i < 10;i++){
				if(i == 2){
					// break;
					//默认跳出最近的循环体，就是label2，但这是外层循环
					//仍然在执行，所以j= 0 i= 0 1 会重复回到j = 1 i = 0 1
					//直到j = 3
					break label1;//会跳出label1循环体，即只输出0 1
				}
				System.out.println("i=" + i);
			}	
		}
	}
}