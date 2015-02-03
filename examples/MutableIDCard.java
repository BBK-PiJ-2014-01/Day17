import java.awt.image.BufferedImage;
import java.util.Date;

/**
 * Created by PierreM on 03/02/2015.
 */
class MutableIDCard
{
    private String name;
    private Date dateOfBirth;
    private BufferedImage photo;

    public MutableIDCard(String name,Date dateOfBirth,BufferedImage photo)
    {
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.photo=photo;
    }

    public void set(String name,Date dateOfBirth,BufferedImage photo)
    {
        check(name,dateOfBirth,photo);

        synchronized(this)
        {
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.photo = photo;
        }
    }

    public synchronized String getName()
    {
        return name;
    }

    public synchronized Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public synchronized BufferedImage getPhoto()
    {
        return photo;
    }

    public void check(String name,Date dateOfBirth,BufferedImage photo)
    {
        if (name==null || name.equals(""))
        {
            throw new IllegalArgumentException();
        }

        if (dateOfBirth==null)
        {
            throw new IllegalArgumentException();
        }

        long age=getAge(dateOfBirth);

        if (dateOfBirth==null || age<=0)
        {
            throw new IllegalArgumentException();
        }

        if (photo==null)
        {
            throw new IllegalArgumentException();
        }
    }

    private long getAge(Date dateOfBirth)
    {
        long now = new Date().getTime();
        long age = now - dateOfBirth.getTime();
        return age;
    }
}
