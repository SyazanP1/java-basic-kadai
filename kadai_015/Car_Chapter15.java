package kadai_015;

public class Car_Chapter15 {

	// フィールドを初期化
	private int gear = 1;
	private int speed = 10;
	
	// メソッドを定義　ギアの値により速度を変える
	public void gearChange(int afterGear) {
		
		// 切り替え前後のギア数を表示
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		
		// 現在のギアをフィールドに代入
//		this.gear = afterGear;
		
		// ギアに応じて速度を変更
		switch(afterGear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
	}
	
	// メソッドを定義　速度を表示
	public void run() {
		System.out.println( "速度は時速" + this.speed + "kmです" );
	}
}
