import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RNG_Testing {
    @Test
    public void rng_test() {
        RNG rng = new RNG(1000000);
        int[] rnums = new int[1000];
        int cur = 0;
        int random = rng.generate();
        int duplicates = 0;
        while (cur < 1000) {
            rnums[cur] = random;
            for (int j = 0; j <= cur - 1; j++) {
                for (int k = j + 1; k <= cur; k++) {
                    if (rnums[j] == rnums[k]) {
                        duplicates++;
                    }
                }
            }
            random = rng.generate();
            cur++;
        }
        Assert.assertTrue(duplicates <= 250);
    }
}