package lesson1_25_2;

import java.util.Random;

public class Super2 {
	// Q1：フィールドに名前の変数を定義
	String name;
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
	     
    public Super2() {
	Random rand = new Random();
	num1 = rand.nextInt();
	num2 = rand.nextInt();
	num3 = rand.nextInt();
	num4 = rand.nextInt();
	num5 = rand.nextInt();
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
}





