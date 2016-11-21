package ua.day2;

/**
 * Created by Ksu on 16.11.2016.
 */
public class Phone {
    String code;
    String number;

    @Override
    public boolean equals(Object value) {
        if (value == null) {
            return false;

        }
        if (value == this) {
            return true;
        }

        Class phoneClass = Phone.class;
        if (value.getClass() == phoneClass) {
            Phone phone = (Phone) value;
            if (code == null && phone.code == null) {
                return true;
            }
            if ((code != null && phone.code == null) || (code == null && phone.code != null)) {
                return false;
            }

            if (number == null && phone.number == null) {
                return true;
            }
            if ((number != null && phone.number == null) || (number == null && phone.number != null)) {
                return false;
            }

            return code.equals(phone.code) && number.equals(phone.number);
        }
        return false;
    }


}




