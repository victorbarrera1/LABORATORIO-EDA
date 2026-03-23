import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public final class Out {
    private PrintStream out;

    // Escribe en un archivo
    public Out(String filename) {
        try {
            out = new PrintStream(new FileOutputStream(filename));
        } catch (IOException e) {
            throw new RuntimeException("No se pudo crear el archivo: " + filename, e);
        }
    }

    public void println(Object x) {
        out.println(x);
    }

    public void print(Object x) {
        out.print(x);
    }

    public void close() {
        out.close();
    }
}
