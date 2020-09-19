package com.store;

import java.time.YearMonth;

public class CreditCardInformation {
    private String creditCardNumber;
    private String nameOnCard;
    private byte cardCvv;
    private YearMonth cardExpirationDate;
    private CardType cardType;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public byte getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(byte cardCvv) {
        this.cardCvv = cardCvv;
    }

    public YearMonth getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(YearMonth cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString(){
        return String.format("Card name:%s%nCard Number:%s%nCard Expiration Date:%s%n,Card type:%s",getNameOnCard(),getCreditCardNumber(),getCardExpirationDate(),getCardType());
    }
}
