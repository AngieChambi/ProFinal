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
import pe.edu.upeu.modelo.FinNivelfinanciero;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author hp
 */
@Repository("NivelFinancieroDao")
public class NivelFinancieroDaoImpl extends DataAccess<FinNivelfinanciero> implements NivelFinancieroDaoInterface{
    @Autowired
    public SessionFactory sessionFactoryx;
    
    @Override
    public List<FinNivelfinanciero> buscarNivelFinanciero(String nivelfinanciero){
        System.out.println("DAOOOOO"+nivelfinanciero);
        //return sessionFactoryx.getCurrentSession().createCriteria(ConfPeriodo.class).list();         
       //return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM ConfPeriodo a WHERE a.periodo=?").setString(0, periodo).list();
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM FinNivelfinanciero a WHERE UPPER(a.nivelfinanciero) LIKE UPPER(?)")
               .setString(0, "%"+nivelfinanciero+"%")               
               .list();

    }   
    
    
}

