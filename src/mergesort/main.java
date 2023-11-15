package mergesort;

import mergesort.MergeSort;

public class main {
    public static void main(String[] args) {

        MergeSort mg = new MergeSort();
        int[] s = {3, 2, 1};

        int arrayOrden = mg.mergeSort(s);

        for ( int i = 0; i < s.length; i++){
            System.out.println(arrayOrden[i]);
        }
    }
}
