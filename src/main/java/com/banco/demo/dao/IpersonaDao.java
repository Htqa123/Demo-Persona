
package com.banco.demo.dao;
//implementación de la interfas y extencion del metodo Crud
import com.banco.demo.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IpersonaDao extends CrudRepository<Persona, Long> {
    
}
