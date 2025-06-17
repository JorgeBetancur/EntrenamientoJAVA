package strings;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hola");
		sb.append("_Mundo");
		sb.insert(5,"Java");
		sb.replace(0, 4, "JB");
		sb.delete(3, 7);
		System.out.println(sb);

	}

}
