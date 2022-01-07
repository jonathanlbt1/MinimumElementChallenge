import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args){

        int myInteger = readInteger();
        System.out.println("My integer is " + myInteger);

        int[] newArray = readElements(myInteger);
        System.out.println("My newArray is " + Arrays.toString(newArray));

        System.out.println("The minimum value of my array is " + findMin(newArray));
    }
    

    private static int readInteger(){

        Scanner sc = new Scanner (System.in);

        return sc.nextInt();

    }

    private static int[] readElements(int number) {

        Scanner sc = new Scanner (System.in);

        int[] array = new int[number];
        for(int i=0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int findMin(int[]  number) {
        int minusNumber = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++) {
            if(minusNumber > number[i]){
                minusNumber = number[i];
            }
        }
        return minusNumber;
    }

}
