import java.util.Random;

public class Main {
  public static void main(String[] args) {

    Search search = new Search();
    Sort sort = new Sort();

    // int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    //
    // for (int i = -1; i <= A.length + 1; i++) {
    //   int key = i;
    //   int idx1 = search.binarySearchIterative(A, key);
    //   System.out.println("Iterative Binary Search: " + idx1);
    //
    //   int idx2 = search.binarySearchRecursive(A, 0, A.length - 1, key);
    //   System.out.println("Recursive Binary Search: " + idx2);
    //
    //   // TODO: Interpolation Search contains a bug
    //   idx1 = search.InterpolationSearchIterative(A, key);
    //   System.out.println("Iterative Interpolation Search: " + idx1);
    //
    //   idx2 = search.InterpolationSearchRecursive(A, 0, A.length - 1, key);
    //   System.out.println("Recursive Interpolation Search: " + idx2);
    //
    //   idx1 = search.exponentialSearch(A, key);
    //   System.out.println("Exponential Search: " + idx1);
    //
    //   idx1 = search.linearSearch(A, key);
    //   System.out.println("Linear Search: " + idx1);
    //
    // }

    Random rnd = new Random();
    int n = 1000;

    int[] randomA = new int[n];
    for (int i = 0; i < n; i++) randomA[i] = rnd.nextInt();

    System.out.println("Sorted randomA? -> " + sort.isSorted(randomA));
    sort.bubbleSort(randomA, 0, randomA.length);
    System.out.println("Sorted randomA after BUBBLESORT? -> " + sort.isSorted(randomA));

    int[] randomB = new int[n];
    for (int i = 0; i < n; i++) randomB[i] = rnd.nextInt();

    System.out.println("Sorted randomB? -> " + sort.isSorted(randomB));
    sort.selectionSort(randomB);
    System.out.println("Sorted randomB after SELECTIONSORT? -> " + sort.isSorted(randomB));

    int[] randomC = new int[n];
    for (int i = 0; i < n; i++) randomC[i] = rnd.nextInt();

    System.out.println("Sorted randomC? -> " + sort.isSorted(randomC));
    sort.selectionSort(randomC);
    System.out.println("Sorted randomC after INSERTIONSORT? -> " + sort.isSorted(randomC));


  }
}
