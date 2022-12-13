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
@ToString
@Table(name = "jokes")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Joke {
    @Id
    Long id;
    String type;
    String setup;
    String punchline;
}
