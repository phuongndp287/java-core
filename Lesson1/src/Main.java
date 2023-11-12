public class Main {
    static class Operation1 {
        int data = 50;

        void change(int data) {
            data = data + 100;
        }

    }

    static class Operation2 {
        int data = 50;

        void change(Operation2 op) {
            op.data = op.data + 100;
        }

    }

    public static void main(String args[]) {
        // Giải thích tại sao giá trị của op1 không thay đổi mà op2 lại bị thay đổi.
        Operation1 op = new Operation1();
        System.out.println("Trước khi thay đổi Operation1: " + op.data);
        op.change(500);
        System.out.println("Sau khi thay đổi Operation1: " + op.data);

        Operation2 op2 = new Operation2();
        System.out.println("Trước khi thay đổi Operation2: " + op2.data);
        op2.change(op2);
        System.out.println("Sau khi thay đổi Operation2: " + op2.data);
    }
}