/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

package lesson1_23;
public class Animal {
//フィールド
private String name;
private double num1;
private int num2;


//setterメソッド
public void setName(String name) {
 this.name = name;
}

//getterメソッド
public String getName() {
return this.name;
}

//体長を格納するメソッド
public void setNumber(double num) {
	this.num1 = num;
}
		
//体長を取得するメソッド
public double getNumber() {
	return this.num1;
}

//速度を格納するメソッド
public void setNumber2(int num) {
	this.num2 = num;
}

//速度を取得するメソッド
public int getNumber2() {
	return this.num2;
}

public static void main(String[] args) {
	Animal name = new Animal();
	name.setName("ライオン");
	System.out.println("動物名："+ name.getName());
	name.setNumber(2.1);
	System.out.println("体長："+ name.getNumber()+"m");
	name.setNumber2(80);
	System.out.println("速度："+ name.getNumber2()+"km/h");
}

}