package hw;

import java.util.ArrayList;

public  abstract class Card {
    String creditCardType;

    public Card(String creditCardType) {
        this.creditCardType = creditCardType;
    }
    abstract void carSwipe();

    void cardDeclined(){
        System.out.println("not enough founds for transaction");
    }
}
class visaCard extends Card{

    public visaCard(String creditCardType) {
        super(creditCardType);
    }


    @Override
    void carSwipe() {
        System.out.println("VISA card swiped ");
    }
}
class masterCard extends Card{

    public masterCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void carSwipe() {
        System.out.println("Masted Card swiped ");
    }
}
class AmericanExpress extends Card{

    public AmericanExpress(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void carSwipe() {
        System.out.println("American express card swiped ");
    }
}
class test {
    public static void main(String[] args) {


        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new visaCard("VISA"));
        cards.add(new masterCard("MASTERCARD"));
        cards.add(new AmericanExpress("AMERICCAN EXPRESS"));

        for(var test:cards){
            test.carSwipe();
            test.cardDeclined();
        }

    }
}