public class Block {

    private int blockNumber;
    private String previousHash;
    private String hash;
    private  Transaction transactionList;
    private Account accountBalanceMap;

    public Block(int blockNumber, String hash){

            blockNumber = blockNumber;
            hash = hash;

    }

}
