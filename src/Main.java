public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Антон", "Чехов");
        System.out.println("Имя " + author1.getName() + " Фамилия " + author1.getLastName());
        System.out.println("Имя " + author2.getName() + " Фамилия " + author2.getLastName());

        Book book1 = new Book("Капитанская дочка", author1, 1835);
        Book book2 = new Book("Вишневый сад", author2, 1903);
        System.out.println( "Название книги " + book1.getTitle() + " Автор " + author1.getName() + " " + author2.getLastName() + " Год " + book1.getYear() );
        System.out.println( "Название книги " + book2.getTitle() + " Автор " + author2.getName() + " " + author2.getLastName() + " Год " + book2.getYear() );
        book1.setYear(1836);
        System.out.println( "Название книги " + book1.getTitle() + " Автор " + author1.getName() + " " + author2.getLastName() + " Год " + book1.getYear() );

        //Задание 2
        System.out.println("Задание 2");
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author1.equals(author2));
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2));


    }
}