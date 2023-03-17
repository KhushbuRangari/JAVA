import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class UniqueNo {
    public static void main(String[] args) {

        int[] arr = { 2,5,3,2,5,1,2,6 };
        String ddup = "";
        for (int i = 0; i < arr.length; i++) {
            if (!ddup.contains("_" + arr[i] + "_")) {
                ddup = "_" + arr[i] + "_" + ddup;
            }
        }

        ddup = ddup.replace("__", "_").replaceAll("^_", "").replaceAll("_$", "");
       // System.out.println(ddup);
        String[] ddup_arr = ddup.split("_");
        String ffres = "";
        for (int i = 0; i < ddup_arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] + "").equals(ddup_arr[i])) {
                    counter++;
                }
            }
            if (i == ddup_arr.length - 1)
                ffres = ffres + ddup_arr[i] + "~" + counter;
            else
                ffres = ffres + ddup_arr[i] + "~" + counter + ",";
        }
        //System.out.println(ffres);
        String[] fresult = ffres.split(",");
        for (String resarr : fresult) {
            System.out.println(resarr.replaceAll("~", "\t"));
        }
   
    }
}
