package ua.day6;

/**
 * Created by Ksu on 21.11.2016.
 */
public class Entry {
    Object key;
    Object value;


    //

    @Override
    public String toString() {
        //???return super.toString();
        return key.toString()+" --> "+value.toString();

    }

    public int getHasKeyIndex(int hashSize){
     int keyIndex =key.hashCode()%hashSize;
return keyIndex;
    }


}
