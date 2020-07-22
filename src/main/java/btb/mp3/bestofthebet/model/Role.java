package btb.mp3.bestofthebet.model;

/*import lombok.Data;*/

import javax.persistence.*;

/*@Data*/
@Entity
@Table (name = "role")
public class Role {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name="name", nullable = false, length = 20)
    private EnumRole name;

    public Role() {}

    public Role(EnumRole name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumRole getName() {
        return name;
    }

    public void setName(EnumRole name) {
        this.name = name;
    }
}
