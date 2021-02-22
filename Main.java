import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("How old is your dog in human years?");
    int dogAge = scan.nextInt();

    // this scanner allows users to input their dog's current age in human years

    int dogYears = age(dogAge);
    System.out.println(dogYears + " years in dog years");
  }

  public static int age(int dogAge) {
    if (dogAge < 15) {
      return (dogAge * 7);
    } else {
    }
    return 0;
  }

  //this recursion calculates your dog's age in dog years
}