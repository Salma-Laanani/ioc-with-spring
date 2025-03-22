package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presavecSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Imetier metier = (Imetier) context.getBean("metier");//on peut chercher un bean via
        //soninterface en utilisant Imetier.vlassa l'interieur de  getBean() et pas de casting

        System.out.println(metier.calcul());
    }
}
