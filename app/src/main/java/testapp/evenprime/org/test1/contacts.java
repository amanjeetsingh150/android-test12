package testapp.evenprime.org.test1;

/**
 * Created by dravit on 8/15/2016.
 */
public class contacts {

    //private members
    String num,name;
    int id;
    //constructors
    public void contacts()
    {
        
    }

    public contacts(String name,String num,int id)
    {
        this.num=num;
        this.name=name;
        this.id=id;
    }
    public contacts(String name,String num)
    {
        this.num=num;
        this.name=name;
    }
    public int get_id()
    {
        return this.id;
    }
    public String get_name()
    {
        return this.name;
    }
    public String get_num()
    {
        return this.num;
    }
    public void set_id(int id)
    {
        this.id=id;
    }
    public void set_name(String name)
    {
        this.name=name;
    }
    public void set_num(String num)
    {
        this.num=num;
    }
};
