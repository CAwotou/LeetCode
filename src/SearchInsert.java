public class SearchInsert {
    int a[] = new int[5];
    int index;


    public int seachAndInsert(int[] a, int index) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == index) {
                return i;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (index>=a[j]&&index <= a[j+1]) {
                return j +1;
            }
            if(index >= a[a.length]){
                return a.length+1;
            }
            if(index<=a[0]){
                return 0;
            }
        }
        if (index <= a[0]) {
            return 0;
        } else
            return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        SearchInsert si = new SearchInsert();
        System.out.println(si.seachAndInsert(a, 1));


    }
}
