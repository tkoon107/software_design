public class Ledger {

    private String name, description, seed;
    private Block genesisBlock;

    public Ledger(String name, String description, String seed){

        name = name;
        description = description;
        seed = seed;
    }



    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSeed() {
        return seed;
    }
    public void setSeed(String seed) {
        this.seed = seed;
    }

    public Account createAccount(String address){

    }

    public String processTransaction(Transaction transaction){

    }

    public int getAccountBalance(){

    }

    public map<address, balance> getAccountBalances(){

    }

    public Block getBlock(int blockNumber){

    }

    public Transaction getTransaction(String transactionId){

    }

    public void validate(){

    }

}
