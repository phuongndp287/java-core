public class StringExercise {
    //Convert string number to int value
    //B1: Chuyển chuỗi số nguyên sang int value. Ví dụ “5646” thành int = 5646.
    public static void main() {
        String number = "5646";
        int i = Integer.parseInt(number);
        System.out.println(i);
    }


    //B2: Đảo ngược chuỗi: "Toi La Leo Nguyen" sử dụng vòng lặp hoặc đệ quy.
    //Có thể sử dụng StringBuilder hoặc StringBuffer để reverse.
    //Giải thích tại sao lại làm như vậy.

    public static String reverseString (String input) {
        if (input == null) {
            return input;
        }

        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString = reverseString + input.charAt(i);
        }
        return reverseString;
    }

    public static void main (String[] args) {
        String input = "Toi La Leo Nguyen";
        System.out.println("Reverse String: " + reverseString(input));

        StringBuilder stringBuilder = new StringBuilder(input);
        System.out.println("Reverse String: " + stringBuilder.reverse());
    }
}
