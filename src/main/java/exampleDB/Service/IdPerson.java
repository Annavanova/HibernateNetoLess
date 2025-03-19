package exampleDB.Service;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Embeddable
public class IdPerson implements Serializable {
    @Column(length = 50, name = "name", nullable = false)
    private String name;

    @Column(length = 50, name = "surname", nullable = false)
    private String surname;

    @Column(length = 50, name = "age", nullable = false)
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdPerson idPerson = (IdPerson) o;
        return age == idPerson.age &&
                Objects.equals(name, idPerson.name) &&
                Objects.equals(surname, idPerson.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
