package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class IdaoImplV1 implements Idao {
    @Override
    public double getData() {
        System.out.println("Version de base de dnnee");
        double temperatura = 3.14;

        return temperatura;
    }
}
