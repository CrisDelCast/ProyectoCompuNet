package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.Cliente;


import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.domain.TipoIdentificacion;
import co.edu.icesi.viajes.domain.TipoServicio;
import co.edu.icesi.viajes.dto.TipoDestinoDTO;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface TipoServicioRepository extends JpaRepository<TipoServicio,Integer>{

}
