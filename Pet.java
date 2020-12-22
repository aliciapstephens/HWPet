public class Pet
{
    private String name;
    private String location;
    private int age;
    private String type;

    private Pet(String name, String location, int age)
    {
        this.name = name;
        this.location = location;
        this.age = age;
    }

    private String getname()
    {
        return name;
    }

   private void setname(String name)
    {
        this.name = name;
    }

    public String gettype()
    {
        return type;
    }

    public void setlocation(String location)
    {
        this.location = location;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
d