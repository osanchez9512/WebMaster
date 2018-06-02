package twitter.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import twitter.entity.Pais;
import twitter.entity.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-01T08:57:29")
@StaticMetamodel(Tuit.class)
public class Tuit_ { 

    public static volatile SingularAttribute<Tuit, String> texto;
    public static volatile SingularAttribute<Tuit, Date> fecha;
    public static volatile ListAttribute<Tuit, Usuario> usuarioList;
    public static volatile SingularAttribute<Tuit, Usuario> usuario;
    public static volatile SingularAttribute<Tuit, Long> status;
    public static volatile ListAttribute<Tuit, Usuario> usuarioList1;
    public static volatile SingularAttribute<Tuit, Pais> pais;

}