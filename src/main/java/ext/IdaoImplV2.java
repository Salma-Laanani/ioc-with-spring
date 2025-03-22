package ext;

import dao.Idao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class IdaoImplV2 implements Idao {
    @Override
    public double getData() {
        System.out.println("version web service");
        double temp=25;
        return temp;
    }
}
