package lesson1_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name;
	// Q2：フィールドに動物の数の変数を定義してください。
	int count;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// 同じ変数名nameを定義
	Dog() {
		this.name = "犬";
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	//Q2の変数countに引数Animalcountを代入
	Dog(int Animalcount) {
		this.count = Animalcount;
	}
}