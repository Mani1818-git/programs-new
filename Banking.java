import java.util.Scanner;
class Account{
    private String name;
    private String accno;
    private String acc_type;
    private long balance;
    Scanner sc=new Scanner(System.in);
    public void openaccount(){
        System.out.println("Enter your name:");
        name=sc.next();
        System.out.println("enter your accno:");
        accno=sc.next();
        System.out.println("Enter your account type:");
        acc_type=sc.next();
        System.out.println("Enter the bank balance:");
        balance=sc.nextLong();
    }
    public void showaccount(){
     System.out.println("Name of the account holder:"+name); 
     System.out.println("Your accno:"+accno); 
      System.out.println("Account type is:"+acc_type); 
      System.out.println("Bank balance total:"+balance);
    }
    public void deposit(){
        int amount;
        amount=sc.nextInt();
        System.out.println("Enter the money for Deposit");
        balance+=amount;
    }
    public void withdraw(){
        int amt;
        amt=sc.nextInt();
        System.out.println("Enter the ammount for withdraw");
        if(balance>=amt){
            balance=balance-amt;
            System.out.println("Money after with drwa"+balance);
        }else{
            System.out.println("Insufficent Balance"+amt);
        }
    }
    public boolean search(String ac_no){ 
        System.out.println("Enter the account numbeer for search");
        if(accno.equals(ac_no)){
            showaccount();
            return true;
        }
            return false;
        }

    }

class Banking{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many accounts you want to  enter ");
        int n=sc.nextInt();
        Account sb[]=new Account[n];
        for(int i=0;i<sb.length;i++){
            sb[i]=new Account();
            sb[i].openaccount();
        }
        int ch;
        do{
            System.out.println("Banking Details Application");
            System.out.println("1. Display all account details:\n 2. Search AccountNo:\n 3. Deposit The ammount:\n 4.Withdraw Ammount:\n 5. Exit:");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    for(int i=0;i<sb.length;i++){
                        sb[i].showaccount();
                    }
                     break;
                case 2:
                    System.out.println("Enter the account you want");
                    String acc_no=sc.next();
                    boolean found=false;    
                 for(int i=0;i<sb.length;i++){
                    found=sb[i].search(acc_no);
                    if(found){
                    break;
                    }
                    }
                    if(!found){
                        System.out.println("Account not exist");
                    }
                    break;
                 case 3:
                    System.out.println("Enter AccountNo");
                    acc_no=sc.next();
                    found=false;
                    for(int i=0;i<sb.length;i++){
                        found=sb[i].search(acc_no);
                        if(found){
                            sb[i].deposit();
                            break;
                        }  
                    } 
                    if(!found){
                        System.out.println("AAccount doesnot Exists");
                    }
                    break;
                 case 4:
                    System.out.println("Enter the Account no");
                    acc_no=sc.next();
                    found=false;
                    for(int i=0;i<sb.length;i++){
                        found=sb[i].search(acc_no);
                         if(found){
                            sb[i].withdraw();
                            break;
                         }
                    }
                    if(!found){
                        System.out.println("Account not Exists");
                    }
                    break;
                case 5:
                    System.out.println("COME AGAIN NEXT TIME!!");
                 break;
            }
        }
        while(ch!=5);
    }
}