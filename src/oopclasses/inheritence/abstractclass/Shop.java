package oopclasses.inheritence.abstractclass;

import java.util.List;

//scalability of the project, framework; => ability to grow
public abstract class Shop {

    public abstract List<String> getAllProducts();

    /**
     *
     * @return
     */

    public abstract Vehicle getTheLastVehicleToTheShop();
}
