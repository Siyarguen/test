package metis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoV2  extends JpaRepository<View2, Integer>{

	
}
