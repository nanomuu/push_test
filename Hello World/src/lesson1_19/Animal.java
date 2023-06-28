package lesson1_19;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Animal {
	String name = "Dog";// インスタンス変数
	static int count; // static変数(クラス変数)

	
	// コンストラクタの定義
	Animal(){
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
	Dog dog = new Dog();
	dog.getName();
	// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
	System.out.println(Dog.count);
	// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
	//現在時刻の生成、取得
	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	String formatted = dateFormat.format(now); // formatメソッドでフォーマット
    System.out.println(formatted);
	}	
}
    
