package collection;

import java.util.ArrayList;
import java.util.List;

public class MapReduceDemo {
    public static void main(String[] args) {
        /*
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = numbers.stream().reduce(1, ((previousValue, currentValue) -> {
            System.out.printf("Previous Value: %s, Current Value: %s\n", previousValue, currentValue);
            return previousValue + currentValue;
        }));
        System.out.printf("Sum from 1 to 10 is %s\n", result);
         */

        Customer customer = new Customer("John");
        customer.credit(100);
        customer.credit(5000);
        customer.debit(1000);
        customer.debit(500);
        customer.credit(5000);
        customer.debit(3000);
        customer.credit(600);

        double totalCredit = customer.getTotalAmount(TransactionType.CREDIT);

        double totalDebit = customer.getTotalAmount(TransactionType.DEBIT);

        System.out.printf("Total Credit: $%s\nTotal Debit: $%s\nBalance: $%s", totalCredit, totalDebit, totalCredit - totalDebit);
    }
}

class Customer {
    private final String name;
    private final List<Transaction> transactions;

    public String getName() {
        return name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    void debit(double amount) {
        transactions.add(new Transaction(TransactionType.DEBIT, amount));
    }

    void credit(double amount) {
        transactions.add(new Transaction(TransactionType.CREDIT, amount));
    }

    double getTotalAmount(TransactionType type) {
        return getTransactions()
                .stream()
                .filter(transaction -> transaction.getType() == type)
                .map(Transaction::getAmount)
                .reduce(0.0, Double::sum);
    }

}

class Transaction {
    private final TransactionType type;
    private final double amount;

    Transaction(TransactionType type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

enum TransactionType {
    CREDIT,
    DEBIT
}