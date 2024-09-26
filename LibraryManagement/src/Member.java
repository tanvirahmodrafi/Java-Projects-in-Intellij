public class Member {
    String name;
    String uniqueMemberId;
    String contactNumber;
    int bookBorrowed = 0;

    Member(String name, String uniqueId, String contactNumber, int bookBorrowed) {
        this.name = name;
        this.uniqueMemberId = uniqueId;
        this.contactNumber = contactNumber;
        this.bookBorrowed = bookBorrowed;
    }
    public String getName() {
        return name;
    }
    public String getUniqueMemberId() {
        return uniqueMemberId;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public int getBookBorrowed() {
        return bookBorrowed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUniqueId(String uniqueId) {
        this.uniqueMemberId = uniqueId;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public void setBookBorrowed(int bookBorrowed) {
        this.bookBorrowed = bookBorrowed;
    }

    @Override
    public String toString() {
        return "Member " +
                "[name=" + name + ",\n" +
                " Members uniqueId=" + uniqueMemberId + ",\n" +
                " contactNumber=" + contactNumber + ",\n" +
                " bookBorrowed=" + bookBorrowed + "books" +
                "]";
    }
}
