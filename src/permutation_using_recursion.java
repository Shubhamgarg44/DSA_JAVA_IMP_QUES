import java.util.ArrayList;

public class permutation_using_recursion {
    public static void main(String[] args) {
        System.out.println( permutation("","abc"));
    }
    static ArrayList<String> permutation(String p, String up) {


        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
          list.addAll(  permutation(f + ch + s, up.substring(1)));
        }
        return list;
    }
}
