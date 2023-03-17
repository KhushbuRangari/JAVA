public class duplicateLettersINSTring {
    public static void main(String[] args) {
        String word = "uhushbu";
        int dup = 0;
        
        char arr[] = word.toCharArray();
        char array1[] = new char[arr.length];
        boolean flag = false;

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Letter:" + arr[i]);
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                array1[dup++] = arr[i];
            }
            
        }
        
        for(int i =0 ;i< array1.length;i++){
            System.out.print(array1[i]);
        }

    }

}
