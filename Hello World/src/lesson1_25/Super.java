/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください
    
	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
package lesson1_25;

import java.util.Random;

public class Super {
    public static void main(String[] args) {
    //Super2.javaからSuper2クラスを呼び出す
	Super2 name = new Super2();
	Random ran;
	ran = new Random();
	name.setName("名前");
	System.out.println("こんにちは 「 "+name.getName()+" 」 さん"); //status
	name.setName2("ステータス");
	System.out.println(name.getName2());
	name.setNumber(ran.nextInt(1000));
	System.out.println("HP："+name.getNumber());
	name.setNumber2(ran.nextInt(1000));
	System.out.println("MP："+name.getNumber2());
	name.setNumber3(ran.nextInt(1000));
	System.out.println("攻撃力："+name.getNumber3());
	name.setNumber4(ran.nextInt(1000));
	System.out.println("素早さ："+name.getNumber4());
	name.setNumber5(ran.nextInt(1000));
	System.out.println("防御力："+name.getNumber5());
	System.out.println();
	name.setName3("さあ冒険に出かけよう！");
	System.out.println(name.getName3());
}
}
 
     


	 



 


	
