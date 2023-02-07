import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] numbers= {4,5,6,98,3,2,0,87};
        sort(numbers);


    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


    public static void InsertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
 
    public static void sort(int arr[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- Selection sort");
        System.out.println("2- Insertion sort");
        int choise = scanner.nextInt();
        if (choise == 1){
            int n = arr.length;
        System.out.println("Unsorted array: ");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Sorted array (Insertion sort): ");
        selectionSort(arr);
        int s = arr.length;
        for (int i = 0; i < s; ++i)
            System.out.print(arr[i] + " ");
        }
        else if (choise == 2){
        int n = arr.length;
        System.out.println("Unsorted array: ");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println("Sorted array (Insertion sort): ");
        InsertionSort(arr);
        int s = arr.length;
        for (int i = 0; i < s; ++i)
            System.out.print(arr[i] + " ");
        }
        else
            System.out.println("invalid input");
    }
 
}