public class BigOAlgorithms {

    private void bigOAlgos() {
        sumDigits(45);
    }

    //Sums the digits of a number, executes in a time of O(N)
    int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
