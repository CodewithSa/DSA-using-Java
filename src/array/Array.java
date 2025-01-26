package array;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public int valAt(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val)
                return i;
        }

        return -1;
    }

    public int countOccurrence(int[] arr, int val) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                count++;
            }
        }

        return count;
    }

    public int lastIndexOf(int[] arr, int val) {
        int lastIdx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                lastIdx = i;
            }
        }

        return lastIdx;
    }

    public int strictlyGreater(int[] arr, int val) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > val) {
                count++;
            }
        }

        return count;
    }

    public boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }

        return true;
    }

    public int countPairs(int[] arr, int target) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }

        return count;
    }

    public int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        return secMax;
    }

    public int firstRepeatingValue(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }




//    public List<Integer> minAndMax(int[] arr) {
//        int min = Integer.MIN_VALUE;
//        int max = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//
//        List<Integer> ans = new ArrayList<>();
//        ans.add(min);
//        ans.add(max);
//
//        return ans;
//    }




}
