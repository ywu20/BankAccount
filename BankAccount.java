public class BankAccount{
  private double balance=0;
  private int accountID;
  private String password;

  public BankAccount(int id, String pw){
    accountID=id;
    password=pw;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

public String getPassword(){
  return password;
}
  public void setPassword(String pw){
    password=pw;
  }


}
