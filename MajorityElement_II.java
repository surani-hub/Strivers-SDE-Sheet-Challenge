import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElement_II {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 4, 4, 3, 4));

        System.out.println(majorityElementII(arr));
    }

    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.size();

        int cnt1 = 0, cnt2 = 0;
        int ele1 = 0, ele2 = 0;

        for (int num : arr) {
            if (cnt1 == 0 && ele2 != num) {
                cnt1++;
                ele1 = num;
            } else if (cnt2 == 0 && ele1 != num) {
                cnt2++;
                ele2 = num;
            } else if (ele1 == num) {
                cnt1++;
            } else if (ele2 == num) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for (int num : arr) {
            if (ele1 == num)
                cnt1++;
            if (ele2 == num)
                cnt2++;
        }

        int mini = (int) arr.size() / 3 + 1;
        if (cnt2 >= mini) {
            ans.add(ele2);
        }
        if (cnt1 >= mini) {
            ans.add(ele1);
        }

        return ans;
    }
}
