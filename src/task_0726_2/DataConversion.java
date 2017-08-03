package task_0726_2;

import java.util.Scanner;

//アラビア数字→ローマ数字変換クラス
public class DataConversion {

	// 処理開始、結果表示
	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("数字を入力してください。");

			int inputNum = scanner.nextInt();

			System.out.println(converseArabicNumToRomanNum(inputNum));
			System.out.println("完了しました。");

			scanner.close();

		} catch (Exception e) {
			System.out.println("エラーが発生しました。");
		} finally {
			System.out.println("処理を終了します。");
		}
	}

	//データ変換
	public static String converseArabicNumToRomanNum(int inputNum) {

		if (inputNum < 1 || 20 < inputNum) {
			return "変換できません。";
		}

		int devResultBy10 = inputNum / 10;
		int devRemBy10 = inputNum % 10;

		String one = "I";
		String five = "V";
		String ten = "X";
		String outputNum = "";

		//入力数字を10で割った時の結果と余りを基に、減算則を適用させるべき数字か判定、変換
		if (devRemBy10 == 4 & devResultBy10 == 0) {
			outputNum = one + five;
		}
		else if (devRemBy10 == 9 & devResultBy10 == 0) {
			outputNum = one + ten;
		}
		else if (devRemBy10 == 4 & devResultBy10 == 1) {
			outputNum = ten + one + five;
		}
		else if (devRemBy10 == 9 & devResultBy10 == 1) {
			outputNum = ten + one + ten;
		}
		else {
			//以下減算則不適用の数字
			//10で割った結果を基に10の位の数を特定、変換
			for (int i = 1; i <= devResultBy10; i++) {
				outputNum = outputNum + ten;
			}
			//10で割った余りを基に1の位の数(VとIの数)を特定、変換
			int devResultBy5 = devRemBy10 / 5;
			int devRemBy5 = devRemBy10 % 5;

			for (int i = 1; i <= devResultBy5; i++) {
				outputNum = outputNum + five;
			}

			for (int i = 1; i <= devRemBy5; i++) {
				outputNum = outputNum + one;
			}
		}
		return outputNum;
	}
}
