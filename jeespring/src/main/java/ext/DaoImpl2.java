package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {

    @Override
    public double getValue() {
        System.out.println("version web service");
        double data = 521;
        return data;
    }
}
