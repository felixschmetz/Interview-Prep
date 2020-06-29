class Sort {

  // maybe remove the left right bullshit
  public void bubbleSort(int[] A, int left, int right) {

    if (right - left < 2) return;

    for (int i = left; i < right; i++) {
      for (int j = left; j < right - 1; j++) {
        if (A[j] > A[j + 1]) swap(A, j, j + 1);
      }
    }
  }

  public void selectionSort(int[] A) {

    int n = A.length;
    if (n < 2) return;

    for (int i = n; i > 0; i--) {

      int max = Integer.MIN_VALUE;
      int max_idx = -1;

      for (int j = 0; j < i; j++) {
        if (A[j] > max) {
          max = A[j];
          max_idx = j;
        }
      }
      swap(A, max_idx, i - 1);
    }
  }

  public void insertionSearch(int[] A) {

    int n = A.length;
    int i, j;
    int key;

    for (i = 1; i < n; i++) {
      key = A[i];
      j = i - 1;

      while (j >= 0 && A[j] > key) {
        A[j + 1] = A[j];
        j--;
      }

      A[j + 1] = key;
    }
  }




  public void swap(int[] A, int i, int j) {
    int tmp, n = A.length;

    if (i < 0 || i >= n) return;
    if (j < 0 || j >= n) return;
    if (i == j) return;

    tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;

  }

  public boolean isSorted(int[] A) {
    int n = A.length;

    if (n < 2) return true;

    for (int i = 0; i < n - 1; i++) {
      if (A[i] > A[i + 1]) return false;
    }

    return true;
  }


}
