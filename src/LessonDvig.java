

public class LessonDvig {

    public static int lessonDvig(int inA, int inB, int inOperation) {
        int result = 0;
        switch (inOperation) {
            case 0:
                result = inA << inB;
                break;
            case 1:
                result = inA >> inB;
                break;
        }
        return result;
    }

}
