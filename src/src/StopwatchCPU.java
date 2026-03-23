import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class StopwatchCPU {
    private static final ThreadMXBean bean = ManagementFactory.getThreadMXBean();
    private final long start;

    public StopwatchCPU() {
        start = bean.getCurrentThreadCpuTime();
    }

    public double elapsedTime() {
        long now = bean.getCurrentThreadCpuTime();
        return (now - start) / 1_000_000_000.0;
    }
}
