import java.util.Stack;

public class ReverseString {
    public void reverse(char[]s){
//        Stack stack=new Stack();
//        for(int i=0;i<s.length;i++){
//            stack.push(s[i]);
//        }
//        char[]c=new char[s.length];
//        for(int j=0;j<s.length;j++){
//            c[j]= (char) stack.pop();
//        }
//        System.out.println(c);


        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
        System.out.println(s);

    }

    public static void main(String[] args) {
        char[] s= {'h','e','l','l','o'};
        ReverseString test=new ReverseString();
        test.reverse(s);

    }
}
