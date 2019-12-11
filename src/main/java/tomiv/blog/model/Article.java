package tomiv.blog.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "articles")
@Data
@NoArgsConstructor
public class Article {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String slug;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String body;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    @Column
    private boolean favoritesCount;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "article_tags",
            joinColumns = { @JoinColumn(name = "article_id") },
            inverseJoinColumns = { @JoinColumn(name = "tag_id") }
    )
    private Set<Tag> tags;

}
