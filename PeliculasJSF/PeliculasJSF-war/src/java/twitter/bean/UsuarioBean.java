/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import twitter.ejb.TuitFacade;
import twitter.entity.*;
import twitter.ejb.UsuarioFacade;


@Named(value = "usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {    
    @EJB
    private TuitFacade tuitFacade;

    @EJB
    private UsuarioFacade usuarioFacade;
    private Usuario usuario;
    private List <Tuit> tweetLine;
    

    public List<Tuit> getTweetLine() {
        return tweetLine;
    }

    public void setTweetLine(List<Tuit> tweetLine) {
        this.tweetLine = tweetLine;
    }
    
    
    

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
        
    }
    @PostConstruct
    public void init (){
        usuario=usuarioFacade.BuscaUsuarioInicial();
        tweetLine = tuitFacade.TweetLine(usuario);
    }

    public String MostrarDatosDelUsuario(){
        return "DatosDelUsuario";
    }
    
    public void DarRT(Tuit t){
        
        if(usuario.getTuitList1().contains(t)){
             t.getUsuarioList().remove(usuario);
            this.tuitFacade.edit(t);            
            usuario.getTuitList1().remove(t);
            this.usuarioFacade.edit(usuario);
        }
        else{
            t.getUsuarioList().add(usuario);
            this.tuitFacade.edit(t);
            usuario.getTuitList1().add(t);
            this.usuarioFacade.edit(usuario);
        }
        
        
    }
    
    public void DarMG(Tuit t){
         if(usuario.getTuitList2().contains(t)) {
            t.getUsuarioList1().remove(usuario);
            this.tuitFacade.edit(t);            
            usuario.getTuitList2().remove(t);
            this.usuarioFacade.edit(usuario);
        } else {            
            t.getUsuarioList1().add(usuario);
            this.tuitFacade.edit(t);                    
            usuario.getTuitList2().add(t);
            this.usuarioFacade.edit(usuario);
        }

    }
    
}
