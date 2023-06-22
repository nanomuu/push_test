package lesson1_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	 String name; 
	// Q2：フィールドに動物の数の変数を定義してください。
	 static int count;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// コンストラクタを定義
	  Dog(String name) {
	    this.name = name; // 引数で受け取った値をインスタンス変数に代入している
	      }
	  public String getName() {
		return name;
		  }
	  public void setName(String name) {
		this.name = name;
		  }
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		class Main {
		public static void main(String[] args) {
	// Animal dog = new Animal();
	    Animal dog = new Animal();
	// dog.setName(); 
		System.out.println(dog.getName());
   }
}
}
