public class ATM {
    public static void main(String[] args) {
        CreditCard myCreditCard = new CreditCard();
        CreditCard myCreditCard1 = new CreditCard();
        CreditCard myCreditCard2 = new CreditCard();
        CreditCard myCreditCard3 = new CreditCard();

        myCreditCard.accountNumber = 1234;
        myCreditCard.currentSum = 10;
        System.out.println("Текущая сумма: " + myCreditCard.currentSum);

        myCreditCard.addMoney(10);
        System.out.println("Текущая сумма: " + myCreditCard.currentSum);

        myCreditCard.drawMoney(10);
        System.out.println("Текущая сумма: " + myCreditCard.currentSum);
        System.out.println();

        System.out.println(myCreditCard.getCurrentSum());
        System.out.println();

        myCreditCard1.accountNumber = 1000;
        myCreditCard1.currentSum = 0;
        myCreditCard1.addMoney(1);

        myCreditCard2.accountNumber = 2000;
        myCreditCard2.currentSum = 0;
        myCreditCard2.addMoney(2);

        myCreditCard3.accountNumber = 3000;
        myCreditCard3.currentSum = 6;
        myCreditCard3.drawMoney(3);

        System.out.println("Текущий баланс: " + myCreditCard1.getCurrentSum() + "\n");
        System.out.println("Текущий баланс: " + myCreditCard2.getCurrentSum() + "\n");
        System.out.println("Текущий баланс: " + myCreditCard3.getCurrentSum() + "\n");
    }
}
