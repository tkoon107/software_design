public class Transaction {

    private String transactionId, payload;
    private int amount, fee;
    private Account payer, receiver;

    public Transaction(String transactionId, String payload, Account payer, Account receiver){

        transactionId = transactionId;
        payload = payload;
        payer = payer;
        receiver = receiver;


    }




}
