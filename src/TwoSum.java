public class TwoSum {
    public int[] sum0(int numbers[],int target){
        int result[]={0,0};
        for(int i=0;i<numbers.length;i++){
            for(int j=numbers.length-1;j>i;j--){
                if(numbers[i]+numbers[j]==target){
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        TwoSum test=new TwoSum();
        int a[]={1,3,4,5,25,75};
        System.out.println(test.sum0(a,100)[0]);
        System.out.println(test.sum0(a,100)[1]);
    }
}
