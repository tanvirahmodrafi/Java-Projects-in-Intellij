import java.util.Date;

public class Transaction {
    private int transactionID= 1;
    private String transactionType;
    private String bookUniqueId;
    private String memberUniqueId;
    private String transactionDate;
    private String bookType;

    Transaction(String transactionType, String bookUniqueId, String memberUniqueId, String transactionDate, String bookType) {
        this.transactionType = transactionType;
        this.bookUniqueId = bookUniqueId;
        this.memberUniqueId = memberUniqueId;
        this.transactionDate = transactionDate;
        this.bookType = bookType;
    }
    public int getTransactionID() {
        return transactionID;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public String getBookUniqueId() {
        return bookUniqueId;
    }
    public String getMemberUniqueId() {
        return memberUniqueId;
    }
    public String getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionID() {
        transactionID++;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public void setBookUniqueId(String bookUniqueId) {
        this.bookUniqueId = bookUniqueId;
    }
    public void setMemberUniqueId(String memberUniqueId) {
        this.memberUniqueId = memberUniqueId;
    }
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "Transaction information: " + transactionID + "\n" +
                " Transaction Type:" + transactionType + "\n" +
                " Books Unique ID" + bookUniqueId + "\n" +
                " Members Unique Id" + memberUniqueId + "\n" +
                " Transaction Date" + transactionDate + "\n" +
                " Book Type" + bookType + "\n" +
                "---------------------------------------";
    }
}
