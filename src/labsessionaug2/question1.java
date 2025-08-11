/*Write a java program to create a basic java thread that prints "hello world!" 
 * when executed
 */

package labsessionaug2;
public class question1 extends Thread {
 public void run() {
     System.out.println("Hello World!");
 }

 public static void main(String[] args) {
     question1 thread = new question1();
     thread.start(); // Start the thread
 }
}

