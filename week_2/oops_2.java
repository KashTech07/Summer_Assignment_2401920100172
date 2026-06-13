// Create a Bank Account
//BankAccount
//│
//        ├── accountHolderName
//├── accountNumber
//├── balance
//├── accountType
//│
//        ├── deposit()
//├── withdraw()
//├── transfer()
//├── checkBalance()
//├── displayDetails()
//└── calculateInterest()
class banAccount{
    String name ;
    private float balance ;
    private int account_no;
    private String add ;
    private String dob ;
    banAccount(String name , float balance , int account_no , String add , String dob){
        this.name = name  ;
        this.balance = balance ;
        this.account_no = account_no ;
        this.add = add ;
        this.dob = dob ;
    }
    // Methods of a abank account
    // deposit money
     void deposit(float n){
        balance+=n ;
    }
     void withdraw(float n){
        if(n>balance) System.out.println("Insufficient balance");
        balance-=n ;
     }
    static void transfer(banAccount from, banAccount to, float amount) {
        if(amount > from.balance) {
            System.out.println("Insufficient balance");
            return;
        }

        from.balance -= amount;
        to.balance += amount;
    }
     float checkBalance(){
        return balance ;
     }
      void display(){
         System.out.println("name :"+name);
          System.out.println("account no. :"+account_no);
          System.out.println("Balance :"+balance);
          System.out.println("add :"+add);

     }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        banAccount a = new banAccount("Karan" , 1000 , 7876 ,"ipec" , "18/08/2005") ;
        banAccount great = new banAccount("kashish" , 100000 , 9089,"ghaziabad" ,"18/07/2005") ;
        transfer(great ,a , 20000) ;
       // a.setBalance(2000);
        a.display();
        great.display();
    }
}
