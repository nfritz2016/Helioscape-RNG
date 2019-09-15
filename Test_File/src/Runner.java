import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Runner {
  public static void main(String[] args) {
    Logger logger = Logger.getLogger("appLogger");
    FileHandler fh;
    try {
      fh = new FileHandler("rng.log");
      logger.addHandler(fh);
      SimpleFormatter formatter = new SimpleFormatter();
      fh.setFormatter(formatter);
    }
    catch (SecurityException e) {
      e.printStackTrace();
    }
    catch (IOException e) {
      e.printStackTrace();
    }

    logger.info("Generating random number...");
    RNG rng = new RNG(1000000);
    int num = rng.generate();
    logger.info("Generated: " + num);
//    System.out.println(num);
    returnNum(num);
  }

  public static int returnNum(int num) {
    return num;
  }
}
