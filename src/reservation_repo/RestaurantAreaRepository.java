package reservation_repo;

import reservation_entities.RestaurantArea;
import reservation_entities.Bussiness;
import reservation_entities.TableType;

public class RestaurantAreaRepository extends BaseRepository<RestaurantArea> {
	
	public RestaurantAreaRepository(){
		super(RestaurantArea.class);
	}

}
