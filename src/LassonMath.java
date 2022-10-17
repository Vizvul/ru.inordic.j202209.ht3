public class LassonMath {

    public static int lassonMath(int inA, int inB, int inOperation) {
        int result = 0;
        switch (inOperation) {
            case 0:
                result = inA + inB;
                break;
            case 1:
                result = inA - inB;
                break;
            case 2:
                result = inA * inB;
                break;
            case 3:
                result = inA / inB;
                break;
        }
        return result;
    }
    public static float lassonMath(float inA, float inB, int inOperation) {
        float result = 0;
        switch (inOperation) {
            case 0:
                result = inA + inB;
                break;
            case 1:
                result = inA - inB;
                break;
            case 2:
                result = inA * inB;
                break;
            case 3:
                result = inA / inB;
                break;
        }
        return result;
    }
}
