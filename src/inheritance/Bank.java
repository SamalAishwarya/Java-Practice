package inheritance;
// single inheritance
public class Bank {
    int bankNo;
    String ifsCode;
}
class SbiBank extends Bank{
    String address;
    String branchCode;
    String contactNo;

    void display(){
        System.out.println("BankNo."+bankNo);
        System.out.println("ifcCode"+ifsCode);
        System.out.println("address"+address);
        System.out.println("branchCode"+branchCode);
        System.out.println("contact No:"+contactNo);
    }
}

class BankImp{
    public static void main(String[] args) {
        SbiBank sbiBank = new SbiBank();
        sbiBank.address = "khothrud pune";
        sbiBank.branchCode = "pune";
        sbiBank.bankNo = 855;
        sbiBank.ifsCode ="SBI00001538";
        sbiBank.contactNo = "872347652";
        sbiBank.display();

    }
}
