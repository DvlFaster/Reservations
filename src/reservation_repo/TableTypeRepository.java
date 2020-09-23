package reservation_repo;

import reservation_entities.TableType;

public class TableTypeRepository extends BaseRepository<TableType> {
	
	public TableTypeRepository(){
		super (TableType.class);
	}

}
