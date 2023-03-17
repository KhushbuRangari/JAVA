
public class StringPractice {
    public static void main(String[] args) {
        String name = "Khushbu";
        String result = "";
        char arr[] = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            result= arr[i]+result;
        }
        System.out.println("-------------------------");
        System.out.println("The Reversed string of "+name+" is : " + result);
    }

}
