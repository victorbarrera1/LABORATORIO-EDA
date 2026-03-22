import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Análisis empírico del método cuentaPares2 (loop + Collections.binarySearch).
 * Genera 100 instancias por cada tamaño 2^t (t = 5..10),
 * mide el tiempo de ejecución con StopwatchCPU y guarda los resultados en CSV.
 *
 * Semilla usada para tamaño 2^t: seed = t
 *   - n=32  -> seed=5
 *   - n=64  -> seed=6
 *   - n=128 -> seed=7
 *   - n=256 -> seed=8
 *   - n=512 -> seed=9
 *   - n=1024-> seed=10
 */
public class Analisis2 {

    static final int INSTANCIAS = 100;

    /**
     * Genera una lista de n enteros distintos en el rango [0, 2^(t+2))
     * usando StdRandom con la semilla ya seteada.
     */
    static List<Integer> generarInstancia(int n, int t) {
        int rango = (int) Math.pow(2, t + 2);
        HashSet<Integer> set = new HashSet<>();
        while (set.size() < n) {
            set.add(StdRandom.uniformInt(rango));
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

        int[] exponentes = {5, 6, 7, 8, 9, 10};

        for (int t : exponentes) {
            int n = (int) Math.pow(2, t);

            StdRandom.setSeed(t);

            String nombreArchivo = "resultados_metodo2_n" + n + ".csv";
            Out archivo = new Out(nombreArchivo);

            archivo.println("instancia,resultado,tiempo_ms");

            System.out.println("Método 2 | n=" + n + " | seed=" + t);

            for (int i = 0; i < INSTANCIAS; i++) {

                List<Integer> valores = generarInstancia(n, t);
                int k = StdRandom.uniformInt(1, (int) Math.pow(2, t - 2) + 1);

                StopwatchCPU reloj = new StopwatchCPU();
                int resultado = Result.cuentaPares2(n, new ArrayList<>(valores), k);
                double tiempoSegundos = reloj.elapsedTime();

                double tiempoMs = tiempoSegundos * 1000.0;

                archivo.println((i + 1) + "," + resultado + "," + tiempoMs);
            }

            archivo.close();
            System.out.println("  -> Guardado: " + nombreArchivo);
        }

        System.out.println("\nListo. Se generaron 6 archivos CSV para el método 2.");
    }
}
