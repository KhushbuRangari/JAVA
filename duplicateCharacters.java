public class duplicateCharacters {
    public static void main(String[] args) {
        String word = "DEVICE";
        // int dup = 0;
        // int array1[] = new int[5];
        char arr[] = word.toCharArray();
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("duplicate letter: " +  arr[i]);
                    break;
                }
            }
            
        }

    }

}
