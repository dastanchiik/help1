
public class MainHomework {
    public static void main(String[] args) {
        int a = -123;
        char[] chars = new char[]{};
        reverseString(chars);
    }
    public static void reverseString(char[] s) {

        System.out.println( new StringBuilder(String.valueOf(s)).reverse());
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