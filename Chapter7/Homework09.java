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
		System.out.println("音乐名" + name + "正在播放....时长" + times + "秒");
	}
	public String getInfo(){
		return "音乐" + name + "播放时间为" + times;
	}
}