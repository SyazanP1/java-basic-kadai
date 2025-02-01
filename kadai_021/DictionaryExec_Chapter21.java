package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// インスタンスを生成
		Dictionary_Chapter21 dic21 = new Dictionary_Chapter21();
		
		// 調べたい単語を配列に格納
		String[] searchWord = {"apple", "banana", "grape", "orange"};
		
		// メソッドで単語をひとつずつ調べていく
		for( int i = 0; i < searchWord.length; i++) {
			
			dic21.search(searchWord[i]);
		}

	}

}
