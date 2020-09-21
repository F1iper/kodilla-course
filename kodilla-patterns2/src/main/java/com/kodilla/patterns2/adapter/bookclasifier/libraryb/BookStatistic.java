package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistic {
  int averagePublicationYear(Map<BookSignature, Book2> books);
  int medianPublicationYear(Map<BookSignature, Book2> books);
}
