package ac.za.cput;

public abstract class Transaction {

    private String msg = "Perform next transaction";

    public Transaction() {
    }

    public Transaction(String msg) {
        this.msg = msg;
    }

    public String execute(){
        return msg;
    }
}
