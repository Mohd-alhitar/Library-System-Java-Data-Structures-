//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class LibMembe2 {
    private String fName;
    private String Lname;
    private char gender;
    private long cprNum;
    private String teleNum;
    private Book2[] bookissued;
    private int numBookIssued;

    public LibMembe2() {
        this.fName = "noName";
        this.Lname = "noName";
        this.gender = 'M';
        this.cprNum = 0L;
        this.teleNum = "NotYet";
        this.bookissued = new Book2[10];
        this.numBookIssued = 0;
    }

    public LibMembe2(String f, String l, char C, long cpr, String tele) {
        this.fName = f;
        this.Lname = l;
        this.gender = C;
        this.cprNum = cpr;
        this.teleNum = tele;
        this.bookissued = new Book2[10];
        this.numBookIssued = 0;
    }

    public String getfName() {
        return this.fName;
    }

    public String getLname() {
        return this.Lname;
    }

    public char getGender() {
        return this.gender;
    }

    public long getCprNum() {
        return this.cprNum;
    }

    public String getTeleNum() {
        return this.teleNum;
    }

    public Book2[] getBookissued() {
        return this.bookissued;
    }

    public int getNumBookIssued() {
        return this.numBookIssued;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setLname(String lname) {
        this.Lname = lname;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCprNum(long cprNum) {
        this.cprNum = cprNum;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public void setBookissued(Book2[] bookissued) {
        this.bookissued = bookissued;
    }

    public void setNumBookIssued(int numBookIssued) {
        this.numBookIssued = numBookIssued;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            LibMembe2 libMembe2 = (LibMembe2)o;
            return this.cprNum == libMembe2.cprNum;
        } else {
            return false;
        }
    }

    public String toString() {
        return "{fName='" + this.fName + " , Lname='" + this.Lname + " , gender=" + this.gender + ", cprNum=" + this.cprNum + ", teleNum='" + this.teleNum + " , numBookIssued=" + this.numBookIssued + "}";
    }
}
