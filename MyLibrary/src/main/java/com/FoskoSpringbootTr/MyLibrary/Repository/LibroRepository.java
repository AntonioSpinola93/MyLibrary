package com.FoskoSpringbootTr.MyLibrary.Repository;

import com.FoskoSpringbootTr.MyLibrary.Entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Long> {
}
