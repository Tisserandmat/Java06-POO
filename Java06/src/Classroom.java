public class Classroom {
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Jean-Yve", false);
        Wilder wilder2 = new Wilder("Mathias" , true);

        String resultW1 = wilder1.whoAmI(wilder1.getFirstname(), wilder1.isAware());
        System.out.println( resultW1);
        String resultW2 = wilder2.whoAmI(wilder2.getFirstname(), wilder2.isAware());
        System.out.println(resultW2);
    }
}
