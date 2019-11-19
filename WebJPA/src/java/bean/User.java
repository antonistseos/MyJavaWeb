package bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="user")
public class User implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
