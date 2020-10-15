package wrx.rb.demo.postprocessor;

import org.springframework.beans.factory.annotation.Autowired;

public class Cup {

    @Autowired
    Water water;

    public void cupInit () {
        System.out.println("init cup");

        if (water != null) {
            System.out.println("have water");
        } else {
            System.out.println("empty");
        }
    }

    public void cupDestroy () {
        System.out.println("destroy cup");
    }

}
