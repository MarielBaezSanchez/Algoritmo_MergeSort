package mergesort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        MergeSort mg = new MergeSort();

        // Ruta del archivo
        String filePath = "C:\\Users\\stell\\IdeaProjects\\Algoritmo\\archiv.txt";//el archivo

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
        List<Integer> numbersList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                numbersList.add(number);
                System.out.println("Número leído: " + number);
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("+--------------------------------+");
        System.out.println("Números ordenados:");

        // Convertir la lista a un array de int
        return numbersList.stream().mapToInt(Integer::intValue).toArray();
    }
}