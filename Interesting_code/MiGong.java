public class MiGong{
	public static void main(String[] args){
		//�������Թ�ǽ�ڣ������Թ�Ϊ8��7��
		int[][] map = new int[8][7];
		for(int i = 0;i < map.length;i++){//�����Թ�
			for(int j = 0;j < map[i].length;j++){
				if(i == 0 || i == map.length - 1){//��һ�����һ����Ϊ1
					map[i][j] = 1;
				}
				else{//ʣ�µ�ÿһ�п�ͷ�ͽ�β��Ϊ1
					map[i][0] = 1;
					map[i][map[i].length - 1] = 1;
				}
			}
		}
		map[3][1] = 1;//���õ�����ǽ
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
		if(map[6][5] == 2) {//˵���Ѿ��ҵ�
			return true;
		} else {
			if(map[i][j] == 0) {//��ǰ���λ�� 0,˵����ʾ������
				//���Ǽٶ�������ͨ
				map[i][j] = 2;
				//ʹ����·���ԣ���ȷ����λ���Ƿ���Ŀ�����ͨ
				//��->��->��->��
				if(findWay(map, i + 1, j)) {//������
					return true;
				} else if(findWay(map, i, j + 1)){//��
					return true;
				} else if(findWay(map, i-1, j)) {//��
					return true;
				} else if(findWay(map, i, j-1)){//��
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
