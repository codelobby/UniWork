package LabWeek4;

public class Question3 {

    public static void main(String[] args) {

        String[] stringArray = {"Will", "Ratanavong"};
        String valueToCheck = "Will";
        System.out.println(compareStringValueToArray(stringArray, valueToCheck));
    }

    public static boolean compareStringValueToArray(String[] stringArray, String value){

        for(String checkValue : stringArray){
            if(checkValue.equals(value)){
                return true;
            }
        }
        return false;
    }
}
