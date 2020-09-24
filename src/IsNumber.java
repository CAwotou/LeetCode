import java.util.HashMap;
import java.util.Map;

public class IsNumber {
    public boolean number(String s) {
        //sign:s
        //digit:d
        //dot:.
        //e:e
        Map[] states = {
                new HashMap<Character, Integer>() {{
                    put(' ', 0);
                    put('s', 1);
                    put('d', 2);
                    put('.', 4);
                }},// 0.起始的blank
                new HashMap<Character, Integer>() {{
                    put('d', 2);
                    put('.', 4);
                }},// 1.e之前的sign
                new HashMap<Character, Integer>() {{
                    put('d', 2);
                    put('.', 3);
                    put('e', 5);
                    put(' ', 8);
                }}, // 2.dot之后的digit
                new HashMap<Character, Integer>() {{
                    put('d', 3);
                    put('e', 5);
                    put(' ', 8);
                }},// 3.dot之后的digit
                new HashMap<Character, Integer>() {{
                    put('d', 3);
                }},// 4.当dot之前为空时，dot后的digit
                new HashMap<Character, Integer>() {{
                    put('s', 6);
                    put('d', 7);
                }},// 5.e
                new HashMap<Character, Integer>() {{
                    put('d', 7);
                }},// 6.e之后的sign
                new HashMap<Character, Integer>() {{
                    put('d', 7);
                    put(' ', 8);
                }},// 7.e之后的digit
                new HashMap<Character, Integer>() {{
                    put(' ', 8);
                }}// 8.尾部的blank
        };

        int p = 0;
        char t;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') t = 'd';
            else if (c == '+' || c == '-') t = 's';
            else if (c == 'e' || c == 'E') t = 'e';
            else if (c == '.' || c == ' ') t = c;//用字符本身表示字符类型
            else t = '?';
            if (!states[p].containsKey(t)) return false;
            p = (int) states[p].get(t);
        }
        return p == 2 || p == 3 || p == 7 || p == 8;
    }

    public static void main(String[] args) {
        IsNumber test = new IsNumber();
        System.out.println(test.number("3.14"));
    }
}
