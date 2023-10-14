public class Method02{
	public static void main(String[] args){
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
		Mytools tools = new Mytools();
		tools.for01(map);
	}
}
class Mytools{
	public void for01(int[][] n){
		for(int i = 0;i < n.length;i++){
			for(int j = 0;j < n[i].length;j++){
				System.out.print(n[i][j]);
			}
			System.out.print(" ");
		}
	}
}