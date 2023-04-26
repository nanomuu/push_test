/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点

②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
 */
package lesson1_15;

public class Practice {
	public static void main(String[] args) {

		// 科目名
		String[] subjects = {"国語","英語","数学"};
		// 点数の配列を格納
		int test [][] = {{64,73,69},
				         {58,81,75},
				         {86,68,79},
				         {72,55,80}};
		// 配列を表示
		System.out.println("生徒1：" + subjects[0] + test[0][0] + "点、" + subjects[1] + test[0][1] + "点、"+ subjects[2] + test[0][2] + "点");
		System.out.println("生徒2：" + subjects[0] + test[1][0] + "点、" + subjects[1] + test[1][1] + "点、"+ subjects[2] + test[1][2] + "点");
		System.out.println("生徒3：" + subjects[0] + test[2][0] + "点、" + subjects[1] + test[2][1] + "点、"+ subjects[2] + test[2][2] + "点");
		System.out.println("生徒4：" + subjects[0] + test[3][0] + "点、" + subjects[1] + test[3][1] + "点、"+ subjects[2] + test[3][2] + "点");

		// 科目毎の平均点
		for (int i = 0; i < subjects.length; i++) {
		int sum = 0;
		for (int s = 0; s < test[i].length; s++) {
		// 点数を加算していく
	    sum += test[i][s];
		}
		//各教科の平均点
		System.out.println(subjects[i] + "の平均点は" + (double)sum / test.length + "点です。");
		}
	}
}

