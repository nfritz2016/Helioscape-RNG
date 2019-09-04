public class Runner {
  public static void main(String[] args) {
    RNG rng = new RNG(1000000);
    System.out.println(rng.generate());
  }
}
