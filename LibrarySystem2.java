//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.LinkedList;

class LibrarySystem2 {
    private LinkedList<Book2> booksList = new LinkedList();
    private LinkedList<LibMembe2> membersList = new LinkedList();
    private int booksListSize = 0;
    private int membersListSize = 0;

    LibrarySystem2() {
    }

    public boolean addBook(Book2 b) {
        for(int i = 0; i < this.booksList.size(); ++i) {
            if (((Book2)this.booksList.get(i)).equals(b)) {
                return false;
            }
        }

        this.booksList.add(b);
        ++this.booksListSize;
        return true;
    }

    public boolean deleteBook(long accessionNum) {
        for(int i = 0; i < this.booksList.size(); ++i) {
            Book2 book = (Book2)this.booksList.get(i);
            if (book.getAccessionNum() == accessionNum) {
                if (book.getIssuedTo() != null) {
                    return false;
                }

                this.booksList.remove(i);
                --this.booksListSize;
                return true;
            }
        }

        return false;
    }

    public boolean addMember(LibMembe2 m) {
        for(int i = 0; i < this.membersList.size(); ++i) {
            if (((LibMembe2)this.membersList.get(i)).equals(m)) {
                return false;
            }
        }

        this.membersList.add(m);
        ++this.membersListSize;
        return true;
    }

    public boolean deleteMember(long cprNum) {
        for(int i = 0; i < this.membersList.size(); ++i) {
            LibMembe2 member = (LibMembe2)this.membersList.get(i);
            if (member.getCprNum() == cprNum) {
                if (member.getNumBookIssued() > 0) {
                    return false;
                }

                this.membersList.remove(i);
                --this.membersListSize;
                return true;
            }
        }

        return false;
    }

    public int searchBook(long accessionNum) {
        for(int i = 0; i < this.booksList.size(); ++i) {
            if (((Book2)this.booksList.get(i)).getAccessionNum() == accessionNum) {
                return i;
            }
        }

        return -1;
    }

    public int searchMember(long cprNum) {
        for(int i = 0; i < this.membersList.size(); ++i) {
            if (((LibMembe2)this.membersList.get(i)).getCprNum() == cprNum) {
                return i;
            }
        }

        return -1;
    }

    public boolean isEmptyBooksList() {
        return this.booksList.isEmpty();
    }

    public boolean isEmptyMembersList() {
        return this.membersList.isEmpty();
    }

    public int sizeBooksList() {
        return this.booksListSize;
    }

    public int sizeMembersList() {
        return this.membersListSize;
    }

    public LinkedList<Book2> getBooksList() {
        return this.booksList;
    }

    public boolean issueBook(long accessionNum, long cprNum) {
        int bookIndex = this.searchBook(accessionNum);
        int memberIndex = this.searchMember(cprNum);
        if (bookIndex != -1 && memberIndex != -1) {
            Book2 book = (Book2)this.booksList.get(bookIndex);
            LibMembe2 member = (LibMembe2)this.membersList.get(memberIndex);
            if (book.getIssuedTo() == null && member.getNumBookIssued() < 10) {
                member.getBookissued()[member.getNumBookIssued()] = book;
                member.setNumBookIssued(member.getNumBookIssued() + 1);
                book.setIssuedTo(member);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean returnBook(long accessionNum) {
        int bookIndex = this.searchBook(accessionNum);
        if (bookIndex == -1) {
            return false;
        } else {
            Book2 book = (Book2)this.booksList.get(bookIndex);
            LibMembe2 member = book.getIssuedTo();
            if (member == null) {
                return false;
            } else {
                Book2[] issuedBooks = member.getBookissued();

                for(int i = 0; i < member.getNumBookIssued(); ++i) {
                    if (issuedBooks[i] != null && issuedBooks[i].equals(book)) {
                        for(int j = i; j < member.getNumBookIssued() - 1; ++j) {
                            issuedBooks[j] = issuedBooks[j + 1];
                        }

                        issuedBooks[member.getNumBookIssued() - 1] = null;
                        member.setNumBookIssued(member.getNumBookIssued() - 1);
                        book.setIssuedTo((LibMembe2)null);
                        return true;
                    }
                }

                return false;
            }
        }
    }

    public boolean isBookIssued(long accessionNum) {
        int bookIndex = this.searchBook(accessionNum);
        if (bookIndex == -1) {
            return false;
        } else {
            return ((Book2)this.booksList.get(bookIndex)).getIssuedTo() != null;
        }
    }
}
