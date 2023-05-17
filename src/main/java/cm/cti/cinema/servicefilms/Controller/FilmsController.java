package cm.cti.cinema.servicefilms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cm.cti.cinema.servicefilms.Repositories.FilmsRepository;
import cm.cti.cinema.servicefilms.models.Films;




@RestController
@RequestMapping(value= "api/films")
public class FilmsController {
	@Autowired
	private FilmsRepository filmsRepository;
	
	
	@GetMapping
	public List<Films> findAllFilms() {
		return filmsRepository.findAll();
	}

	@GetMapping("/all")
	public List<Films> findAllFilms2() {
		return filmsRepository.findAll();
	}
	
	@PostMapping
	public Films create(
			@RequestBody Films films
			){
		films.setId(null);
		filmsRepository.save(films);
		return films;
		}
		
	@GetMapping("/{id}")
	public Films findById(
			@PathVariable("id") Long id
			) {
		return filmsRepository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public String delete(
			@PathVariable("id") Long id
			) {
		Films films = filmsRepository.findById(id).get();
		filmsRepository.delete(films);
		return "OK";
	}
		
	
	@PutMapping
	public Films update(
			@RequestBody Films films) {
		
		
		
		Films films2 = filmsRepository.findById(films.getId()).get();
		
		films2.setTitre(films.getTitre());
		films2.setAuteur(films.getAuteur());
		films2.setImage(films.getImage());
		films2.setDate(films.getDate());
		
		filmsRepository.save(films2);
		return films2;
	}
		
}
