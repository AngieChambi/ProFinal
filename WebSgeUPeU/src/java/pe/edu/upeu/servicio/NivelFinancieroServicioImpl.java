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
import pe.edu.upeu.dao.NivelFinancieroDaoInterface;
import pe.edu.upeu.modelo.FinNivelfinanciero;

/**
 *
 * @author hp
 */
@Service(value = "NivelFinancieroServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class NivelFinancieroServicioImpl implements NivelFinancieroServicioInterface{
    
    @Autowired
    public NivelFinancieroDaoInterface nivelfinancierodao;
    
    
    @Override
    public List<FinNivelfinanciero> listarNivelFinanciero(){
        return nivelfinancierodao.getListAll();
    }
    
    @Override
    public void saveNivelFinanciero(FinNivelfinanciero nivelfinanciero){
        nivelfinancierodao.save(nivelfinanciero);
    }
    
    @Override
    public void deleteNivelFinanciero(int idNivelFinanciero){
       nivelfinancierodao.delete(idNivelFinanciero);
   }
    
    @Override
    public void updateNivelFinanciero(FinNivelfinanciero nivelfinanciero){
       nivelfinancierodao.update(nivelfinanciero);
   }
    @Override
    public FinNivelfinanciero buscarNivelFinanciero(int idnivelfinanciero){
       return nivelfinancierodao.getById(idnivelfinanciero);
   }
    @Override
    public List<FinNivelfinanciero> buscarNivelFinanciero(String nivelfinanciero){
       return nivelfinancierodao.buscarNivelFinanciero(nivelfinanciero);
   }

    
}

