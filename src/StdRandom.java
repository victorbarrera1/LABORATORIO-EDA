import java.util.Random;

public final class StdRandom {
    private static Random random;
    private static long seed;

    static {
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    private StdRandom() {}

    public static void setSeed(long s) {
        seed = s;
        random = new Random(seed);
    }

    public static long getSeed() {
        return seed;
    }

    // Retorna un entero en [0, n)
    public static int uniformInt(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        return random.nextInt(n);
    }

    // Retorna un entero en [a, b)
    public static int uniformInt(int a, int b) {
        if (b <= a) throw new IllegalArgumentException("b must be > a");
        return a + random.nextInt(b - a);
    }
}
