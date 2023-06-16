import java.util.Scanner;

class BubbleSort {
    public static <T extends Comparable<T>> T[] BSMethod(T[] arr, int n) {
        // Sorting using bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j+1] and arr[j]
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
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        BubbleSort b = new BubbleSort();
        s = b.BSMethod(s, n);
        System.out.println("After Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
OUTPUT
-------
Enter the number of elements: 10
Enter 10 elements: 
6
7
8
1
9
4
3
5
2
0
After Sorting:
0
1
2
3
4
5
6
7
8
9
ksb@ksb-OptiPlex-3060:~/akshaytvijayan/javaLab/23$ 
