/*

 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50

  	コンソール出力結果

  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ

	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス

	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ

	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス

	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ

	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明


 */
package lesson1_27;

import java.util.Scanner;

public class Theme2 {

	public static void main(String[] args) {
		//標準入力を指定
		Scanner scanner = new Scanner(System.in);//修正
		String str = "";
	    String[] colors = str.split(",");
	    
	    for (int i = 0; i < colors.length; i++) {
	      System.out.println(colors[i]);
	    
		//一行を読み込んで返却 
		String name = scanner.nextLine();//修正

		//インスタンス化
		Theme2 status = new Theme2();
		//値代入
		//値代入
        scanner.close();
        
		
		Animal rion = new Animal();
		rion.name0 = "コンソールに文字を入力してください";
		rion.name = "ライオン";
		rion.meter = 2.1;
		rion.speed = 80;
		rion.name2 = "パンテラ レオ";
		System.out.println(rion.name0);
		System.out.println("動物名："+rion.name);
		System.out.println("体長："+rion.meter+"m");
		System.out.println("速度："+rion.speed+"km/h");
		System.out.println("学名："+rion.name2);
		rion.name3 = "ゾウ";
		rion.meter2 = 3.2;
		rion.speed2 = 40;
		rion.name4 = "ロキソドンタ・サイクロティス";
		System.out.println("動物名："+rion.name3);
		System.out.println("体長："+rion.meter2+"m");
		System.out.println("速度："+rion.speed2+"km/h");
		System.out.println("学名："+rion.name4);
		rion.name5 = "パンダ";
		rion.meter3 = 1.9;
		rion.speed3 = 30;
		rion.name6 = "アイルロポダ・メラノレウカ";
		System.out.println("動物名："+rion.name5);
		System.out.println("体長："+rion.meter3+"m");
		System.out.println("速度："+rion.speed3+"km/h");
		System.out.println("学名："+rion.name6);
		rion.name7 = "チンパンジー";
		rion.meter4 = 0.94;
		rion.speed4 = 25;
		rion.name8 = "パン・トゥログロディテス";
		System.out.println("動物名："+rion.name7);
		System.out.println("体長："+rion.meter4+"m");
		System.out.println("速度："+rion.speed4+"km/h");
		System.out.println("学名："+rion.name8);	
		rion.name9 = "シマウマ";
		rion.meter5 = 2.4;
		rion.speed5 = 65;
		rion.name10 = "チャップマンシマウマ";
		System.out.println("動物名："+rion.name9);
		System.out.println("体長："+rion.meter5+"m");
		System.out.println("速度："+rion.speed5+"km/h");
		System.out.println("学名："+rion.name10);	
		rion.name11 = "インコ";
		rion.meter6 = 0.1;
		rion.speed6 = 50;
		rion.name12 = "不明";
		System.out.println("動物名："+rion.name11);
		System.out.println("体長："+rion.meter6+"m");
		System.out.println("速度："+rion.speed6+"km/h");
		System.out.println("学名："+rion.name12);	
	    }	
	}
}





