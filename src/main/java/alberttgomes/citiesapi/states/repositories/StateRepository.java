package alberttgomes.citiesapi.states.repositories;

import alberttgomes.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
