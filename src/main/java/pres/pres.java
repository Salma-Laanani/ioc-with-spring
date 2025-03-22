package pres;

import dao.IdaoImplV1;
import metier.ImetierImpl;

public class pres {
    public static void main(String[] args) {
        IdaoImplV1 dao = new IdaoImplV1();
        ImetierImpl imetier = new ImetierImpl(dao);//injection via le constructeur
        imetier.calcul();
        System.out.println(imetier.calcul());
    }
}
