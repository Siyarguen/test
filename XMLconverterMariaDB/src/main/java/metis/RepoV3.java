package metis;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepoV3  extends JpaRepository<View3, Integer>{

	
}
