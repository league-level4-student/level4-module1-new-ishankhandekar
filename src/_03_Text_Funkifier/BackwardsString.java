package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier{

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	StringBuilder strB = new StringBuilder(unfunkifiedText);
    	unfunkifiedText = strB.reverse().toString();
        return unfunkifiedText;

    }
}
