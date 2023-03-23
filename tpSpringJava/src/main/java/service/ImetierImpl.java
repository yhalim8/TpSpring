package service;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ImetierImpl implements Imetier{
    //@Autowired
    IDao dao;

    public ImetierImpl(IDao dao) {
        this.dao = dao;
    }

    //IDao dao= new DaoImpl(); // couplage faible
    @Override
    public double calcul() {
        double res = dao.getData()*5;
        return res;
    }
//injection des dependences
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
