package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 自分の手
		String myHand;
		// 相手の手
		String otherHand;
		
		// インスタンス化
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		
		// メソッド呼び出し
		// 自分の手を決定
		myHand = jyanken.getMyChoice();
		// 相手の手を決定
		otherHand = jyanken.getRandom();
		// じゃんけんを実行
		jyanken.playGame(myHand, otherHand);
	}

}
