package reservation_repo;

import reservation_entities.Menu;
import reservation_entities.Bussiness;

public class MenuRepository extends BaseRepository<Menu>{

	public MenuRepository() {
		super(Menu.class);
	}
	
}

