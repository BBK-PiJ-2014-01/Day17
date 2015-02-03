import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.Random;

/**
 * Created by PierreM on 03/02/2015.
 */
class Officer implements Runnable
{
    private MutableIDCard id;

    public Officer(MutableIDCard id)
    {
        this.id=id;
    }

    public void run()
    {
        Random r=new Random();

        try
        {
            Thread.sleep(r.nextInt(2000));
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        String name = DataGenerator.getNextName();
        Date dateOfBirth = DataGenerator.getNextDate();
        BufferedImage photo = DataGenerator.getNextPhoto();

        id.set(name, dateOfBirth, photo);
    }
}
