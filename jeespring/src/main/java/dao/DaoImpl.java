package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao{
    @Override
    public double getValue() {
        System.out.println("version base de donne");
        double data=334;
        return data;
    }
}
