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
import pe.edu.upeu.dao.PartidaPresupuestariaDaoInterface;
import pe.edu.upeu.modelo.FinPartidapresupuestaria;

/**
 *
 * @author hp
 */
@Service(value = "PartidaPresupuestariaServicio")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PartidaPresupuestariaServicioImpl implements PartidaPresupuestariaServicioInterface{
    
    @Autowired
    public PartidaPresupuestariaDaoInterface partidapresupuestariadao;
    
    
    @Override
    public List<FinPartidapresupuestaria> listarPartidaPresupuestaria(){
        return partidapresupuestariadao.getListAll();
    }
    
    @Override
    public void savePartidaPresupuestaria(FinPartidapresupuestaria partidapresupuestaria){
        partidapresupuestariadao.save(partidapresupuestaria);
    }
    
    @Override
    public void deletePartidaPresupuestaria(int idPartidaPresupuestaria){
       partidapresupuestariadao.delete(idPartidaPresupuestaria);
   }
    
    @Override
    public void updatePartidaPresupuestaria(FinPartidapresupuestaria partidapresupuestaria){
       partidapresupuestariadao.update(partidapresupuestaria);
   }
    @Override
    public FinPartidapresupuestaria buscarPartidaPresupuestaria(int idpartidapresupuestaria){
       return partidapresupuestariadao.getById(idpartidapresupuestaria);
   }
    @Override
    public List<FinPartidapresupuestaria> buscarPartidaPresupuestaria(String partidapresupuestaria){
       return partidapresupuestariadao.buscarPartidaPresupuestaria(partidapresupuestaria);
   }

    
}

