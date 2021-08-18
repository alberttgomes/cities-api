package alberttgomes.citiesapi.countries.repositories;

import alberttgomes.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
