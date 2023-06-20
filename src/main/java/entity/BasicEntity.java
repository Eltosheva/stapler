package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
abstract class BasicEntity {
    @Id
    private int id;

}
