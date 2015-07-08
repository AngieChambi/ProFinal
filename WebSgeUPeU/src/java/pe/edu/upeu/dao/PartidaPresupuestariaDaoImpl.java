/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.modelo.FinPartidapresupuestaria;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author hp
 */
@Repository("PartidaPresupuestariaDao")
public class PartidaPresupuestariaDaoImpl extends DataAccess<FinPartidapresupuestaria> implements PartidaPresupuestariaDaoInterface{
    @Autowired
    public SessionFactory sessionFactoryx;
    
    @Override
    public List<FinPartidapresupuestaria> buscarPartidaPresupuestaria(String partidapresupuestaria){
        System.out.println("DAOOOOO"+partidapresupuestaria);
        //return sessionFactoryx.getCurrentSession().createCriteria(ConfPeriodo.class).list();         
       //return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM ConfPeriodo a WHERE a.periodo=?").setString(0, periodo).list();
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM FinPartidapresupuestaria a WHERE UPPER(a.partidapresupuestaria) LIKE UPPER(?)")
               .setString(0, "%"+partidapresupuestaria+"%")               
               .list();

    }   
    
    
}
