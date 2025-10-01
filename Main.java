//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Iterator;

class Main {
    Main() {
    }

    public static void main(String[] args) {
        LibrarySystem2 system = new LibrarySystem2();
        Book2 b1 = new Book2("the coding world", "mohammed", "ali", "bahrin Hall", 2023, "9780132350884", 1001L);
        Book2 b2 = new Book2("the ethical code", "rayan", "abdullah", "jeddah hall", 2018, "9780134685991", 1002L);
        Book2 b3 = new Book2("java world", "ali", "mohsen", "jordan hall", 2005, "9780596009205", 1003L);
        system.addBook(b1);
        system.addBook(b2);
        system.addBook(b3);
        LibMembe2 m1 = new LibMembe2("Ali", "Hassan", 'M', 1234567890L, "33334444");
        system.addMember(m1);
        system.issueBook(1001L, 1234567890L);
        system.issueBook(1003L, 1234567890L);
        system.returnBook(1001L);
        system.deleteBook(1002L);
        System.out.println("Delete book done ");
        System.out.println("All books in system:");
        Iterator var6 = system.getBooksList().iterator();

        while(var6.hasNext()) {
            Book2 book = (Book2)var6.next();
            System.out.println(book);
        }

        System.out.println("Total number of books: " + system.sizeBooksList());
    }
}
