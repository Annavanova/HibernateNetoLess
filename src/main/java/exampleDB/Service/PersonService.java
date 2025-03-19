package exampleDB.Service;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;

public class PersonService {

    @EmbeddedId
    private IdPerson IdPerson;

    @Column(length = 20, nullable = false, name = "phone_number")
    private String phoneNumber;

    @Column(nullable = false, name = "city_of_living", length = 30)
    private String city;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
