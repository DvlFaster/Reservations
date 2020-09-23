package reservation_repo;

import reservation_entities.UserType;

public class UserTypeRepository extends BaseRepository<UserType>{
	
	public UserTypeRepository(){
		super (UserType.class);
	}

}
