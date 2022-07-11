// Import statement:
import java.util.ArrayList;
class PrimeDirective {
  
  public boolean isPrime(int number) {
    // Checks if number is prime number.
    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
  
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    // Returns prime numbers from array.
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
  }

  public ArrayList<Integer> parityFilter(int[] numbers, String parity) {
    // Returns only even or odd numbers from array based on choice.
    ArrayList<Integer> filteredNumbers = new ArrayList<Integer>();
    if (parity == "even") {
      // Filter for even numbers
      for (int number : numbers) {
        if (number % 2 == 0) {
          filteredNumbers.add(number);
        }
      }
    } else if (parity == "odd") {
      // Filter for odd numbers
      for (int number: numbers) {
        if (number % 2 != 0) {
          filteredNumbers.add(number);
        }
      }
    } else {
      System.out.println("Unexpected parity value");
    }
    return filteredNumbers;
  }

  public ArrayList<Integer> limitedPrimes(int[] numbers, int n) {
    // Returns the first n prime numbers from array.
    ArrayList<Integer> limitedPrimes = new ArrayList<Integer>();
    for (int number : numbers) {
      if (isPrime(number)) {
        limitedPrimes.add(number);
      }
      if (limitedPrimes.size() >= n) {
        break;
      }
    }
    return limitedPrimes;
  }

  public ArrayList<Integer> fibonacciNumbers(int n) {
    // Returns the first n Fibonacci numbers.
    ArrayList<Integer> fibonacciNumbers = new ArrayList<Integer>();
    int numOne = 0;
    int numTwo = 1;
    for (int i = 0; i < n; i++) {
      if (i == 0) {
        fibonacciNumbers.add(0);
        continue;
      }
      if (i == 1) {
        fibonacciNumbers.add(1);
        continue;
      }
      int numberToAdd = numOne + numTwo;
      fibonacciNumbers.add(numberToAdd);
      numOne = numTwo;
      numTwo = fibonacciNumbers.get(i);
    }
    return fibonacciNumbers;
  }

  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    // System.out.println(pd.isPrime(0));

    // System.out.println(pd.onlyPrimes(numbers));

    // System.out.println(pd.parityFilter(numbers, "odd"));

    // System.out.println(pd.limitedPrimes(numbers, 6));

    System.out.println(pd.fibonacciNumbers(13));
  }  

}