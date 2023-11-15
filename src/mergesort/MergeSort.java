package mergesort;

public class MergeSort {
    //ordenar el arreglo de numéros A
    public int [] mergeSort(int [] A){
        if ( A.length <= 1 ){
            return A;
        }
        else {
            int[] izq;
            int[] derc;
            izq = new int[A.length / 2];

            if (A.length % 2 == 0) {
                izq = new int[A.length / 2];
            } else {
                izq = new int[(A.length / 2 + 1)];
            }

            int i;
            for (i = 0; i < izq.length; ++i) {
                izq[i] = A[i];
            }

            int k = 0;
            for (int j = i; j < A.length; ++j) {
                izq[k] = A[j];
                ++k;

            }

            //recursiva(falta de orden)

            int[] arrayOrden = Merge(mergeSort(izq), mergeSort(derc));

            return arrayOrden;
        }
    }
    //recibe dos subarrays y los une en unno ordenado
    // todo, "a y b" deben estar ordenados
    public int [] Merge(int [] a, int [] b){
        int i = 0;//a
        int j = 0;//b

        int [] c = new int [a.length + b.length];
        for (int k = 0; k < c.length; ++k){
            if (a[i] < b[j]){
                c[k] = a[i];
                ++i;
            }
            else {
                c[k] = b[j];
                ++j;
            }
            if (i == a.length){
                ++k;

                for (j = j; j < b.length; j++){
                    c[k] = b[j];
                    ++k;
                }
            } else if (j == b.length) {
                ++k;
                for (i = i; i < a.length; i++){
                    c[k] = a[i];
                    ++k;
                }
            }
        }
        return c;
    }
}
