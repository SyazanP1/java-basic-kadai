package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	// フィールドを宣言
	// 初回メッセージ
	String firstMessage = "自分のじゃんけんの手を入力しましょう\nグーはrockのrを入力しましょう\nチョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう";
	
	// メソッド定義
	// 自分のじゃんけんの手を入力値で決める
	public String getMyChoice() {
		// 初回メッセージを表示
		System.out.println(firstMessage);
		
		// 入力値を保持する変数
		String myHand = "";
		
		// 入力値が期待していない値の場合、再入力
		while (!(myHand.equals("r")) && !(myHand.equals("s")) && !(myHand.equals("p"))) {
			// 入力値がr,s,q以外の場合（初回入力時も）
			// 入力を受け付ける
			Scanner scanner = new Scanner(System.in);
			myHand = scanner.nextLine();
		}
	
		// 入力値がr,s,qの場合
		// 入力値（自分の手）を返す
		return myHand;
	}
	
	// メソッド定義
	// 相手のじゃんけんの手を決める
	public String getRandom() {
		
		// 配列を作成
		String[] randomArray = {"r", "s", "p"};
		
		// ランダムで手を決める
		int randomNum = (int)Math.floor(Math.random() * 3);
		String otherHand = randomArray[randomNum];
		
		// 相手の手を返す
		return otherHand;
	}
	
	// メソッド定義
	// じゃんけんを行う
	public void playGame(String myHand, String otherHand) {
		
		// 勝敗メッセージ
		String winMessage = "自分の勝ちです";
		String loseMessage = "自分の負けです";
		String drowMessage = "あいこです";
		
		// じゃんけんの手について、キーと値を関係づける
		HashMap<String, String> jyankenRelation = new HashMap<String, String>();
		jyankenRelation.put("r", "グー");
		jyankenRelation.put("s", "チョキ");
		jyankenRelation.put("p", "パー");
		
		// 自分と相手の手を表示
		System.out.println("自分の手は" + jyankenRelation.get(myHand) + ",相手の手は" + jyankenRelation.get(otherHand));
		
		// 自分と相手の手を比較して勝敗を決定
		if (myHand.equals("r")) {
			// 自分の手が「グー」
			switch (otherHand) {
			case "r" -> System.out.println(drowMessage);
			case "s" -> System.out.println(winMessage);
			case "p" -> System.out.println(loseMessage);
			}
		} else if (myHand.equals("s")) {
			// 自分の手が「チョキ」
			switch (otherHand) {
			case "r" -> System.out.println(loseMessage);
			case "s" -> System.out.println(drowMessage);
			case "p" -> System.out.println(winMessage);
			}
		} else if (myHand.equals("p")) {
			// 自分の手が「パー」
			switch (otherHand) {
			case "r" -> System.out.println(winMessage);
			case "s" -> System.out.println(loseMessage);
			case "p" -> System.out.println(drowMessage);
			}
		}
	}
}
