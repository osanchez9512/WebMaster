package peliculas.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import peliculas.entity.Actor;
import peliculas.entity.Film;
import peliculas.entity.FilmActorPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-03T12:11:12")
@StaticMetamodel(FilmActor.class)
public class FilmActor_ { 

    public static volatile SingularAttribute<FilmActor, Actor> actor;
    public static volatile SingularAttribute<FilmActor, FilmActorPK> filmActorPK;
    public static volatile SingularAttribute<FilmActor, Date> lastUpdate;
    public static volatile SingularAttribute<FilmActor, Film> film;

}