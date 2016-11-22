package ua.day6;

/**
 * Created by Ksu on 21.11.2016.
 */
public class Name {
    String name;


    public Name() {
        this("DEFAULT_NAME");
    }

    public Name(String name) {

                this.name = name;

       }

    @Override
    public String toString() {
        return name;
    }


    public boolean equalsMy(Object obj) {
        //return super.equals(obj);
        //Name name1 = (Name) obj;

        if(obj != null &&name.equals(obj.toString()) /*name==obj.toString()*/) {
            return true;
        }
        else
        {
                        return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Name name1 = (Name) o;

        if (name != null ? !name.equals(name1.name) : name1.name != null) return false;

        return true;
    }
}
