package reservation_repo;

import reservation_entities.Groups;
import reservation_entities.Menu;

public class GroupsRepository extends BaseRepository<Groups> {
	
	public GroupsRepository(){
		super(Groups.class);
	}

}
