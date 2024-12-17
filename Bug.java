public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[5] = 10; //This will throw an ArrayIndexOutOfBoundsException
        System.out.println(arr[5]);
    }
}