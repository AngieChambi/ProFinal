/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.FinNivelfinanciero;

/**
 *
 * @author hp
 */
public interface NivelFinancieroServicioInterface {
    public List<FinNivelfinanciero> listarNivelFinanciero();
    public void saveNivelFinanciero(FinNivelfinanciero nivelfinanciero);
    public void deleteNivelFinanciero(int idnivelfinanciero);
    public void updateNivelFinanciero(FinNivelfinanciero nivelfinanciero);
    public FinNivelfinanciero buscarNivelFinanciero(int idnivelfinanciero);
    public List<FinNivelfinanciero> buscarNivelFinanciero(String nivelfinanciero);
}


