public class ReverseArray{
    public static void main (String[]args){
         int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.print("Reversed array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
