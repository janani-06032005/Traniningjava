package Inclass;

class User {
    private String name;
    private long accNo;
    private float balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}

public class Practice1 {

    public static void main(String[] args) {
//        User user = new User();

        // Uncomment and use this part if you want to set and print a single user's details
        /*
        user.setName("janani");
        user.setBalance(12345.89f);
        user.setAccNo(312422);

        System.out.println("Name :" + user.getName());
        System.out.println("Balance :" + user.getBalance());
        System.out.println("Acc :" + user.getAccNo());
        */
    	
    	int n =3;

        User[] user1 = new User[n];

        String[] nameArr = {"jagan", "janani", "hepsi"};
        long[] accNoarr = {123, 124, 125};
        float[] floatarr = {12.45f, 34.56f, 56.46f};

        for (int i = 0; i <n; i++) {
            user1[i] = new User(); // Initialize each User object
            user1[i].setName(nameArr[i]);
            System.out.println("Name: " + user1[i].getName());
            user1[i].setAccNo(accNoarr[i]);
            System.out.println("Account Number: " + user1[i].getAccNo());
            user1[i].setBalance(floatarr[i]);
            System.out.println("Balance: " + user1[i].getBalance());
            System.out.println();
        }

        // Print the details to verify
//        for (int i = 0; i <n; i++) {
//            System.out.println("Name: " + user1[i].getName());
//            System.out.println("Account Number: " + user1[i].getAccNo());
//            System.out.println("Balance: " + user1[i].getBalance());
//            System.out.println();
//        }
    }
}