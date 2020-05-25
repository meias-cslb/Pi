package cc.shinbi.pi;

public class Pi {
	public static void main(String[] args) {
		String line = "------------------------------------------------------------------------------------------";

		Step1();
		System.out.println(line);
		Step2();
		System.out.println(line);
		Step3();
		System.out.println(line);
		Step4();
		System.out.println(line);
		Step5();
		System.out.println(line);
		Step6();
		System.out.println(line);
		Step7();
		System.out.println(line);
		Step8();
	}

	public static void Step1() {
		System.out.println("【Step1】for文を使ってHello.を10回表示する");
		for(int i = 0; i < 10; i++) {
			System.out.println(i+ 1 + ": " + "Hello.");
		}
	}

	public static void Step2() {
		System.out.println("【Step2】0以上1未満の乱数を10回表示する");
		for(int i = 0; i < 10; i++) {
			System.out.println(i+ 1 + ": " + Math.random());
		}
	}

	public static void Step3() {
		System.out.println("【Step3】0以上1未満の乱数x,yのペアを10回表示する");
		double x = 0;
		double y = 0;

		for(int i = 0; i < 10; i++) {
			x = Math.random();
			y = Math.random();
			System.out.println(i+ 1 + ": x=" + x + ", y=" + y);
		}
	}

	public static void Step4() {
		System.out.println("【Step4】0以上1未満の乱数x,yのペアに対してx*x + y*y を計算したものを10回表示する");
		double x = 0;
		double y = 0;

		for(int i = 0; i < 10; i++) {
			x = Math.random();
			y = Math.random();

			double total = x*x + y*y;
			System.out.println(i+ 1 + ": " + total + " (x=" + x + ", y=" + y + ")");
		}
	}

	public static void Step5() {
		System.out.println("【Step5】Step4の後に、x*x + y*y の値が1以下になった回数を表示");
		double x = 0;
		double y = 0;
		int count = 0;

		for(int i = 0; i < 10; i++) {
			x = Math.random();
			y = Math.random();

			double total = x*x + y*y;

			if(total < 1) {
				count++;
			}

			System.out.println(i+ 1 + ": " + total + " (x=" + x + ", y=" + y + ")");
		}

		System.out.println("x*x + y*y の値が1以下になった回数: " + count);
	}

	public static void Step6() {
		System.out.println("【Step6】Step5の処理を10回から100万回に増やし、x*x + y*y の値が1以下になった回数のみ表示");
		double x = 0;
		double y = 0;
		int count = 0;

		for(int i = 0; i < 1000000; i++) {
			x = Math.random();
			y = Math.random();

			double total = x*x + y*y;

			if(total < 1) {
				count++;
			}

		}

		System.out.println(count + " / 1000000 回");
	}

	public static void Step7() {
		System.out.println("【Step7】Step6ででた回数を、実行回数(100万)で割って表示");
		double x = 0;
		double y = 0;
		int count = 0;

		for(int i = 0; i < 1000000; i++) {
			x = Math.random();
			y = Math.random();

			double total = x*x + y*y;

			if(total < 1) {
				count++;
			}

		}

		System.out.println("x*x + y*y の値が1以下になった回数: " + count + " / 1000000 回");
		System.out.println("x*x + y*y の値が1以下になった確率: " + (double)count / 1000000);
	}

	public static void Step8() {
		System.out.println("【Step8】Step7の値に4をかけた数を表示(おおよその円周率となる)");
		double x = 0;
		double y = 0;
		int count = 0;

		for(int i = 0; i < 1000000; i++) {
			x = Math.random();
			y = Math.random();

			double total = x*x + y*y;

			if(total < 1) {
				count++;
			}

		}

		System.out.println("x*x + y*y の値が1以下になった回数: " + count + " / 1000000 回");
		System.out.println("x*x + y*y の値が1以下になった確率: " + (double)count / 1000000);
		System.out.println("おおよその円周率: " + ((double)count / 1000000) * 4);
		System.out.println("正しい円周率: π= 3.141592…");
	}

}
