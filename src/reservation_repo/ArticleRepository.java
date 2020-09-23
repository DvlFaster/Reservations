package reservation_repo;

import reservation_entities.Article;
import reservation_entities.Groups;

public class ArticleRepository extends BaseRepository<Article>{

	public ArticleRepository() {
		super(Article.class);
	}
	
}
