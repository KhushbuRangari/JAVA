public class RemoveDupilcate {
    public static void main(String[] args) {
        String word = "DEVICE";
        int dup = 0;

        char a[] = word.toCharArray();
        char arrNew[] = new char[a.length];
        boolean flag = false;

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate Letter:" + a[i]);
                    flag = true;
                    break;
                }

            }
            if (flag == false) {
                arrNew[dup++] = a[i];
            }

        }
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i]);

        }

    }
}