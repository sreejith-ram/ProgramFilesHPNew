
public class MultiThreadingWithLambdaDemo {

	public static void main(String[] args) {
        Runnable r1 = new Runnable() {
             public void run() {
                System.out.println("Part with Anonymous Class");
             }
          };
          Runnable r2 = () -> {
             System.out.println("Part with Lambda Expression");
          };
          new Thread(r1).start();
          new Thread(r2).start();
	}
}
