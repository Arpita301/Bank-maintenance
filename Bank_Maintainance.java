import java.util.Scanner;
import java.util.Random;
import java.time.LocalDateTime;


class BankMaintainance{
    String nameOfTheAccountHolder;
    String emailAddress;
    String localAddress;
    long phoneNumber;
    int accountType;
    float accountMoney;
    float withdrawlMoney;
    float depositeMoney;
    int select;
    Random Account_number = new Random();
    int accountNumber = Account_number.nextInt(100000000);
    LocalDateTime now = LocalDateTime.now();
    BankMaintainance()
    {
        System.out.println("***** Create Account *****");
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Name of the account holder");
        nameOfTheAccountHolder=sc.nextLine();
        
        System.out.println("Enter the Local Address of the account holder");
        localAddress=sc.nextLine();
        
        System.out.println("Enter the Email Address of the account holder");
        emailAddress=sc.next();
        
        System.out.println("Enter the Phone number of the account holder");
        phoneNumber=sc.nextLong();
        
        System.out.println("Enter the account type(press 1 For:Saving Account)");
        System.out.println("Enter the account type(press 2 For:Current Account)");
        
        accountType=sc.nextInt();
        switch(accountType)
        {
            case 1:
                System.out.println("Thanks for Choosing Saving Account");
                break;
            case 2:
               System.out.println("It's your current account");
               break;
             default:
               System.out.println("oops !! Wrong choise");
        }
        System.out.println("Your Account number:"+accountNumber);
        
        System.out.println("Enter the amount");
        accountMoney=sc.nextFloat();
         
        System.out.println("Your Name:"+this.nameOfTheAccountHolder);
        System.out.println("Your Phone Number:"+this. phoneNumber);
        System.out.println("Your Email Address:"+this. emailAddress );
        System.out.println("Your Local Address:"+this. localAddress);
        System.out.println("Your Account number:"+this.accountNumber);
        System.out.println("Now Your current  Bank Balance:"+this.accountMoney);
        System.out.println("current Date and local time:"+this.now);
        
        System.out.println("******* Your account Successfully created :*********");
        
        
        System.out.println("Select your option: For 1. Deposite Money \n For 2. Withdraw Money\n For 3.current Balance");
        while(select<3)
        {
            System.out.println("Enter the options:");
            select=sc.nextInt();
            switch(select)
            {
                case  1:
                     System.out.println("***** Deposite Money *****");
                     System.out.println("Enter the amount which you want to Deposite:");
                     depositeMoney=sc.nextFloat();
                     display();
                     DepositeCurrentBalance();
                     currentbalance();
                     System.out.println("current Date and local time:"+now);
                     
                  break;
                case 2: 
                    System.out.println("***** Withdraw Money *****");
                    System.out.println("Enter the Money(withdraw):");
                    withdrawlMoney=sc.nextFloat();
                    display();
                    if( withdrawlMoney < accountMoney)
                    {
                          accountMoney -=withdrawlMoney;
                          System.out.println("Withdrawal successful. New balance: " +  accountMoney);
                          currentbalance();
                    }
                    else{
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("current Date and local time:"+now);
                  break;
                case 3:
                      System.out.println("Your current balance:");
                      currentbalance();
                      System.out.println("current Date and local time:"+now);
                  break;
                default:
                  System.out.println("Invalid !!");
            }
        }
    }
    public void display()
    {
        System.out.println(" Name : " +this.nameOfTheAccountHolder);
        System.out.println(" Account type : " + this. accountType);
        System.out.println(" Account Number :SVI" +this.accountNumber);
    }
    public void currentbalance()
    {
        System.out.println("Now Your current  Bank Balance:"+accountMoney);
    }
    public void DepositeCurrentBalance()
    {
        accountMoney = depositeMoney+accountMoney;
        accountMoney +=  accountMoney * 5 / 100;
        System.out.println("your current Balance after Deposite:: "+accountMoney);
    }
}

public class Bank_Maintainance {
    public static void main(String[] args) {
        BankMaintainance obj=new BankMaintainance();
    }
}
