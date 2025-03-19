package exampleDB.Repository;

import exampleDB.Service.PersonService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<PersonService> getPersonsByCity(String city) {
        var resultCity = entityManager.createQuery(
                        "SELECT p FROM Person p WHERE p.city = :city")
                .setParameter("city", city);
        return resultCity.getResultList();
    }

}
