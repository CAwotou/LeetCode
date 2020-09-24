public class MinArray {
    public int min(int numbers[]){
        int t;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    t=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=t;
                }
            }
        }
        return numbers[0];
    }

    public static void main(String[] args) {
        MinArray test=new MinArray();
        int a[]={3,4,5,1,2};
        System.out.println(test.min(a));
    }
}
