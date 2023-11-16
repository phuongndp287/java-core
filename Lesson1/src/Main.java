public class Main {
    static class Operation1 {
        int data = 50;

        void change(int data) {
            this.data = data + 100;
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
        //op.data = 50
        op.change(500);
        //op.change(500) = 600 là biến cục bộ không làm thay đổi giá trị op.data
        System.out.println("Sau khi thay đổi Operation1: " + op.data);
        //op.data = 50
        Operation2 op2 = new Operation2();
        System.out.println("Trước khi thay đổi Operation2: " + op2.data);
        //op2.data = 50
        op2.change(op2);
        //op2.change(op2) = 150 => Object op2 gọi đến data và thay đổi giá trị op2.data
        System.out.println("Sau khi thay đổi Operation2: " + op2.data);
    }
}