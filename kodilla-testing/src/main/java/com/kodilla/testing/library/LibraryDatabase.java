package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    // lists book having title beggining with title fragment
    List<Book> listBookWithCondition(String titleFragment);

    // list books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //try to rent a book
    //returns true when success
    //and returns false when book is unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    //return all books borrowed by libraryUser to the library
    // returns number of books returned back
    int returnBooks(LibraryUser libraryUser);
}
