public class CountAndSayByStringBuffer {
    public String count(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuilder s = new StringBuilder();
        int head = 0;
        int now = 1;
        String a = count(n - 1);
        for (; now < a.length(); now++) {
            if (a.charAt(head) != a.charAt(now)) {
                s.append((now - head));
                s.append(a.charAt(head));
                head = now;
            }
        }
        if (head != now) {
            s.append((now - head));
            s.append(a.charAt(head));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        CountAndSayByStringBuffer test=new CountAndSayByStringBuffer();
        for(int i=1;i<50;i++){
            System.out.println("n="+i+":"+test.count(i));
        }
        //System.out.println(test.count(5));
        long endTime=System.currentTimeMillis();
        long time=endTime-startTime;
        System.out.println("--------------------");
        System.out.println("time="+time);
    }
}
