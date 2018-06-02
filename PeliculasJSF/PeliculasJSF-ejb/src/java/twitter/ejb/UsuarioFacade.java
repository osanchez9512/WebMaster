/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import twitter.entity.Usuario;

/**
 *
 * @author fgall
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "PeliculasJSF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Usuario BuscaUsuarioInicial(){
        Usuario u=null;
        Query q = em.createNamedQuery("Usuario.findByNombre", Usuario.class);
        try{
            q.setParameter("nombre", "InformaticaUMA");
            u=(Usuario) q.getSingleResult();
        }catch(Exception e){
            
        }
        return u;   
    }
}
