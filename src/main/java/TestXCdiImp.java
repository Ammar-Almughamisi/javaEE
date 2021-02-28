import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named("B")
public class TestXCdiImp implements TestCdi {
    @Override
    public String getMassage() {
        return "cdi B";
    }
}
