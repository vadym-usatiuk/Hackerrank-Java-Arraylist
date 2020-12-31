
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<List<Integer>> A = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < n; i++) {
            int l = input.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            while(l-- > 0) {
                a.add(input.nextInt());
            }
            A.add(a);
        }
        
        int a = input.nextInt();
        while(a-- > 0) {
            int line = input.nextInt()-1;
            int position = input.nextInt()-1;
            if (line >= A.size()) {
                System.out.println("ERROR!");
            } else if (position >= A.get(line).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(A.get(line).get(position));
            }
        }
    }
}