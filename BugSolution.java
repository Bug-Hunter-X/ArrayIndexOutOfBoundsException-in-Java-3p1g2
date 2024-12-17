public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 0;
        try {
            System.out.println("Enter the index (0-4):");
            java.util.Scanner scan = new java.util.Scanner(System.in);
            index = scan.nextInt();
            if (index >=0 && index <arr.length){
                arr[index] = 10; //This will throw an ArrayIndexOutOfBoundsException
                System.out.println(arr[index]);
            } else {
                System.out.println("Index out of bounds");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}