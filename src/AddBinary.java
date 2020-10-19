/**
 * @author hjs
 */
public class AddBinary {
    public String add(String a, String b) {
//        String result = "";
//        int carry = 0;
//        int length = Math.max(a.length(), b.length());
//        if (a.length() < b.length()) {
//            for (int i = 0; i < b.length() - a.length(); i++) {
//                b = "0" + b;
//            }
//        }
//        if (a.length() > b.length()) {
//            for (int i = 0; i < a.length() - b.length(); i++) {
//                a = "0" + a;
//            }
//        }
//        System.out.println("length=" + length);
//
//        for (int i = length - 1; i >= 0; i--) {
//            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
//                if (carry == 1) {
//                    result = "1" + result;
//                } else {
//                    result = "0" + result;
//                }
//                carry = 1;
//            } else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
//                if (carry == 1) {
//                    result = "1" + result;
//                } else {
//                    result = "0" + result;
//                }
//                carry = 0;
//            } else {
//                if (carry == 1) {
//                    result = "0" + result;
//                    carry = 1;
//                }
//                if (carry == 0) {
//                    result = "1" + result;
//                    carry = 0;
//                }
//            }
//        }
//        if (carry == 1) {
//            result = "1" + result;
//        }
//        return result;

//        StringBuffer result = new StringBuffer();
//        int length = Math.max(a.length(),b.length())-1;
//        int carry = 0;
//        int lenthOfA=a.length();
//        int lenthOfB=b.length();
//        if(lenthOfA > lenthOfB){
//            for(int i = 0; i < lenthOfA - lenthOfB;i++){
//                b = "0" + b;
//            }
//        }else{
//            for(int i = 0; i < lenthOfB - lenthOfA;i++){
//                a = "0" + a;
//            }
//        }
//        while(length>= 0){
//            if(a.charAt(length) == '1' && b.charAt(length) == '1'){
//                if(carry == 1){
//                    result.append("1");
//                }else{
//                    result.append("0");
//                }
//                carry = 1;
//            }
//            else if(a.charAt(length) == '0' && b.charAt(length) == '0'){
//                if(carry == 1){
//                    result.append("1");
//                }else{
//                    result.append("0");
//                }
//                carry = 0;
//            }else{
//                if(carry == 1){
//                    result.append("0");
//                    carry = 1;
//                }else{
//                    result.append("1");
//                    carry = 0;
//                }
//            }
//            length--;
//        }
//        if(carry == 1){
//            result.append("1");
//        }
//        return result.reverse().toString();

        if (a.length() < b.length()) {
            return add(b, a);
        }
        int[] numA = new int[a.length() + 1];
        for (int i = 0; i < a.length(); i++) {
            numA[i + 1] = (int) a.charAt(i) - 48;
        }
        int[] numB = new int[numA.length];
        for (int i = 0; i < b.length(); i++) {
            numB[numA.length - b.length() + i] = (int) b.charAt(i) - 48;
        }
        for (int i = numA.length - 1; i > 0; i--) {
            numA[i] = numA[i] + numB[i];
            if (numA[i] == 2) {
                numA[i] = 0;
                numA[i - 1] = numA[i - 1] + 1;
            } else if (numA[i] == 3) {
                numA[i] = 1;
                numA[i - 1] = numA[i - 1] + 1;
            }
        }
        StringBuilder string = new StringBuilder();
        int i = 0;
        if (numA[0] == 0) {
            i = 1;
        }
        for (; i < numA.length; i++) {
            string.append(numA[i]);
        }
        return string.toString();

    }


    public static void main(String[] args) {
        AddBinary test = new AddBinary();
        String a = test.add("1010", "1011");
        System.out.println(a);
    }
}
