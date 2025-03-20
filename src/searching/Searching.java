package searching;

public class Searching {

    private int linearSearchHelper(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public int linearSearch(int[] arr, int target) {
        int ans = linearSearchHelper(arr, target);
        if (ans == -1)
            System.out.println("Value is not present in the array");

        return ans;
    }

    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return -1;
    }

    private int binarySearchFirst(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }

        return ans;
    }

    private int binarySearchLast(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return ans;
    }

    public int totalOccurrenceOfTarget(int[] arr, int target) {
        int first = binarySearchFirst(arr, target);
        int last = binarySearchLast(arr, target);

        if (first == -1 && last == -1) return 0;

        int ans = last - first + 1;
        return ans;
    }

    public int bsFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                ans = arr[mid];
            else if (arr[mid] < target) {
                start = mid + 1;
                ans = arr[mid];
            } else
                end = mid - 1;
        }

        return ans;
    }

    public int bsCeil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                ans = arr[mid];
            else if (arr[mid] < target)
                start = mid + 1;
            else {
                end = mid - 1;
                ans = arr[mid];
            }
        }

        return ans;
    }

    private char bsCeil(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        char ans = '$';

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (arr[mid] <= target) {
                start = mid + 1;
            }
            else {
                ans = arr[mid];
                end = mid - 1;
            }
        }
        return (ans == '$') ? arr[0] : ans;
    }

    public char nextGreatestLetter(char[] letters, char target) {
        return bsCeil(letters, target);
    }


    

}