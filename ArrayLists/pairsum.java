import java.util.ArrayList;

public class pairsum {
    public static boolean sum(ArrayList<Integer> al, int target) {
        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i) + al.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // tc = O(n^2)
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Given Array : " + al);
        int target = 10;
        System.out.println("Target sum  :" + target);
        System.out.println("Target present " + sum(al, target));
    }
}
