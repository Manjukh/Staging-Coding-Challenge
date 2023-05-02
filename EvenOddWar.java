Java:

 

/*There's a great war between the even and odd numbers. Many numbers already lost their lives in this war and it's your task to end this. You have to determine which group sums larger: the evens, or the odds. The larger group wins.

Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between the sum of the even and odd numbers.

 

Examples

warOfNumbers([2, 8, 7, 5]) ➞ 2

// 2 + 8 = 10

// 7 + 5 = 12

// 12 is larger than 10

// So we return 12 - 10 = 2

 

warOfNumbers([12, 90, 75]) ➞ 27

warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168

 

Notes

The given array contains only positive integers.*/



public class EvenOddWar {


    public static void main(String args[]){

        EvenOddWar eow= new EvenOddWar();

        int[] arr1= {10,15,13,20,11};

       int result= eow.warOfNumbers(arr1);

                System.out.println("The difference is"+ "  " + result);
    }


   public int  warOfNumbers(int arr[]){

        if(arr.length <0){return 0;}
        if(arr.length==1){return arr[0];}
        int even=0;
        int odd=0;

    for(int i=0;i<arr.length;i++) {

        if (arr[i] % 2 == 0) {
            even += arr[i];
        } else {
            odd += arr[i];
        }
    }

    return Math.abs(even-odd);
    }


}






