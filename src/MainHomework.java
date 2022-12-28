import java.math.BigInteger;

public class MainHomework {
    public static void main(String[] args) {
        int a = -123;
        System.out.println(multiply("jsbfksja","sjdbfa"));
    }
    public static String multiply(String num1, String num2) {
        BigInteger bigInteger = new BigInteger(num1);
        BigInteger d = bigInteger.multiply(BigInteger.valueOf(Long.parseLong(num2)));
        return String.valueOf(d);
        //        StringBuilder stringBuilder = new StringBuilder();
//        char[] chars = String.valueOf(a).toCharArray();
//        for (int i = chars.length - 1; i >= 0; i--) {
//            stringBuilder.append(chars[i]);
//        }
//        int firstNumber = Integer.parseInt(String.valueOf(stringBuilder));
//        String s = String.valueOf(stringBuilder);
//        int result = 0;
//        if (firstNumber<0){
//            result = Integer.parseInt(String.valueOf(result).substring(s.length()-1));
//            int pars = Integer.parseInt("-"+result);
//            return pars == a;
//        }
//        return firstNumber == a;
    }
}