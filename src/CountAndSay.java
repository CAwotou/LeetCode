public class CountAndSay {
    public String countSay(int n){
        if(n==1){
            return "1";
        }
        String s="";
        int head=0;
        int now=1;
        String a=countSay(n-1);
        for(;now<a.length();now++){
            if(a.charAt(now)!=a.charAt(head)){
                s=s+(now-head);//times
                s=s+a.charAt(head);//figure
                head=now;
            }
        }
        if(head!=now){
            s=s+(now-head);
            s=s+a.charAt(head);
        }
        return s;
    }

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        CountAndSay test =new CountAndSay();
        for(int i=1;i<50;i++){
            System.out.println("n="+i+":"+test.countSay(i));
        }

        long endTime=System.currentTimeMillis();
        long time=endTime-startTime;
        System.out.println("---------------------");
        System.out.println("time="+time);
    }


}
