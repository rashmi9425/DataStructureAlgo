package GoldmanSach;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by rashverm on 8/13/2017.
 */
public class MaxPrimeCount {

    static int arr[] = {6,2,1,4,3,5};

    public static void main(String[] args) {
      //  System.out.println(getLargestNumberWithPrimeOccurences(arr, 2));
        System.out.println(equil(arr,1));
    }

    static boolean primeNo(int value) {
        int a;
        boolean isPrime = false;
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                isPrime = true;
                break;
            }
        }
        return !isPrime;
    }
   static int equil(int arr[],int size)
    {
        int i=0,arrsum=0;
        int leftsum=0;

        for(i=0;i<size;i++)
            arrsum+=arr[i];

        for(i=0;i<size;i++)
        {
            arrsum-= arr[i];

            if(leftsum == arrsum)
                return i;

            leftsum+=arr[i];
        }

        return -1;
    }


    static int getLargestNumberWithPrimeOccurences(int[] inputArray, int minOccurence) {
        if(inputArray.length<=0)
            return -1;

        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int a : inputArray) {
            if (!map.containsKey(a))
                map.put(a, 1);
            else
                map.put(a, map.get(a) + 1);
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            Integer value = entry.getValue();
            // System.out.println(entry.getKey()+" "+value);
            if (primeNo(value) && value >= minOccurence) {
                return entry.getKey();
            }

        }
        return -1;
    }







    static String getOutcomeOfTheFeat(int[] weights, int marginOfError) {
        Arrays.sort(weights);
        int left =0, right=weights.length-1, WL =0, WR =0;
        String s ;
        while(left<=right)
        {
            if(WL>=WR)
            {
                WL = WL+ weights[left]+1;
                left++;
            }
            else
            {
                WR= WR+weights[right];
                right--;
            }
        }
        int diff = Math.abs(WL- WR);
        if(diff ==0)
        {
            s = "Perfectly Balanced";
            s =s+outputString(left, right, weights);
        }
        else if(diff<marginOfError)
        {
            s = "Balanced within "+diff;//+outputString(left, right, weights);
        }
        else
        {
            s = "Not Balanced";
        }
        return s;

    }

    static String outputString(int left, int right, int []weights)
    {
        String s = "(";
        for(int i=0;i<=left;i++)
            s = s+weights[i]+",";
        s = s+"on left side and";
        for(int i=right;i<=weights.length-1;i++)
            s = s+weights[i]+",";
        s= s+"on the right side;";
        for(int i=0;i<=left;i++)
            s = s+weights[i]+"+";
        s =s+left+1+"(for "+left+1+"weights)=";
        for(int i=right;i<=weights.length-1;i++)
            s = s+weights[i]+"+";
        s.replace(s.charAt(s.length()-1), ')');
        return s;
    }
}
