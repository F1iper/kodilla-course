package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary underTest = new BookLibrary(libraryDatabaseMock);
        List<Book> resultOf0Books = new ArrayList<>();
        List<Book> resultOf15Books = generateListOfNBooks(15);
        List<Book> resultOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBookWithCondition(anyString()))
                .thenReturn(resultOf15Books);
        when(libraryDatabaseMock.listBookWithCondition("ZeroBooks"))
                .thenReturn(resultOf0Books);
        when(libraryDatabaseMock.listBookWithCondition("FortyBooks"))
                .thenReturn(resultOf40Books);

        //When
        List<Book> theListOf15Books = underTest.listBooksWithCondition("AnyBooks");
        List<Book> theListOf0Books = underTest.listBooksWithCondition("ZeroBooks");
        List<Book> theListOf40Books = underTest.listBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0, theListOf0Books.size());
        assertEquals(15, theListOf15Books.size());
        assertEquals(0, theListOf40Books.size());

    }

    @Test
    public void testListBooksWithConditionFragmentShortenThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary underTest = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBookWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBooks10 = underTest.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, never()).listBookWithCondition(anyString());

    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary underTest = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBookWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = underTest.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListOfBorrowedBooksWhen0() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary underTest = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("John", "Wick", "12345");
        List<Book> borrowedBooksList = generateListOfNBooks(0);
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(borrowedBooksList);

        //When
        List<Book> testList = underTest.listBooksInHandsOf(user1);

        //Then
        assertEquals(0, testList.size());
    }

    @Test
    public void testListOfBorrowedBooksWhen1() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary underTest = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("John", "Wick", "12345");
        List<Book> borrowedBooksList = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(borrowedBooksList);

        //When
        List<Book> testList = underTest.listBooksInHandsOf(user1);

        //Then
        assertEquals(1, testList.size());
    }

    @Test
    public void testListOfBorrowedBooksWhen5() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary underTest = new BookLibrary(libraryDatabaseMock);
        LibraryUser user1 = new LibraryUser("John", "Wick", "12345");
        List<Book> borrowedBooksList = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(borrowedBooksList);

        //When
        List<Book> testList = underTest.listBooksInHandsOf(user1);

        //Then
        assertEquals(5, testList.size());
    }
}