public class mergesort {

    // stably merge a[lo .. mid] with a[mid+1 ..hi] using aux[lo .. hi]
    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            }
            else if (j > hi) {
                a[k] = aux[i++];
            }
            else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            }
            else {
                a[k] = aux[i++];
            }
        }
    }

    // mergesort a[lo..hi] using auxiliary array aux[lo..hi]
    private static void sort(int[] a, int[] aux, int lo, int hi) {
        if (hi <= lo) {
            return ;
        } else {
            int mid = (lo + hi) / 2;
            sort(a, aux, lo, mid);
            sort(a, aux, mid + 1, hi);
            merge(a, aux, lo, mid, hi);
        }
    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {
        int[] aux = new int[a.length];
        int low = 0; //index 
        int high = a.length - 1;
        sort(a, aux, low, high);
    }


   /***************************************************************************
    *  Helper sorting function.
    ***************************************************************************/
    
   //  // is v < w ?
    private static boolean less(int v, int w) {
        return v.compareTo(w) < 0;
    }
        
   // /***************************************************************************
   //  *  Check if array is sorted - useful for debugging.
   //  ***************************************************************************/
   //  private static boolean isSorted(int[] a) {
        
   //  }

   //  private static boolean isSorted(int[] a, int lo, int hi) {
        
   //  }

   //  // print array to standard output
    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

   //  /**
   //   * Reads in a sequence of strings from standard input; mergesorts them; 
   //   * and prints them to standard output in ascending order. 
   //   *
   //   * @param args the command-line arguments
   //   */
    public static void main(String[] args) {
        int[] a = {6,3,7,8,5,2,1,4,9};
        
        //System.out.println();
        Merge.sort(a);
        show(a);
    }
}