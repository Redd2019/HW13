package torvey;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    @Override
        public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!o.getClass().equals(Author.class)) return false;
        Author other = (Author) o;
        return Objects.equals(this.firstName, other.firstName) && Objects.equals(this.lastName, other.lastName);
    }

    @Override
        public int hashCode() {
        return Objects.hash(this.firstName, this.lastName);
    }

    @Override
        public String toString() {
        return this.firstName + " " + this.lastName;
    }
}