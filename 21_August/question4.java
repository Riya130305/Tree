public class MergeTwoBSTs {
    private static void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    private static ArrayList<Integer> mergeArrays(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                merged.add(a.get(i++));
            } else {
                merged.add(b.get(j++));
            }
        }
        while (i < a.size()) merged.add(a.get(i++));
        while (j < b.size()) merged.add(b.get(j++));
        return merged;
    }

    public static ArrayList<Integer> merge(Node root1, Node root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        inorder(root1, list1);
        inorder(root2, list2);
        return mergeArrays(list1, list2);
    }