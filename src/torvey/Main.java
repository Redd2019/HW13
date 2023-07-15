package torvey;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Author author2= new Author("Lev", "Tolstoy");
        Book book = new Book("War and Peace", author, 1850);

        System.out.println("author equals itself = " + author.equals(author));
        System.out.println("author equals author2 = " + author.equals(author2));

        System.out.println(author);
        System.out.println(book);

        System.out.printf(
                "%s by %s %s, %d%n",
                book.getTitle(),
                book.getAuthor().getFirstName(),
                book.getAuthor().getLastName(),
                book.getPublishingYear());
        book.setPublishingYear(1980);
        System.out.println(
                book.getTitle()
                + " by "
                + book.getAuthor().getFirstName()
                + " "
                + book.getAuthor().getLastName()
                + ", "
                + book.getPublishingYear());
    }

}
