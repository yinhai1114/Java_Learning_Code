public class Homework09{
	public static void main(String[] args){
		Music s = new Music("1", 300);
		s.play();
		System.out.println(s.getInfo());
	}
}
class Music{
	String name;
	int times;
	public Music(String name,int times){
		this.name = name;
		this.times = times;
	}
	public void play(){
		System.out.println("������" + name + "���ڲ���....ʱ��" + times + "��");
	}
	public String getInfo(){
		return "����" + name + "����ʱ��Ϊ" + times;
	}
}