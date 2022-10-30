package class14;

public class task2 {
    boolean isPrime(int num) {
        boolean isPrime = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
        } else {
            isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        task2 task2 = new task2();
        System.out.println(task2.isPrime(12));
    }
}