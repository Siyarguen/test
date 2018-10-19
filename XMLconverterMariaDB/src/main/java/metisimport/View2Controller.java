package metisimport;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface View2Controller extends JpaRepository<View2, Integer>{

	
		Optional<View2> findView2ByIdDokumentImport(int id);
	
}
