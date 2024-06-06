package co.edu.icesi.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.icesi.viajes.domain.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
    // Puedes agregar métodos personalizados si necesitas consultas específicas para Reserva
}
