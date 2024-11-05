package br.com.fiap.projdiamantegym.split;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Split {
    @Id
    UUID id;
    String type;
    String description;
}
