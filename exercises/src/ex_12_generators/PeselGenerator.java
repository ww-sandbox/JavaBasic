package ex_11_generators;

public class PeselGenerator extends Generator {


    private int[] pesel;
    private final int[] weigths = {9, 7, 3, 1, 9, 7, 3, 1, 9, 7};


    public PeselGenerator(String year, String month, String day, String id, boolean isMale) {
        int[] dateI = stringToIntArr(year + month + day);
        int[] idI = stringToIntArr(id);
        int genderI = getSexNumber(isMale);

        int[] peselNumbers = new int[10];
        System.arraycopy(dateI, 2, peselNumbers,0, 6);
        System.arraycopy(idI, 0, peselNumbers,6, 3);
        peselNumbers[9] = genderI;

        this.pesel = peselNumbers;
    }

    public String generate() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < pesel.length; i++) {
            sb.append(pesel[i]);
        }
        sb.append(calculateControlSum());
        return sb.toString();
    }

    private int calculateControlSum() {
        int sum = 0;
        for (int i = 0; i < this.pesel.length; i++) {
            sum += pesel[i] * weigths[i];
        }
        return sum % 10;
    }

    private int[] stringToIntArr(String str) {
        char[] charsArray = str.toCharArray();
        int[] intArray = new int[charsArray.length];

        for (int i = 0; i < charsArray.length; i++) {
            intArray[i] = Character.getNumericValue(charsArray[i]);
        }

        return intArray;
    }

    private int getSexNumber(boolean isMale) {
        int sexNumber = 7;

        return isMale ?
                sexNumber++ :
                sexNumber;
    }
}
