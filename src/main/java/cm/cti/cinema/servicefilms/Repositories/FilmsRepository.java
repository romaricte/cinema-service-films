package cm.cti.cinema.servicefilms.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import cm.cti.cinema.servicefilms.models.Films;

@RestController
public interface FilmsRepository extends JpaRepository<Films, Long>{

}
