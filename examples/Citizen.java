import java.util.Random;

/**
 * Created by PierreM on 03/02/2015.
 */
class Citizen implements Runnable
{
    private MutableIDCard id;

    public Citizen(MutableIDCard id)
    {
        this.id = id;
    }

    public void run()
    {
        Random r = new Random();

        try
        {
            Thread.sleep(r.nextInt(2000));
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        String message = "";
        message += "the name on this id is "+id.getName()+"\n";
        message += "and the date of birth is "+id.getDateOfBirth();

        System.out.println(message);
    }
}
