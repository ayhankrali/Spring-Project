package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Users")
public class User {
    private Long id;
    private String email;
    private String lastName;
    private String firstName;
    private String password;



}
