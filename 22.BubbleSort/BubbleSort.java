    import java.util.Scanner;
     
    class BubbleSort {
        public static <T extends Comparable<T>> T[] BSMethod(T[] arr, int n) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j].compareTo(arr[j + 1]) > 0) {
                        T temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements:");
            int n = sc.nextInt();
            Integer[] nums = new Integer[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            BubbleSort b = new BubbleSort();
            nums = b.BSMethod(nums, n);
            System.out.println("After Sorting:");
            for (int i = 0; i < n; i++) {
                System.out.println(nums[i]);
            }
        }
    }
