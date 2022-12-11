package com.alexmansar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jokes")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Model {
    @Id
    Long id;
    String type;
    String setup;
    String punchline;

    @Override
    public String toString() {
        return " " + setup + " " + punchline;
    }
}
