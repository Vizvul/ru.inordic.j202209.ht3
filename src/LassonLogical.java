public class LassonLogical {

    public static String lassonLogical(int inA, int inB) {
        if (inA > inB) {
            return "Первое (" + inA + ") больше второго (" + inB + ") числа";
        } else if (inA < inB) {
            return "Первое (" + inA + ") меньше второго (" + inB + ") числа";
        } else {
            return "Первое (" + inA + ") равно второму (" + inB + ") числу";
        }

    }
    public static boolean lassonLogical(Boolean inA, Boolean inB, int operation) {
        boolean result = true;
        switch (operation) {
            case 0:
                result = inA && inB;
                break;
            case 1:
                result = inA || inB;
                break;
            case 2:
                result = inA ^ inB;
                break;
        }
    return result;
    }

}
