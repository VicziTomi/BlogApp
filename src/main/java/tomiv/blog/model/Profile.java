package tomiv.blog.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "profiles")
@Data
@NoArgsConstructor
public class Profile {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, unique = true)
    private String nickname;

    @Column
    private String bio;

    @Column
    private String image;

    @OneToOne(mappedBy = "profile")
    private User user;

    @OneToMany(mappedBy = "profile")
    private Set<Article> articles;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "followers",
            joinColumns = { @JoinColumn(name = "profile_id") },
            inverseJoinColumns = { @JoinColumn(name = "follower_id") }
    )
    private Set<Profile> followers;

    @ManyToMany(mappedBy = "followers")
    private Set<Profile> followings;

}
