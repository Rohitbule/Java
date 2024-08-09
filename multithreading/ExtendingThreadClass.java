package multithreading; // Conventionally, package names should be in lowercase

// Renamed the class to follow Java naming conventions (capitalized)
public class ExtendingThreadClass {
    public static void main(String[] args) {
        C obj1 = new C();
        D obj2 = new D();
        obj1.start(); // Starts thread C
        obj2.start(); // Starts thread D
    }
}

class C extends Thread {
    public void run() {
        f1(); // Calls f1 when thread C runs
    }

    void f1() {
        for (int i = 0; i < 10; i++) {
            // Added prefix "C: " to clarify output from thread C
            System.out.println("C: i = " + i);
        }
    }
}

class D extends Thread {
    public void run() {
        f2(); // Calls f2 when thread D runs
    }

    void f2() {
        for (int j = 0; j < 10; j++) {
            // Added prefix "D: " to clarify output from thread D
            System.out.println("D: j = " + j);
        }
    }
}
