public class StrStr {
    String haystack;
    String needle;

    public StrStr(String haystack, String needle) {
        this.haystack = haystack;
        this.needle = needle;
    }

    public int str() {
        int lengthOfNeedle = needle.length();
        for (int start = 0; start <= haystack.length() - lengthOfNeedle; ++start) {
            if (haystack.substring(start, start + lengthOfNeedle).equals(needle))
            return start;
        }
        return -1;
    }

    public static void main(String[] args) {
        StrStr s=new StrStr("aaea","e");
        System.out.println(s.str());

    }
}

