package design.tokenbucket;

import java.util.concurrent.atomic.AtomicInteger;

public class TokenBucket {
    int capacity;
    int refreshDuration;
    AtomicInteger currentCapacity;
}
