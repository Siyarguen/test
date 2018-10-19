package metis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoV1  extends JpaRepository<View1, Integer>{

	
}

