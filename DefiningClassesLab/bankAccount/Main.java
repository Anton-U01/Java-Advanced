package DefiningClassesLab.bankAccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Map<Integer,BankAccount> accounts = new HashMap<>();
        while (!line.equals("End")){
            String[] data = line.split(" ");
            if(data.length == 1){
                BankAccount account = new BankAccount();
                accounts.put(account.getId(),account);
                System.out.println("Account ID" + account.getId() + " created");
            } else {
                String command = data[0];
                switch (command){
                    case "Deposit":
                        int id = Integer.parseInt(data[1]);
                        int amount = Integer.parseInt(data[2]);
                        if(accounts.containsKey(id)){
                            accounts.get(id).deposit(amount);
                            System.out.println("Deposited " + amount + " to ID" + id);
                        } else {
                            System.out.println("Account does not exist");
                        }
                        break;
                    case "SetInterest":
                        double newInterest = Double.parseDouble(data[1]);
                        BankAccount.setInterestRate(newInterest);
                        break;
                    case "GetInterest":
                        int id1 = Integer.parseInt(data[1]);
                        int years = Integer.parseInt(data[2]);
                        if(accounts.containsKey(id1)){
                            System.out.printf("%.2f%n",accounts.get(id1).getInterestRate(years));
                        } else {
                            System.out.println("Account does not exist");
                        }
                        break;
                }
            }
            line = scan.nextLine();
        }
    }
}
