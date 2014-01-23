package kafka.common.metrics;

/**
 * A MeasurableStat is a {@link Stat} that is also {@link Measurable} (i.e. can produce a single floating point value).
 * This is the interface used for most of the simple statistics such as {@link kafka.common.metrics.stats.Avg},
 * {@link kafka.common.metrics.stats.Max}, {@link kafka.common.metrics.stats.Count}, etc.
 */
public interface MeasurableStat extends Stat, Measurable {

}
