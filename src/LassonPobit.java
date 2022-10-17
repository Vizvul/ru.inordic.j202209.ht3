public class LassonPobit {

    public static String lassonPobit(int inA) {
        return Integer.toBinaryString(~inA);
        }

        public static String lassonPobit(int inA, int inB, int inOperation) {
        String result = "";
        switch (inOperation) {
            case 1:
               result = Integer.toBinaryString(inA & inB);
               break;
            case 2:
                result = Integer.toBinaryString(inA | inB);
                break;
            case 3:
                result = Integer.toBinaryString(inA ^ inB);
                break;
        }
        return result;
        }

}
