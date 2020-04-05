public class Global {

    public static void main(String[] args) {

        // Construct an author instance
        Author  author1= new Author("Fernando Pessoa", "fernando.pessoa@mensagem.com", 'm');
        System.out.println(author1);  // Author's toString()

        Book book1 = new Book("The Book of Disquiet", author1, 17.45, 125);  // Test Book's Constructor
        System.out.println(book1);  // Test Book's toString()

        System.out.println(book1.getAuthor().getName());
        System.out.println(book1.getAuthor().getEmail());
        System.out.println(book1.getAuthorName());
        System.out.println(book1.getAuthorEmail());
        System.out.println(book1.getAuthorGender());

    }






}
