public class CountBits {
    public int[] count(int num) {
        int[] bits = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    private int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x = x & (x - 1);
            ones++;
        }
        return ones;
    }

    public static void main(String[] args) {
        CountBits test=new CountBits();
        int a[]=test.count(5);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
