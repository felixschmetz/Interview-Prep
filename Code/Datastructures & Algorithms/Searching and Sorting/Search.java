class Search {

  public static int binarySearchRecursive(int[] A, int left, int right, int key) {
    if (left <= right) {
      int middle = (left + right) / 2;
      if (A[middle] == key) return middle;
      else if (A[middle] < key) return binarySearchRecursive(A, middle + 1, right, key);
      else if (A[middle] > key) return binarySearchRecursive(A, left, middle - 1, key);
    }
    return -1;
  }

  public static int binarySearchIterative(int[] A, int key) {
    int left = 0;
    int right = A.length - 1;
    while (left <= right) {
      int middle = (left + right) / 2;
      if (A[middle] == key) return middle;
      else if (A[middle] < key) left = middle + 1;
      else if (A[middle] > key) right = middle - 1;
    }
    return -1;
  }

  public static int InterpolationSearchRecursive(int[] A, int left, int right, int key) {
    if (left <= right) {

      int middle = left + ((key - A[left]) / (A[right] - A[left])) * (left + right);

      if (A[middle] == key) return middle;
      else if (A[middle] < key) return InterpolationSearchRecursive(A, middle + 1, right, key);
      else if (A[middle] > key) return InterpolationSearchRecursive(A, left, middle - 1, key);
    }
    return -1;
  }

  public static int InterpolationSearchIterative(int[] A, int key) {
    int left = 0;
    int right = A.length - 1;

    while (left <= right) {

      int middle = left + ((key - A[left]) / (A[right] - A[left])) * (left + right);

      if (A[middle] == key) return middle;
      else if (A[middle] < key) left = middle + 1;
      else if (A[middle] > key) right = middle - 1;
    }
    return -1;
  }

  public static int exponentialSearch(int[] A, int key) {
    int r = 1;
    int n = A.length - 1;

    while (r <= n && key > A[r]) {
      r *= 2;
    }

    return binarySearchRecursive(A, 0, Math.min(r, n), key);
  }

  public static int linearSearch(int[] A, int key) {
    int n = A.length;

    for (int i = 0; i < n; i++) {
      if (A[i] == key) return i;
    }

    return -1;
  }

}
