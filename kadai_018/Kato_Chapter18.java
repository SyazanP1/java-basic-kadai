package kadai_018;

abstract public class Kato_Chapter18 {
	
	// フィールド定義
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
	
	// メソッド定義：共通の紹介を出力
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	//  抽象メソッド定義：個別の紹介を出力
	abstract public void eachIntroduce();
	
	// メソッド定義：紹介を実行
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
	}
	
	// セッター
	public void setGivenName(String name) {
		this.givenName = name;
	}

}
