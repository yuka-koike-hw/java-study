public class Test2{
	public static void email(String address, String title, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	public static void main(String[] args) {
		String address = "xxx@gmail.com";
		String title = "研修のお知らせ";
		String text = "明日本社にて研修を行います";
		email(address, title, text);
	}
}