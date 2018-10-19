package metis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {

	@Autowired
	public RepoV1 repv1;
	
	@Autowired
	public RepoV2 repv2;
	
	@Autowired
	public RepoV3 repv3;
	
	

}
