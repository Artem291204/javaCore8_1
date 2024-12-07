import org.example.PaymentCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPaymentCard {
    PaymentCard paymentCard=new PaymentCard();
    @Test
    public void testReceiptMoney(){
        int a=300, b=20,expected=320;
        int actual=paymentCard.receiptMoney(a,b);

        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testWriteOffMoney(){
        int a=300, b=20,expected=280;
        int actual=paymentCard.writeOffMoney(a,b);

        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void testTaxWriteOff(){
        int a=300, b=20,expected=60;
        int actual=paymentCard.taxWriteOff(a,b);

        Assertions.assertEquals(actual,expected);
    }


}
