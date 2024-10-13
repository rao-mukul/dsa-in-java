package lec12_methods;

public class Q4 {

    public static boolean leap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean leapConcise(int year){
        if ((year % 4 == 0) && (year%100 != 0 || year% 400 == 0)) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(leap(1900));
        System.out.println(leapConcise(1900));
    }
}
