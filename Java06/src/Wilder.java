public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI(String firstname,  boolean aware){

        if (aware == true){
             return "Je m'appelle " + firstname + " et je suis aware ";
         }else {
             return  "Je m'appelle " + firstname + " et je pas suis aware";
         }

    }
}
