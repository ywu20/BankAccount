public class Tester{
  public static void main(String[] args){
    //constructor + get methods test
    BankAccount a = new BankAccount(0,"1234567");
    System.out.println(a.getBalance());
    System.out.println(a.getAccountID());

    //set method test
    a.setPassword("987qeE/s4");
    System.out.println(a.getPassword());

    //deposit method test
    System.out.println(a.deposit(23.8));
    System.out.println(a.getBalance());
    System.out.println(a.deposit(-2.2));
    System.out.println(a.getBalance());
    System.out.println(a.deposit(0));
    System.out.println(a.getBalance());

    //withdraw method test
    System.out.println(a.withdraw(2.8));
    System.out.println(a.getBalance());
    System.out.println(a.withdraw(-2.2));
    System.out.println(a.getBalance());
    System.out.println(a.withdraw(0));
    System.out.println(a.getBalance());
    System.out.println(a.withdraw(100));
    System.out.println(a.getBalance());

    //toString method test
    System.out.println(a.toString());

  }
}
