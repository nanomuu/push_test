
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
		// TODO 自動生成されたメソッド・スタブ
	String[] arr1 = {"a","b","c","d","e","f","g","h","i","j"};
	String str = "i";
	for (int i = 0; i < arr1.length; i++) {
        if (i > 3) {
        break;
    }
     System.out.println(arr1[i]); 
    }
	for (String s : arr1) { 
		if (s.equals(str)) {
        continue;
	}
    System.out.println(s);
    }  
  }
}

	  



