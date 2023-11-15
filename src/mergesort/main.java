package mergesort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        MergeSort mg = new MergeSort();

        // Ruta del archivo
        String filePath = "C:\\merge\\archiv.txt";

        // Lee los datos del archivo
        int[] s = readArrayFromFile(filePath);

        // Realiza el ordenamiento y obtén el arreglo ordenado
        int[] arrayOrden = mg.mergeSort(s);

        // Imprime el arreglo ordenado
        for (int i = 0; i < arrayOrden.length; i++) {
            System.out.println(arrayOrden[i]);
        }
    }

    // Método para leer un array de números desde un archivo
    private static int[] readArrayFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            String[] numbers = line.split(" ");

            int[] array = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                array[i] = Integer.parseInt(numbers[i]);
            }

            return array;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
