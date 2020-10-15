package wrx.rb.demo.postprocessor;

import org.springframework.beans.factory.annotation.Autowired;

public class Man {

    @Autowired
    Cup cup;

    String tmp = "";

    public void manInit () {
        System.out.println("init man" + tmp);

        if (cup != null) {
            System.out.println("have cup");
        } else {
            System.out.println("empty");
        }
    }

    public void manDestroy () {
        System.out.println("destroy man");
    }

}
