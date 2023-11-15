package mergesort;

public class MergeSort {
    // ordenar el arreglo de números A
    public int[] mergeSort(int[] A) {
        if (A.length <= 1) {
            return A;
        } else {
            int[] izq = new int[A.length / 2];
            int[] derc;

            if (A.length % 2 == 0) {
                derc = new int[A.length / 2];
            } else {
                derc = new int[(A.length / 2 + 1)];
            }

            int i;
            for (i = 0; i < izq.length; ++i) {
                izq[i] = A[i];
            }

            int k = 0;
            for (int j = i; j < A.length; ++j) {
                derc[k] = A[j];
                ++k;
            }

            // recursiva (falta de orden)
            int[] arrayOrden = merge(mergeSort(izq), mergeSort(derc));

            return arrayOrden;
        }
    }

    // recibe dos subarrays y los une en unno ordenado
    // ambos "a y b" deben estar ordenados
    public int[] merge(int[] a, int[] b) {
        int i = 0; // a
        int j = 0; // b

        int[] c = new int[a.length + b.length];
        for (int k = 0; k < c.length; ++k) {
            if (i < a.length && (j == b.length || a[i] < b[j])) {
                c[k] = a[i];
                ++i;
            } else {
                c[k] = b[j];
                ++j;
            }
        }
        return c;
    }
}
