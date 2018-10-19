package metisimport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImportController {

	public View1Controller v1;
	public View2Controller v2;

	@Autowired
	public ImportController(View1Controller v1, View2Controller v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

}
