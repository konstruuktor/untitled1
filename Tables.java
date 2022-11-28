
@Entity

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "root";
        System.out.println("Connecting...");

        public class Tables {

            @Entity
            @Table(name = "emploee")
            public class TestDB {

                @Id
                @Column(name = "id")
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                private int id;

                @Column(name = "title")
                private String title;

                @Column(name = "year")
                private int year;

                @Column(name = "genre")
                private String genre;

                @Column(name = "watched")
                private boolean watched;