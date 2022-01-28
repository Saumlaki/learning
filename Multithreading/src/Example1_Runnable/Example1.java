package Example1_Runnable;

/**
 * Пример демонстрирует простуйщую работу с нитями
 */
public class Example1 {

    public static void main(String[] args) {

        Thread.currentThread().setName("Thread1");

        Thread thread2 = new Thread(new RunClass(), "Thread2");
        Thread thread3 = new Thread(new RunClass(), "Thread3");

        thread2.start();
        thread3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread name: " + Thread.currentThread().getName() + ", value: " + i);
        }
        System.out.println("---!Thread name: " + Thread.currentThread().getName() + ", is finished");
    }
}
