package class17;

public class class17 {
    public static void main(String[] args) {
        String s = "262904713";
        if (Integer.parseInt(s) > 32767 || Integer.parseInt(s) < -32768) {
            System.out.println("s is overflow");
        } else {
            System.out.println(Short.parseShort(s));
        }
    }
}

// 印出結果Exception in thread "main" java.lang.NumberFormatException: Value out of
// range. Value:"262904713" Radix:10，溢位了，Short最小值=-32768，Short最大值=32767
// 因為short為16位元數的型態，正負各最多只能放(2 ^ 15 - 1) = 32767，，跟 -(2 ^ 15) = 32768，而
// 262904713，若為short則會溢位