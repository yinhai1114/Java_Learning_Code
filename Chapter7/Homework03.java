public class Homework03{
	public static void main(String[] args){
		Book book1 = new Book(120);
		System.out.println("��ļ۸�Ϊ" + book1.price);
		if(book1.price > 100){
			
			System.out.println("�۸��Ϊ" + book1.chancePrice());
		}else{
			System.out.println("��ļ۸񲻱���Ϊ" + book1.price);
		}

	}
}
class Book{
	int price;
	public int chancePrice(){
		if(price > 150){
			price = 150;
		}
		else if(150 > price  && price > 100){
			price = 100;
		}
		return price;
	}
	public Book(int price){
		this.price = price;
	}
}