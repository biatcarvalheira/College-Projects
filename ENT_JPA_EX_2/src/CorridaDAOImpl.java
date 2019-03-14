import javax.persistence.EntityManager;

import br.com.fiap.dao.CorridaDAO;
import br.com.fiap.dao.GenericDAOImpl;
import br.com.fiap.entity.Corrida;

public class CorridaDAOImpl extends GenericDAOImpl<Corrida,Integer> implements CorridaDAO {
	public CorridaDAOImpl (EntityManager em) {
		super(em);
	}
	
}
