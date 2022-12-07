import java.util.Random;

import astra.core.Module;

public class MyModule3 extends Module {
  @TERM public int randomInt() {

    Random ran = new Random();
    int x = ran.nextInt(12);

    return x;
  }
}