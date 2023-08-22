class EvenThread extends Thread {
    private int n;

    public EvenThread(int n) {
        this.n = n;
    }

    
    public void run() {
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }

    
    public String toString() {
        return "Even Thread";
    }
}

class OddThread extends Thread {
    private int m;

    public OddThread(int m) {
        this.m = m;
    }

    
    public void run() {
        for (int i = 1; i <= m; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }

    
    public String toString() {
        return "Odd Thread";
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 10; // Change n and m to specify the range of even and odd numbers.
        int m = 15;

        EvenThread evenThread = new EvenThread(n);
        OddThread oddThread = new OddThread(m);

        System.out.println(evenThread);
        evenThread.start();

        System.out.println(oddThread);
        oddThread.start();
    }
}
