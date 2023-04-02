public class CreditCard {
    int accountNumber;
    int currentSum;

    void addMoney(int count) {
        currentSum += count;
    }
    void drawMoney(int count) {
        currentSum -= count;
    }
    int getCurrentSum() {
        System.out.println("Номер карты: " + accountNumber);
        return currentSum;
    }
}