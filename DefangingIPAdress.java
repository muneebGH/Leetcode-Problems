//E
//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//        A defanged IP address replaces every period "." with "[.]".
//Example:
//        Input: address = "1.1.1.1"
//        Output: "1[.]1[.]1[.]1"

public class DefangingIPAdress {
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
