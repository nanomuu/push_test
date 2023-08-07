package lesson1_27_2;

import java.util.Scanner;

import lesson1_25.Super;

public class Animal2 {

	public static void main(String[]args) {

		//標準入力を指定
		Scanner scanner = new Scanner(System.in);//修正
		String str = "";
	    String[] colors = str.split(",");
	    
	    for (int i = 0; i < colors.length; i++) {
	    System.out.println(colors[i]);
		
		//一行を読み込んで返却 
		String name = scanner.nextLine();//修正

		//インスタンス化
		Super status = new Super();

		//値代入
		status.setName(name);//修正
		status.Super1();
		scanner.close();
	    }
	}
}