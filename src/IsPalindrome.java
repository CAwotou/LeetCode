public class IsPalindrome {
    public boolean palindrome(String s) {
        StringBuffer s1=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                s1.append(Character.toLowerCase(c));
            }
        }
        StringBuffer s2=new StringBuffer(s1).reverse();
        return s1.toString().equals(s2.toString());
    }

    public static void main(String[] args) {
        IsPalindrome test=new IsPalindrome();
        String s="A man, a plan, a canal: Panama";
        System.out.println(test.palindrome(s));
    }
}
