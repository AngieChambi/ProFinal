/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.servicio;

import java.util.List;
import pe.edu.upeu.modelo.FinCuenta;

/**
 *
 * @author hp
 */
public interface CuentaServicioInterface {
    public List<FinCuenta> listarCuenta();
    public void saveCuenta(FinCuenta cuenta);
    public void deleteCuenta(int idcuenta);
    public void updateCuenta(FinCuenta cuenta);
    public FinCuenta buscarCuenta(int idcuenta);
    public List<FinCuenta> buscarCuenta(String cuenta);
}

