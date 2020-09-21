package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

  @Test
  public void testPublicationYearMedian() {
    //Given
    Set<Book> bookSet = new HashSet<>();
    for (int i = 0; i <= 10; i++) {
      bookSet.add(new Book("author", "title", 2000 + i, "sign" + i));
    }
    MedianAdapter medianAdapter = new MedianAdapter();

    //When
    int booksMedian = medianAdapter.publicationYearMedian(bookSet);

    //Then
    assertEquals(2005, booksMedian);
  }
}
