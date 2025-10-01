//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Book2 {
    private String title;
    private String auther1;
    private String auther2;
    private String publisher;
    private int yearofpublish;
    private String ISBN;
    private long accessionNum;
    private LibMembe2 issuedTo;

    public Book2() {
        this.title = "noTitel";
        this.auther1 = "noName";
        this.auther2 = "noName";
        this.publisher = "notYet";
        this.yearofpublish = 2000;
        this.ISBN = "0000000000000";
        this.accessionNum = 0L;
        this.issuedTo = null;
    }

    public Book2(String t, String a1, String a2, String p, int yP, String isbn, long accNum) {
        this.title = t;
        this.auther1 = a1;
        this.auther2 = a2;
        this.publisher = p;
        this.yearofpublish = yP;
        this.ISBN = isbn;
        this.accessionNum = accNum;
        this.issuedTo = null;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuther1(String auther1) {
        this.auther1 = auther1;
    }

    public void setAuther2(String auther2) {
        this.auther2 = auther2;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearofpublish(int yearofpublish) {
        this.yearofpublish = yearofpublish;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAccessionNum(long accessionNum) {
        this.accessionNum = accessionNum;
    }

    public void setIssuedTo(LibMembe2 issuedTo) {
        this.issuedTo = issuedTo;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuther1() {
        return this.auther1;
    }

    public String getAuther2() {
        return this.auther2;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public int getYearofpublish() {
        return this.yearofpublish;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public long getAccessionNum() {
        return this.accessionNum;
    }

    public LibMembe2 getIssuedTo() {
        return this.issuedTo;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Book2 book2 = (Book2)o;
            return this.accessionNum == book2.accessionNum;
        } else {
            return false;
        }
    }

    public String toString() {
        String var10000 = this.title;
        return "{title='" + var10000 + "', auther1='" + this.auther1 + "', auther2='" + this.auther2 + "', publisher='" + this.publisher + "', yearofpublish=" + this.yearofpublish + ", ISBN='" + this.ISBN + "', accessionNum=" + this.accessionNum + ", issuedTo=" + (this.issuedTo != null ? this.issuedTo.getfName() : "null") + "}";
    }
}
