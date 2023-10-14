public class MiGong{
	public static void main(String[] args){
		//先设置迷宫墙壁，现在迷宫为8行7列
		int[][] map = new int[8][7];
		for(int i = 0;i < map.length;i++){//设置迷宫
			for(int j = 0;j < map[i].length;j++){
				if(i == 0 || i == map.length - 1){//第一行最后一行置为1
					map[i][j] = 1;
				}
				else{//剩下的每一行开头和结尾置为1
					map[i][0] = 1;
					map[i][map[i].length - 1] = 1;
				}
			}
		}
		map[3][1] = 1;//设置单独的墙
		map[3][2] = 1;
		map[2][2] = 1;
		MyTools way = new MyTools();
		way.findWay(map,1,1);
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
class MyTools{
	public boolean findWay(int[][] map , int i, int j) {
		if(map[6][5] == 2) {//说明已经找到
			return true;
		} else {
			if(map[i][j] == 0) {//当前这个位置 0,说明表示可以走
				//我们假定可以走通
				map[i][j] = 2;
				//使用找路策略，来确定该位置是否真的可以走通
				//下->右->上->左
				if(findWay(map, i + 1, j)) {//先走下
					return true;
				} else if(findWay(map, i, j + 1)){//右
					return true;
				} else if(findWay(map, i-1, j)) {//上
					return true;
				} else if(findWay(map, i, j-1)){//左
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else { //map[i][j] = 1 , 2, 3
			return false;
			}
		}
	}
}
