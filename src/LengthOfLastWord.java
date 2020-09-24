public class LengthOfLastWord {
    public int lengthOfWord(String s){
       s=s.trim();
       int count=0;
       if(s==null||s.length()==0){
           return 0;
       }
       for(int i=s.length()-1;i>=0;i--){
           if(s.charAt(i)!=' '){
               count=count+1;
           }
           if(s.charAt(i)==' '){
               break;
           }
       }
       return count;
    }

    public static void main(String[] args) {
        LengthOfLastWord test=new LengthOfLastWord();
        System.out.println(test.lengthOfWord("abc cccccc bb    "));
    }
}
