package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String[] itemNames = new String[5];
		int[] prices = new int[5];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			System.out.println("商品" + (i + 1) + "を入力してください: >");
			itemNames[i] = reader.readLine();

		}

		for (int i = 0; i < 5; i++) {
			System.out.println("各商品の単価を順に入力してください: ");
			System.out.println(itemNames[i] + "の名前");
			String str = reader.readLine();
			prices[i] = Integer.parseInt(str);

		}
		System.out.println("登録商品一覧");

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + ":" + prices[i] + "円");
		}

	}

}
