public class SmileyFactored {
    static int a = 40;
    //static final Company company = Company.FSOFT;
    int b = 50;

    static {
        a = 9;
        //company = Company.CMC_GLOBAL;
    }

    public SmileyFactored() {
    }

    void simpleDisplay() {
        a = 10;
        System.out.println(a);
        System.out.println(b);
    }

    static void staticDisplay() {
        System.out.println(a);
        //System.out.println(company);
    }

    public static void main(String[] args) {
        // Giai thich chuong trinh se chay nhu the nao ?
        SmileyFactored obj = new SmileyFactored();
        obj.simpleDisplay();
        staticDisplay();
    }
}
