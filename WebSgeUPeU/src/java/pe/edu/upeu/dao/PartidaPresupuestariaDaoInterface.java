/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.modelo.FinPartidapresupuestaria;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author hp
 */
public interface PartidaPresupuestariaDaoInterface extends IDataAccess<FinPartidapresupuestaria>{
    public List<FinPartidapresupuestaria> buscarPartidaPresupuestaria(String partidapresupuestaria);
}

