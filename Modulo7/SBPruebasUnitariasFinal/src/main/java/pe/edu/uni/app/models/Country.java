package pe.edu.uni.app.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	private Long countryId;
	@Column(name = "iso_code")
	private String isoCode;
	@Column(name = "country_name")
	private String countryName;
	@Column(name = "country_capital")
	private String countryCapital;
	@Column(name = "country_independence_date")
	private String countryIdependenceDate;

}
