import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Inject
    @Named("A")
TestCdi testCdi;
    @PersistenceContext
    EntityManager entityManager;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("testServlet");
        System.out.println(testCdi.getMassage());
        TestEntity testEntity = entityManager.createQuery("SELECT C FROM TestEntity C" , TestEntity.class).getSingleResult();
        System.out.println(testEntity.getName());
    }
}
