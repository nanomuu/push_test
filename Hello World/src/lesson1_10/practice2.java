package lesson1_10;
/*	
問題.for文を使用して九九の計算を出力してください。
	※出力例 	1×1=1 1×2=2…1×9=9
				2×1=2 2×2=4…2×9=18
						・
						・
						・
				9×1=9 9×2=18…9×9=81
				*/

public class practice2 {

	public static void main(String[] args) {

		// 配列に1から9の値を格納
				int kuku[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
				// 掛け算の九九をループで表示
				for (int i : kuku) {
				for (int j :kuku) {
				System.out.printf("%d×%d=%d"+" ",i,j,i*j);
		}		
				System.out.println();		
     }
  }
}