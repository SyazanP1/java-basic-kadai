package kadai_021;

//import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary_Chapter21 {

	// HashMapを宣言
	HashMap<String, String> dictionary = new HashMap<String, String>();
	
	// コンソールに表示するArrayListを宣言
//	ArrayList<String> result = new ArrayList<String>();
	
	
	// エラーが出る
	// HashMapに値を格納
//	dictionary.put("","");
	
	// コンストラクタ
	public Dictionary_Chapter21() {
		// HashMapを宣言
//		HashMap<String, String> dictionary = new HashMap<String, String>();
		
		// 値を追加
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	
	// 単語を調べるメソッドを定義
	public void search(String word) {
		
		// 結果を保持するListの中身をクリア
//		result.clear();
		
		// 引数をキーに持つ値を保持
		String mean = dictionary.get(word);
		
		// 引数をキーに持つ値があるかどうか
		if(mean != null) {
			
			// 値がある場合
//			result.add(word + "の意味は" + mean);
			System.out.println(word + "の意味は" + mean);
		} else {
			
			// 値がない場合
			System.out.println(word + "は辞書に存在しません");
		}
	}
	
}
