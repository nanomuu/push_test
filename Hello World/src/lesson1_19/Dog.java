package lesson1_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	public String name; 
	// Q2：フィールドに動物の数の変数を定義してください。
	static int count;
	
	public String getName() {
	return name;
	}
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// コンストラクタを定義
	  Dog() {
		count++; // countをインクリメント
	    String name = "犬"; 
	    System.out.println(name);      
	  }
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	  Dog(String name){
		Dog dog = new Dog();
	// dog.setName(); 
		System.out.println(dog.getName());
	  }
}