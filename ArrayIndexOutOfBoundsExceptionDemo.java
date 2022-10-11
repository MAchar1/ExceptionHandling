/**
 * class ArrayIndexOutOfBoundsExceptionDemo
 * file: ArrayIndexOutOfBoundsExceptionDemo.java
 * the purpose of this program is show how ArrayIndexOutOfBoundsException handles and purposely test it by using
 * indices that are out of bounds
 */

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean continueInput = true;
        do {
            try{
                System.out.println("Enter the last index number. ");
                int lastIndex = input.nextInt();
                System.out.println(list[lastIndex]);
                continueInput = false;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                e.printStackTrace();
                input.nextLine();
            }
        } while (continueInput);


    }
}
