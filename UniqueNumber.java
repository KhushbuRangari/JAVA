
public class UniqueNumber {
    public static void main(String[] args) {

        int[] a = { 2, 5, 3, 2, 5, 1, 2, 6, 2 };

        String chk = deDuplicate(a);
        String freqStr = findFrequency(a, chk);
        System.out.println(freqStr);
    }

    private static String findFrequency(int[] a, String chk) {
        String[] arr = chk.split(" ");
        String freqStr = "";
        for (int i = 0; i < arr.length; i++) {
            int counter = 1;
            String ckStr = "";
            for (int j = 0; j < a.length; j++) {
                if (arr[i].equals(a[j] + "")) {
                    ckStr = arr[i] + " " + counter++;
                }
            }
            freqStr += (i == arr.length -1) ? ckStr : ckStr + ",";
        }
        return freqStr;
    }

    public static String deDuplicate(int[] a) {
        String chk = "";
        for (int i = 0; i < a.length; i++) {
            String tmp = "_" + a[i] + "_";
            if (!chk.contains(tmp)) {
                chk += tmp;
            }
        }
        return chk.replace("__", " ").replace("_", " ").trim();
    }
}
