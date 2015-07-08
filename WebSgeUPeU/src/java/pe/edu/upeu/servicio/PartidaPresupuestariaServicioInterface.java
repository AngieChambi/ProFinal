/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.FinPartidapresupuestaria;

/**
 *
 * @author hp
 */
public interface PartidaPresupuestariaServicioInterface {
    
    public List<FinPartidapresupuestaria> listarPartidaPresupuestaria();
    public void savePartidaPresupuestaria(FinPartidapresupuestaria partidapresupuestaria);
    public void deletePartidaPresupuestaria(int idpartidapresupuestaria);
    public void updatePartidaPresupuestaria(FinPartidapresupuestaria partidapresupuestaria);
    public FinPartidapresupuestaria buscarPartidaPresupuestaria(int idpartidapresupuestaria);
    public List<FinPartidapresupuestaria> buscarPartidaPresupuestaria(String partidapresupuestaria);
    
}
