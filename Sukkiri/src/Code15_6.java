import java.util.Arrays;

public class Code15_6 {
	public static void main(String[] args) {
		String name = "A1A23567";
		if (isValidPlayerName(name)) {
			System.out.println("OK1");
		} else {
			System.out.println("NG");
		}
		String s = "Java";
		if(s.matches("Java")) {
			System.out.println("OK2");
		}
		if(s.matches("JavaJava")) {
			System.out.println("OK3");
		}
		if(s.matches("java")) {
			System.out.println("OK4");
		}
		if(s.matches("J.va")) {
			System.out.println("OK5");
		}
		s = "Jaaaava";
		if(s.matches("Ja*va")) {
			System.out.println("OK6");
		}
		s = "あいうxx019";
		if(s.matches(".*")) {
			System.out.println("OK7");
		}
		s = "146-0092";
		if(s.matches("[0-9]{3}-?[0-9]{4}")) {
			System.out.println("OK8");
		}
		s = "URI";
		if(s.matches("UR[LIN]")) {
			System.out.println("OK9");
		}
		if(s.matches("[A-Z]{3}")) {
			System.out.println("OK10");
		}
		if(s.matches("[A-Za-z0-9]{3}")) {
			System.out.println("OK11");
		}
		s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		System.out.println(Arrays.toString(words));
		
		String w = s.replaceAll("[beh]","X");
		System.out.println(w);
	}
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}