package anotherExperiments.statics;

public class Solution {
    static String id;

    static {
        id = "aaa";
    }

    {
        id = "bbb";
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(id);
    }
}
