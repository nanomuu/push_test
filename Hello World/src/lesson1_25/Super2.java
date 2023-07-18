package lesson1_25;

public class Super2 {
	// コンストラクタを追加
	//カプセル化
	String name;
    private int hp;
    private int mp;
    private int attack;
    private int ability;
    private int defense;
	
    //生成
    public Super2() {
	}
    
    //代入
    public Super2(int hp,int mp,int attack, 
    int ability,int defense) {
    this.hp = hp;
    this.mp = mp;
    this.attack = attack;
    this.ability = ability;
    this.defense = defense;
	}  
//setter
public void setName(String name) {
  	this.name = name;
  	}   
    
//getter
public String getName() {
	return this.name;
}

//setter
public void setName2(String name) {
	this.name = name;
	}   
//getter
public String getName2() {
	return this.name;
}

public void setNumber(int num) {
	 this.hp = num;
}
//HPを取得するメソッド
public int getNumber() {
	 return hp;
}

//MPを格納するメソッド
public void setNumber2(int num) {
	 this.mp = num;
	 }
	 
//MPを取得するメソッド
public int getNumber2() {
	 return mp;
	 }

//攻撃力を格納するメソッド
public void setNumber3(int num) {
	 this.attack = num;
	 }

//攻撃力を取得するメソッド
public int getNumber3() {
	 return attack;
	 }

//素早さを格納するメソッド
public void setNumber4(int num) {
	 this.ability = num;
}	 

//素早さを取得するメソッド
public int getNumber4() {
	 return ability;
}

//防御力を格納するメソッド
public void setNumber5(int num) {
	 this.defense = num;
}

//防御力を取得するメソッド
public int getNumber5() {
	 return defense;
}
//setter
public void setName3(String name) {
	this.name = name;
	}   
//getter
public String getName3() {
	return this.name;
}
}







