package strings;

public class StrigBuilderClass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hola");
		sb.append(" mundo");
		sb.insert(5, "Java ");
		sb.replace(0, 4, "Hi");
		sb.reverse();
		System.out.println(sb);

	}

}
