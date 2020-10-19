/**
 * @author hjs
 */
public class BackspaceCompare {
    public boolean compare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String s) {
        StringBuffer ret = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char ch = s.charAt(i);
            if (ch != '#') {
                ret.append(ch);
            } else {
                if (ret.length() > 0) {
                    ret.deleteCharAt(ret.length() - 1);
                }
            }
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        BackspaceCompare test = new BackspaceCompare();
        System.out.println(test.compare("ab#c", "ad#c"));
    }

}
