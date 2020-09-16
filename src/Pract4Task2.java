import java.io.OutputStream;

public class Pract4Task2 {

    public static class Author{
        private String name;
        private String email;
        private char gender;
        Author(String name, String email, char gender){
            this.email=email;
            this.gender=gender;
            this.name=name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public char getGender() {
            return gender;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    public static void main(String[]args){

        Author Example=new Author("Example", "example@outlook.com", 'E');
        System.out.println(Example.toString());
        Example.setEmail("anotherexample@outlook.com");
        System.out.println(Example.getEmail());
        System.out.println(Example.getGender());
        System.out.println(Example.getName());
        System.out.println(Example.toString());
    }
}
