import java.util.ArrayList;
import java.util.List;

import lib.StdRandom;
import lib.StopwatchCPU;
import lib.Out;
//Los import anterior le decimos al programa que ocupe esos archivos

public class Main {

    public static void main(String[] args){

        int[] potencias = { 5, 6, 7, 8, 9, 10 }; // valores 2^5.....

        for (int i = 0; i < potencias.length; i++) {

            int t = potencias[i];

            int n = (int) Math.pow(2, t); // el n= (int) es porque el Math.pow devuelve decimales y lo "obligamos" a
            // tener enteros.

            lib.StdRandom.setSeed(12345); // aqui se genera los numeros random, junto al semilla y ahi ocupamos el
            // import lib.StdRandom
            lib.Out ArchivoCsv = new lib.Out("Resultado_" + n + ".csv"); // aqui le decimos al programa que cree
            // un archivo con el nombre y especificar que es un csv

            ArchivoCsv.println("Metodo 1 , Metodo 2 , Metodo 3"); // aqui el programa genera la escritura dentro del
            // archivo.

            for (int instancia = 0; instancia < 100; instancia++) { // aqui vamos a crear las 100 instancias

                int maxValor = (int) Math.pow(2, t + 2); // esto es para que al sacar los digitos no se repitan ,
                // basicamente hace que sea mucho mas grande el rango para
                // sacar digitos.
                int minK = (int) Math.pow(2, t - 2); // lo mismo que antes pero para que la diferencia k se repita mas
                // veces al ser un numero mas chico;

                int k = lib.StdRandom.uniformInt(1, minK + 1);
                int[] azar = lib.StdRandom.permutation(maxValor + 1, n);

                List<Integer> valores = new ArrayList<>();
                for (int num : azar) {
                    valores.add(num);
                }
                List<List<Integer>> copia1 = new ArrayList<>(); // creamos 5000 copias con el cronometro apagado
                List<List<Integer>> copia2 = new ArrayList<>();
                List<List<Integer>> copia3 = new ArrayList<>();
                for (int l = 0; l < 5000; l++) {
                    copia1.add(new ArrayList<>(valores));
                    copia2.add(new ArrayList<>(valores));
                    copia3.add(new ArrayList<>(valores));
                }
                // ---------------------------------------- METODO
                // 1-----------------------------------------------------
                lib.StopwatchCPU tiempo1 = new StopwatchCPU(); // prendemos el cronometro.
                for (int r = 0; r < 5000; r++) {
                    Result.cuentaPares(n, copia1.get(r), k);
                }
                double timer1 = tiempo1.elapsedTime() * 1000;
                // ---------------------------------------- METODO
                // 2------------------------------------------------------
                lib.StopwatchCPU tiempo2 = new StopwatchCPU();
                for (int f = 0; f < 5000; f++) {
                    Result.cuentaPares2(n, copia2.get(f), k);
                }
                double timer2 = tiempo2.elapsedTime() * 1000;
                // ---------------------------------------- METODO 3
                // ------------------------------------------------------
                lib.StopwatchCPU tiempo3 = new StopwatchCPU();
                for (int h = 0; h < 5000; h++) {
                    Result.cuentaPares3(n, copia3.get(h), k);
                }
                double timer3 = tiempo3.elapsedTime() * 1000;

                ArchivoCsv.println(timer1 + " , " + timer2 + " , " + timer3); // imprime los tiempos de cada metodo

            }

            ArchivoCsv.close(); // se cierra el archivo y guarda todo lo de adentro.
        }

    }
}