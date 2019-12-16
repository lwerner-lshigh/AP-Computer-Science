public class Website extends Text {
    private String url;
;
    public Website() {
        super("Lukas Werner's Website", "Lukas Werner", 2019);
        url = "HTTPS://lukaswerner.com";
    }
    public Website(String t, String a, int y, String u) {
        super(t,a,y);
        url = u;
    }
;
    public String toString() {
        return String.format("%s, %s", super.toString(), url);
    }
;
}