public class MobiusText {

	public static void main(String[] args) {
		String text = "HELLOWORLD";
		String[] strs = mobius(text);
		for (String s : strs)
			System.out.println(s);
	}

	public static String[] mobius(String text) {
		String[] pushToMe = new String[text.length()];
		return mobiusH(text, pushToMe, 0);
	}

	public static String[] mobiusH(String text, String[] pushToMe, int counter) {
		if(counter == text.length())
			return pushToMe;
		else if(counter == 0) {
			pushToMe[counter] = text;
			return mobiusH(text, pushToMe, counter+1);
		}
		else {
			text = text.substring(1, text.length()) + text.charAt(0);
			pushToMe[counter] = text;
			return mobiusH(text, pushToMe, counter+1);
		}
	}

}
