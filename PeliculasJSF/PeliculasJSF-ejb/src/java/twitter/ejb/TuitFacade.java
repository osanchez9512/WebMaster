/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import twitter.entity.Tuit;
import twitter.entity.Usuario;

/**
 *
 * @author fgall
 */
@Stateless
public class TuitFacade extends AbstractFacade<Tuit> {

    @PersistenceContext(unitName = "PeliculasJSF-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TuitFacade() {
        super(Tuit.class);
    }
    
    public List<Tuit> TweetLine(Usuario u){
        List <Tuit> tweetLine = null;
        Query q = em.createQuery("select t from Tuit t where t.usuario in :listaU or t.usuario= :u order by t.fecha desc" );
        try{
        q.setParameter("listaU", u.getUsuarioList1());
        q.setParameter("u", u );
        tweetLine = q.getResultList();
        }catch(Exception e){
            
        }
        
        return tweetLine;
    }
}
