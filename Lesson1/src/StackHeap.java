public class StackHeap {
    String s;
    int n;

    public StackHeap(String s, int n) {
        this.s = s + n;
        n = n / 3;
    }

    public String changeString(String s) {
        s = this.s + s;
        return s;
    }

    public int changeInt(int n) {
        this.n = n;
        return n * 2;
    }

    @Override
    public String toString() {
        return "s=" + s + " n=" + n;
    }

    /**
     * Giải thích lại thông tin các biến và và object sẽ được lưu trữ ở đâu.
     *
     * @param args
     */
    public static void main(String[] args) {
        int n = 10;
        String s = "Initial";
        System.out.println("Before constructor: s=" + s);
        StackHeap stackHeap2 = new StackHeap(s, n);
        System.out.println("After constructor: stackHeap2=" + stackHeap2);
        System.out.println("After constructor: s=" + s);
        s = stackHeap2.changeString("TEST");
        System.out.println("After changeString(\"TEST\"): s=" + s);
        System.out.println("Result of call to changeString(\"More\"):" + stackHeap2.changeString("More"));
        System.out.println("After call to changeString(\"More\"): stackHeap1=" + stackHeap2);
        System.out.println("Result of call to changeInt(13):" + stackHeap2.changeInt(13));
        System.out.println("After call to changeInt(): stackHeap1=" + stackHeap2);
        System.out.println("End of main(): s=" + s);
        System.out.println("End of main(): n=" + n);
    }
}