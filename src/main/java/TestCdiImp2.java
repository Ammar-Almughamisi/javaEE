import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RequestScoped
@Named("A")
public class TestCdiImp2 implements TestCdi {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public String getMassage() {
        TestEntity testEntity = new TestEntity();
        testEntity.setId(2);
        testEntity.setName("jint");
        entityManager.persist(testEntity);
        return "cdi A";

    }
}
