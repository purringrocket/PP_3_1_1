package boot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotEmpty(message = "Name can't be empty")
    @Size(min = 2, max = 30, message = "Name must be 2-30 length")
    private String name;

    @Column
    @NotEmpty(message = "Email can't be empty")
    @Email(message = "Enter a valid email")
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
