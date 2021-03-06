package io.pillopl.testablearch.ex2.bigballofmud.repositories;

import io.pillopl.testablearch.ex2.bigballofmud.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<BookEntity, UUID> {

}
