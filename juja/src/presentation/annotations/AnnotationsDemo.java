package presentation.annotations;

@Juja
public class AnnotationsDemo {

    private int field;

    @Juja
    public String toStrings() {
        return super.toString();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public String toString() {
        return "AnnotationDemo" + String.valueOf(field);
    }
}
