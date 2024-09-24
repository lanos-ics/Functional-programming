import java.util.function.Supplier;

public class LanosRunner {
    public static void main(String[] args) {

        Lanos lanos = new Lanos( );

        Supplier<String> TID = lanos::generateTransectionID;
        System.out.println(TID.get());

    }
}
