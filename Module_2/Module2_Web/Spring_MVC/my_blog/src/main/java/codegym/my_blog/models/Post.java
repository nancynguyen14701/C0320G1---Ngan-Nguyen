package codegym.my_blog.models;

import javax.persistence.*;
import java.sql.Date;
import java.time.Instant;


@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private Date createOn;
    @Column
    private Boolean status=true;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Column
    private String user_name;

    public Post() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
