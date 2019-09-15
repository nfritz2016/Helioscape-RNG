public class RNG {
    int max;
    public RNG(int max) {
        this.max = max;
    }
    public int generate() {
        return (int)(Math.random() * this.max + 1);
    }
}
