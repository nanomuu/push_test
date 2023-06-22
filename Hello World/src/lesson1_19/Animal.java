package lesson1_19;

import java.time.LocalDateTime;
public class Animal {
	String name;// インスタンス変数
	 static int count; // static変数(クラス変数)
	
	// コンストラクタの定義(コンストラクタについては後述)
	  Animal() {
	    count++; // countをインクリメント
	  }
	
	// インスタンスメソッド(nameを取得するため)
	  public String getName() {
	    return name;
	  }
	  
	// インスタンスメソッド(nameに値を代入するため)
	  public void setName(String name) {
	    this.name = name;
	  }
	
	// staticメソッド(countを取得するため)
	  public static int getCount() {
	    return count;
	  }
	
	
	  
	public static void main(String[] args) {
    // Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
	// dogという変数名でオブジェクトを作成(インスタンス化)
	Animal dog = new Animal();
	dog.setName("Dog"); // dogのnameをセット
	System.out.println(dog.getName()); // dogのnameを取得
	
	// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
	System.out.println(Animal.getCount()); // Animalクラスのcountを取得	
	// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
	LocalDateTime ldt = LocalDateTime.now();
	System.out.println(ldt);
	}
}
