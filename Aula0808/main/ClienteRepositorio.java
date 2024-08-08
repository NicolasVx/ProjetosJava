package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}
