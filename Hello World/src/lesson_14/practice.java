
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package lesson_14;

public class practice {
	public static void main(String[] args) {
		// string型アルファベット配列を作成
		String[] arr1 = {"a","b","c","d","e","f","g","h","i","j"};
		// string iを定義
		String str = "i";
		// ループ文
		for (int i = 0; i < arr1.length; i++) {
			// iが3より大きい時にループを抜け出す
			if (i > 3) {
			// brake文を使用
			break;
		}
		// a~dを表示
		System.out.println(arr1[i]); 
		}
		// ループ文
		for (String s : arr1) { 
			// iの時はスキップする
			if (s.equals(str)) {
			// continue文を使用
			continue;
			}
		// i以外を表示
		System.out.println(s);
		}  
	}
}





