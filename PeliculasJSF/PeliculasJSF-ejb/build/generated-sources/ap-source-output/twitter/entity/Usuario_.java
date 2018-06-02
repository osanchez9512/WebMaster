package twitter.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import twitter.entity.Pais;
import twitter.entity.Tuit;
import twitter.entity.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-01T08:57:29")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> descripcion;
    public static volatile SingularAttribute<Usuario, Date> fecha;
    public static volatile ListAttribute<Usuario, Usuario> usuarioList;
    public static volatile ListAttribute<Usuario, Tuit> tuitList2;
    public static volatile ListAttribute<Usuario, Tuit> tuitList1;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, String> url;
    public static volatile SingularAttribute<Usuario, Long> idusuario;
    public static volatile ListAttribute<Usuario, Usuario> usuarioList1;
    public static volatile ListAttribute<Usuario, Tuit> tuitList;
    public static volatile SingularAttribute<Usuario, Pais> pais;

}