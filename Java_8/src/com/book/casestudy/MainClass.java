package com.book.casestudy;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		// 1. Find books with more then 400 pages
			List<Book> books = allBooks
					.stream()
					.filter(book->book.getPages()>400)
					.collect(Collectors.toList());
			//books.forEach(book->System.out.println(book));
		
		// 2. Find all books that are java books and more then 400 pages
		 Predicate<Book> moreThan400Pages = book->book.getPages()>400;
		 Predicate<Book> isJavaBook = book-> book.getSubject()==Subject.JAVA;
		 
		 List<Book> books2 = allBooks
				 			.stream()
				 			.filter(moreThan400Pages.and(isJavaBook))
				 			.collect(Collectors.toList());
		//books2.forEach(book->System.out.println(book));
		
		// 3. We need the top three longest books
			List<Book> topThreeLongestBooks = allBooks
											  .stream()
											  .sorted(Comparator.comparing(Book::getPages).reversed())
											  .limit(3)
											  .collect(Collectors.toList());
		//topThreeLongestBooks.forEach(book-> System.out.println(book));
			
		// 4. We need from the fourth to the last longest books
			List<Book> fourthToLastLongest = allBooks
											.stream()
											.sorted(Comparator.comparing(Book::getPages))
											.skip(3)
											.collect(Collectors.toList());
			//fourthToLastLongest.forEach(book->System.out.println(book));
			
		// 5. We need to get all the publishing years
			List<Integer> pubYear = allBooks
									.stream()
									.map(book->book.getYear())
									.distinct()
									.collect(Collectors.toList());
		//	pubYear.forEach(year->System.out.println(year));
		
		// 6. We need all the authors names who have written a book	
			List<String> authorNames = allBooks
										.stream()
										.flatMap(book->book.getAuthors().stream())
										.map(author->author.getName())
										.distinct()
										.collect(Collectors.toList());
			//authorNames.forEach(name->System.out.println(name));
			
		// 7. We want to know if all the books are written by more than one author? boolean
			boolean isAllBooksWrittenByMoreThanOneAuthor = allBooks
															.stream()
															.allMatch(book->book.getAuthors().size()>1);
			//System.out.println(isAllBooksWrittenByMoreThanOneAuthor);
			
		//8. We want the most recent published book
			/*
			 * Optional<Book> optBook = allBooks
			 * 							.stream()
			 * 							.min(Comparator.comparing(Book::getYear)); 
			 * String bookTitle =	optBook
			 * 						.map(book->book.getTitle())
			 * 						.orElse("not found");
			 * System.out.println(bookTitle);
			 */
			 String optBook = allBooks 
					 .stream() 
					 .min(Comparator.comparing(Book::getYear))
					 .map(book->book.getTitle()) 
					 .orElse("not found");
			// System.out.println(optBook);
			 
		//9. is all the elements of array are odd?
			 int arr[] = {5,7,11,13,89};
			 boolean isAllArrayOdd = Arrays
					 				.stream(arr)
					 				.allMatch(num->num%2!=0);
			// System.out.println(isAllArrayOdd);
			 
			 //FindAny demo
//			 OptionalInt findAny = Arrays.stream(arr)
//					 					.filter(num->num%2==0)
//					 					.findAny();
//			 System.out.println(findAny.orElseGet(()->2));
			 
		//10. We want one of the books written by more than one author.? (findAny)
			 Optional<Book> findAnyBookWrittenByMoreThanOne = allBooks
					 										.stream()
					 										.filter(book->book.getAuthors().size()>1)
					 										.findAny();
			 String result = findAnyBookWrittenByMoreThanOne.map(book->book.getTitle()).orElse("Not found");
			 //System.out.println(result);
		
		// 11. We want to know how many pages the longest book has.
			 int pages = allBooks
					 	.stream()
					 	.max(Comparator.comparing(Book::getPages))
					 	.map(book->book.getPages())
					 	.orElse(-1);
			// System.out.println(pages);
			
		//12. We want the total number of pages published
			 //Use of Reduction - Divide and conquer
			//5,7,11,13,89,70, 6, 34
			//5,7,11,13		5,7,11,13
			//0+5+7   11,13			5,7		11,13
		int numPages = allBooks
			 .stream()
			 .map(book->book.getPages())
			 .reduce(0,(x,y)-> x+y);
		//System.out.println(numPages);	
	/*
	 * .reduce(0, new BinaryOperator<Integer>() {
	 * 	 * @Override 
	 * public Integer apply(Integer x, Integer y) 
	 * { 
	 * 	return x+y;
	 *  }
	 * 	});
	 */
		
		//13.  We want the average number of pages of the books
			Double avgNumPages = allBooks
							.stream()
							.collect(Collectors.averagingLong(Book::getPages));
			//System.out.println(avgNumPages);
			
		//14.  We want all the titles of the books
			//All tiles print : java , adv c#
			String titleBook = allBooks
									.stream()
									.map(book->book.getTitle())
									.collect(Collectors.joining(" , "));
			//System.out.println(titleBook); 
		
		//15. We want the book with the higher number of authors?
			String highNumAuthors = allBooks
									.stream()
									.max(Comparator.comparing((Book b)-> b.getAuthors().size()))
									.map(book->book.getTitle())
									.orElse("Not Found");
		//	System.out.println(highNumAuthors);										
	
		//16. We want a Map of book per year.
			Map<Integer, List<Book>> bookByYear = allBooks
			.stream()
			.collect(Collectors.groupingBy(Book::getYear));
//			bookByYear.entrySet().stream().forEach(entry -> {
//					System.out.println(entry.getKey());
//					entry.getValue().forEach(book->System.out.println(book));
//				});
			
		//17. We want a Map of book per year and then by subject
			Map<Integer, Map<Subject, List<Book>>> map2 = allBooks.stream()
			.collect(Collectors.groupingBy(Book::getYear, Collectors.groupingBy(Book::getSubject)));
			
//			map2.entrySet().stream().forEach(entry->{
//				System.out.println(entry.getKey());
//				entry.getValue().forEach((subject,book)->{
//					System.out.println(subject);
//					System.out.println(book);
//				});
//			});
			
			
		//18. We want to count how many books are published per year.
			Map<Integer, Long> countBooksPerYear = allBooks.stream().collect(
					Collectors.groupingBy(Book::getYear, Collectors.counting()));
			countBooksPerYear.entrySet().stream().forEach(entry->{
				System.out.println(entry.getKey()+" : "+ entry.getValue());
			});
	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(
				new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in")
				);

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"),
				new Author("Abhijeet", "gupta", "us")
				);

		books.add(new Book("java", authors1, 400, Subject.JAVA, 2021, "1213"));
		books.add(new Book("adv java", authors1, 400, Subject.JAVA, 2021, "1213"));
		
		books.add(new Book("adv C#", authors2, 700, Subject.DOT_NET, 2022, "1218"));
		books.add(new Book("C# basics", authors3, 600, Subject.DOT_NET, 2019, "1293"));

		return books;
	}

}
