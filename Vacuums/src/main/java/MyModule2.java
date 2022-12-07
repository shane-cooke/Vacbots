import astra.core.Module;

public class MyModule2 extends Module {
  @ACTION public boolean pauseWait(int seconds) {
    try {
        // thread to sleep for 1000 milliseconds
        Thread.sleep(seconds);
     } catch (Exception e) {
        System.out.println(e);
     }
     return true;
  }
}