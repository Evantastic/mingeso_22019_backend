package mingeso.backend.rest.mysql.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
  Optional<Client> findFirstByEmail(String email);
}
