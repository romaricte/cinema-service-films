package cm.cti.cinema.servicefilms.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="films")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Films {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String auteur;
	private String date;
	private String type_film;
	private int censuration;
	@Column(name = "Resume",length = 1000)
	private String resume;
	private String image;
}
