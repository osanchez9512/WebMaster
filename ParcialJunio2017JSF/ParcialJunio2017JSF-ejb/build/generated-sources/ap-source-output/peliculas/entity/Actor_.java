package peliculas.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import peliculas.entity.FilmActor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-03T12:11:12")
@StaticMetamodel(Actor.class)
public class Actor_ { 

    public static volatile SingularAttribute<Actor, String> firstName;
    public static volatile SingularAttribute<Actor, String> lastName;
    public static volatile ListAttribute<Actor, FilmActor> filmActorList;
    public static volatile SingularAttribute<Actor, Short> actorId;
    public static volatile SingularAttribute<Actor, Date> lastUpdate;

}