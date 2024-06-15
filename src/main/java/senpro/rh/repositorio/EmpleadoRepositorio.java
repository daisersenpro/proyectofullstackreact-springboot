package senpro.rh.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import senpro.rh.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
