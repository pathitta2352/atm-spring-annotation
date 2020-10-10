package th.ac.kmitl.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Main<atm> {
    private static  atm

    public void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        atm = context.getBean(ATM.class);

        String name;
        name = atm.validateCustomer(2, 2345);
        System.out.println( name + " has " + atm.getBalance() );
        atm.withdraw(200);
        System.out.println( name + " has " + atm.getBalance() );

        Bank bank = context.getBean(Bank.class);
        System.out.println(bank.getName());

    }
}
