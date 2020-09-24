public class MaxProfit {
    public int max(int prices[]){
        int profit=0,buy=0,t;
        for(int sell=1;sell<prices.length;sell++){
            if(prices[sell]<prices[buy]){
                buy=sell;
            }
            t=prices[sell]-prices[buy];
            if(t>profit){
                profit=t;
            }
        }
//        for(int i=0;i<prices.length-1;i++){
//           for(int j=i+1;j<prices.length;j++){
//               t=prices[j]-prices[i];
//               if(t>profit){
//                   profit=t;
//               }
//           }
//        }

        return profit;
    }

    public static void main(String[] args) {
        MaxProfit test=new MaxProfit();
        int a[]={7,6,4,3,1,9};
        System.out.println(test.max(a));
    }
}
