package org.photographer.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "localized_text")
public class LocalizedTextEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "russian")
    private String russian;

    @Column(name = "english")
    private String english;

    @Column(name = "german")
    private String german;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }


    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }


    public String getGerman() {
        return german;
    }

    public void setGerman(String german) {
        this.german = german;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalizedTextEntity that = (LocalizedTextEntity) o;
        return id == that.id &&
                Objects.equals(russian, that.russian) &&
                Objects.equals(english, that.english) &&
                Objects.equals(german, that.german) ;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, russian, english, german);
    }

    @Override
    public String toString() {
        return "LocalizedTextEntity{" +
                "id=" + id +
                ", russian='" + russian + '\'' +
                ", english='" + english + '\'' +
                ", german='" + german + '\'' +
                '}';
    }
}
