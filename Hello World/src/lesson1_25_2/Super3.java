package lesson1_25_2;

import java.util.Scanner;

import lesson1_25.Super;
public class Super3 {

public static void main(String[]args) {

//標準入力を指定
Scanner scanner = new Scanner(System.in);//修正

System.out.print("名前");
//一行を読み込んで返却 
String name = scanner.nextLine();//修正

//インスタンス化
Super status = new Super();

//値代入
status.setName(name);//修正

}
}