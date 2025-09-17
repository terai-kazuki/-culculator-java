
//変数の使い方
//データ型（int, double, char）
//ユーザー入力（Scanner）
//条件分岐（switch / if）
//四則演算の処理
//ゼロ除算の対策
//returnの使い方
//三項演算子（?:）
//クラスとmainメソッドの構造
//標準出力（System.out.println）

package studyApp;

import java.util.Scanner;

public class Caluculator {

	public static void main(String[] args) {
		try // 入力用Scannerを安全に使う（自動で閉じる）
		(
		Scanner scanner = new Scanner(System.in)) {
		
			System.out.println("数字を入力してください:");
			double num1 = scanner.nextDouble();

			System.out.println("演算子を入力してください (+, -, *, /):");
			// 入力された演算子を1文字として取得
			char operator = scanner.next().charAt(0);
			
			System.out.println("もう一つの数字を入力してください:");
			double num2 = scanner.nextDouble();

			double result = 0;

			// 演算子に応じた処理を分岐
			switch (operator){
			    case '+': result = num1 + num2; break;
			    case '-': result = num1 - num2; break;
			    case '*': result = num1 * num2; break;
		   // 演算子が「/」なら、割り算.ただし num2 が 0 の場合は NaN（計算不能）を返す 
		   // 割り算の処理（ゼロ除算の対策あり）
                case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
           // 無効な演算子への対応     
			    default: System.out.println("無効な演算子です"); return;
}
			    System.out.println("結果: " + result);
}
        
}
	
}
