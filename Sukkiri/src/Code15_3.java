import java.io.UnsupportedEncodingException;

public class Code15_3 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s1 = "Java programming";
		System.out.println("文字列s1の４文字目以降は" + s1.substring(3));
		System.out.println("文字列s1の４～8文字目は" + s1.substring(3, 8));

		char c = s1.charAt(0);
		System.out.println(c);

		System.out.println("s1を全部小文字にします" + s1.toLowerCase());
		System.out.println("s1を全部大文字にします" + s1.toUpperCase());

		String s2 = "　My name is John. ";
		System.out.println(s2.trim());
		System.out.println(s2.replace("　"," ").trim());

		System.out.println(s2.replace("John", "Paul"));
		
		String str = "こんにちはJava";
		char[] data1 = str.toCharArray();
		System.out.println(data1[0]); //こ
		byte[] data2 = str.getBytes("utf-8");
		System.out.println(data2[0]);
	}
}