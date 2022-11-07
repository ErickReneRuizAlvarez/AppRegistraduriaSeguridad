package refuerzo.domingo.ciclo4a.MainSecurity.Repositorios;

import refuerzo.domingo.ciclo4a.MainSecurity.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRol extends MongoRepository<Rol, String>{
}
