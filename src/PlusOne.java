public class PlusOne {
    public int[] add(int digits[]){
        int len = digits.length;
        for(int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if(digits[i]!=0)
                return digits;
        }
//        digits = new int[len + 1];
//        digits[0] = 1;
//        return digits;
        int result[]=new int[digits.length+1];
        result[0]=1;
        System.out.println("length="+result.length);
        return result;
    }

    public static void main(String[] args) {
        PlusOne test =new PlusOne();
        int a[]={9};
        int b[]=test.add(a);
        for(int j=0;j<b.length;j++){
            System.out.println(b[j]);
        }


    }

}
