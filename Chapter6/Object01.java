public class Object01{
	public static void main(String[] args){
		String[] name = {"С��","С��"};
		int[] age = {3, 100};
		String[] colour = {"��ɫ","��ɫ"};
		String[] enter = new String[1];
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������Сè������");
		enter = myScanner.next();
		for(int i = 0; i = name.length; i++){
			if(name[i].equals(enter)){
				System.out.print("\n" + "Сè������" + name[i] + "Сè������" 
					+ age[i] + "Сè��ɫ��" + colour[i]);
			}
			else{
				System.out.print("\n" + "����̫û����ֻè");
			}
		}
	}
}

