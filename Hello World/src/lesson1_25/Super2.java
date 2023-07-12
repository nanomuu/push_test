package lesson1_25;

import java.util.Random;

public class Super2 {
	// Q1：フィールドに名前の変数を定義
	String name;
	String status;
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    String message;
	     
Super2() {
	Random rand = new Random();
	num1 = rand.nextInt();
	num2 = rand.nextInt();
	num3 = rand.nextInt();
	num4 = rand.nextInt();
	num5 = rand.nextInt();
	}
//nameを格納するメソッド
public void setName(String name) {
	this.name = name;
} 
	 
//nameを取得するメソッド
public String getName() {
	 return name;
}

//ステータスを格納するメソッド
public void setName2(String name) {
	this.status = name;
	 } 
	 
//ステータスを取得するメソッド
public String getName2() {
	 return status;
}

//HPを格納するメソッド
public void setNumber(int num) {
	 this.num1 = num;
}
//HPを取得するメソッド
public int getNumber() {
	 return num1;
}

//MPを格納するメソッド
public void setNumber2(int num) {
	 this.num2 = num;
	 }
	 
//MPを取得するメソッド
public int getNumber2() {
	 return num2;
	 }

//攻撃力を格納するメソッド
public void setNumber3(int num) {
	 this.num3 = num;
	 }

//攻撃力を取得するメソッド
public int getNumber3() {
	 return num3;
	 }

//素早さを格納するメソッド
public void setNumber4(int num) {
	 this.num4 = num;
}	 

//素早さを取得するメソッド
public int getNumber4() {
	 return num4;
}

//防御力を格納するメソッド
public void setNumber5(int num) {
	 this.num5 = num;
}

//防御力を取得するメソッド
public int getNumber5() {
	 return num5;
}	
//ステータスを格納するメソッド
public void setName3(String name) {
	this.message = name;
	 } 
	 
//ステータスを取得するメソッド
public String getName3() {
	 return message;
}
}





