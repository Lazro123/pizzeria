package EFLAZAROIMANOL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFLAZAROIMANOL.Model.PizzeriaDetalle;

@Repository
public interface PizzeriaPizzaRepository extends JpaRepository<PizzeriaDetalle, Integer> {

}
