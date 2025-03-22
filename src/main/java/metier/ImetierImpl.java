package metier;

import dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class ImetierImpl implements Imetier {

    //@Autowired pas recommande
    private Idao dao;

    public ImetierImpl(@Qualifier("dao") Idao dao) {
        this.dao = dao;
    }   //l'injection via le constructeur


    @Override
    public double calcul() {
        double tem=dao.getData();
        double res=tem*35;
        return res;
    }

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
