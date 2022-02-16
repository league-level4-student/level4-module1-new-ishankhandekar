package _03_Text_Funkifier;

public class   MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		for (int i = 0; i < unfunkifiedText.length(); i++) {
			if (i % 2 != 0) {
				StringBuilder strB = new StringBuilder(unfunkifiedText);
				strB.setCharAt(i, Character.toUpperCase(unfunkifiedText.charAt(i)));
				strB.setCharAt(0, Character.toLowerCase(unfunkifiedText.charAt(0)));
				
				unfunkifiedText = strB.toString();
			}
		}
		System.out.println(unfunkifiedText);
		return unfunkifiedText;
	}

}
