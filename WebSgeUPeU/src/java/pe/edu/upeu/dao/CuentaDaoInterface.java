/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.modelo.FinCuenta;
import syscenterlife.dmp.core.data.IDataAccess;

/**
 *
 * @author hp
 */
public interface CuentaDaoInterface extends IDataAccess<FinCuenta>{
    public List<FinCuenta> buscarCuenta(String cuenta);
}
