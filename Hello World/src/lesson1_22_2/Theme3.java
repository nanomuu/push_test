package lesson1_22_2;

import java.text.SimpleDateFormat;
import java.util.Date;

//下記がコンソールに出力されるように作成してください

	//こんにちは！ここは日本です！
	//この寿司はうまい
	//寿司は和食です
	//今の現在日時は2023/03/09 10:23:39です

//【条件】
	//・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	//・適切なファイルにフィールドで変数を必要な数作ってください。
	//・thisを使って作成してください。
	//・日時は今日の日付を取得してください。

public class Theme3 {
	// フィールドに変数を定義
	public String japan;
	public String japan2;
	public String japan3;
	

	// 変数名を定義
	public Theme3() {
	this.japan = "こんにちは！ここは日本です！";
	this.japan2 = "この寿司はうまい";
	this.japan3 = "寿司は和食です";
	}
	
	// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
	//現在時刻の生成、取得
	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public String formatted = dateFormat.format(now); // formatメソッドでフォーマット

}