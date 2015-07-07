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
import pe.edu.upeu.modelo.FinCuenta;
import syscenterlife.dmp.core.data.DataAccess;

/**
 *
 * @author hp
 */
@Repository("CuentaDao")
public class CuentaDaoImpl extends DataAccess<FinCuenta> implements CuentaDaoInterface{
    @Autowired
    public SessionFactory sessionFactoryx;
    
    @Override
    public List<FinCuenta> buscarCuenta(String cuenta){
        System.out.println("DAOOOOO"+cuenta);
        //return sessionFactoryx.getCurrentSession().createCriteria(ConfPeriodo.class).list();         
       //return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM ConfPeriodo a WHERE a.periodo=?").setString(0, periodo).list();
       return sessionFactoryx.getCurrentSession().createQuery("SELECT a FROM FinCuenta a WHERE UPPER(a.cuenta) LIKE UPPER(?)")
               .setString(0, "%"+cuenta+"%")               
               .list();

    }   
    
    
}

