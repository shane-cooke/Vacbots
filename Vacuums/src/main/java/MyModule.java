import java.util.ArrayList;

import astra.core.Module;

public class MyModule extends Module {
  @TERM public String randomTurn() {

    ArrayList<String> list = new ArrayList<String>();
    list.add("none");
    list.add("left");
    list.add("right");

    int random = (Math.random() <= 0.5) ? 1 : 2;

    String turn = list.get(random);

    return turn;
  }
}
