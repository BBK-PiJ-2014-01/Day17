/**
 * Created by PierreM on 02/02/2015.
 */

import java.util.Date;
import java.awt.image.BufferedImage;

public class ImmutableExample
{
    public static void main(String[] args)
    {
        String name = DataGenerator.getNextName();
        Date dateOfBirth = DataGenerator.getNextDate();
        BufferedImage photo = DataGenerator.getNextPhoto();

        MutableIDCard id = new MutableIDCard(name,dateOfBirth,photo);

        Runnable officer = new Officer(id);
        Runnable citizen = new Citizen(id);

        Thread t1 = new Thread(officer);
        Thread t2 = new Thread(citizen);

        t1.start();
        t2.start();
    }
}

