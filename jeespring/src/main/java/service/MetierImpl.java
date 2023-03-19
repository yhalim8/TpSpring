package service;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier{
   // @Autowired   //injection des dependeces ; inject in this variable an object IDao
    //@Qualifier("dao")  //pour preciser le nom de class a injecter
    private IDao dao;  //couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getValue()/2;
    }
    public void setDao(IDao dao) { // pour permettere d'injecter
        // dans  la variable dao un objet de type IDao(une classe qui implemente l'interface idao)
        this.dao = dao;
    }

}
