/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.dao.CuentaDaoInterface;
import pe.edu.upeu.modelo.FinCuenta;

/**
 *
 * @author hp
 */
@Service(value = "CuentaServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CuentaServicioImpl implements CuentaServicioInterface{
    
    @Autowired
    public CuentaDaoInterface cuentadao;
    
    
    @Override
    public List<FinCuenta> listarCuenta(){
        return cuentadao.getListAll();
    }
    
    @Override
    public void saveCuenta(FinCuenta cuenta){
        cuentadao.save(cuenta);
    }
    
    @Override
    public void deleteCuenta(int idCuenta){
       cuentadao.delete(idCuenta);
   }
    
    @Override
    public void updateCuenta(FinCuenta cuenta){
       cuentadao.update(cuenta);
   }
    @Override
    public FinCuenta buscarCuenta(int idcuenta){
       return cuentadao.getById(idcuenta);
   }
    @Override
    public List<FinCuenta> buscarCuenta(String cuenta){
       return cuentadao.buscarCuenta(cuenta);
   }

    
}

