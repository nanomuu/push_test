package lesson1_18;

import java.util.Random;

public class Curriculum_New_1_18 {
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください
	// 渡されてきた値を引数に順番に代入
	public static void method() {
		String a = "Hello";
		String b = "JavaSE";
		int num = 11;
		String str = String.format(a + " " +b+" "+num);
		System.out.println(str);

	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void add(int x, int y) {
		System.out.println(x * y);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArray(int array[]) {
		for (int element : array) {
			System.out.println(element);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static double add(double x, double y) {
		System.out.println(x + y);
		return x + y;
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] random(int num1) {
		int[] rand = new int[num1];
		for (int i = 0; i < num1; i++) {
			Random R = new Random();
			rand[i] = R.nextInt(100) + 1;
			System.out.println(rand[i]);
		}
		return rand;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double[] average(int[] num) {
		double[] nums = new double[num.length];
		for (int a = 1; a < num.length; a++) {
			try {
				int Totalsum =0;
				double value = Double.valueOf(num[a]);
				nums[a] = value;
			} catch (NumberFormatException ne) {
				return null;
			}
		}
		System.out.println(nums[1]);
		return nums;	
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean isEven(int num2) {
		if (num2 >= 50) {
			return true;
		}
		return false;
	};

	// 作成したメソッドをここで呼び出してください
	public static void main(String[] args) {
		// Q1
		method();
		// Q2 
		add(1, 2);
		// Q3
		int[] array = { 1, 2, 3 };
		// Q4
		printArray(array);
		// Q5 
		int[] array2 = random(5);
		// Q6
		average(array2);
		// Q7
		boolean b = isEven(5);
		if (b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
