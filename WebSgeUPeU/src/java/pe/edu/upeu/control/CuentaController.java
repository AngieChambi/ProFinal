/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.control;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pe.edu.upeu.modelo.FinCuenta;
import pe.edu.upeu.servicio.CuentaServicioInterface;

/**
 *
 * @author hp
 */
@Controller
public class CuentaController {

@Autowired
CuentaServicioInterface cuentaServicio;
   
@RequestMapping(value = "cuenta", method = RequestMethod.GET)   
public ModelAndView inicioCuenta(){
    List<FinCuenta> lista=cuentaServicio.listarCuenta();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaCuenta", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/cuenta/mainCuenta", modelo);
}

@RequestMapping(value = "eliminarcuen", method = RequestMethod.GET)
public  ModelAndView eliminarCuenta(HttpServletRequest r) {
    int idcuenta=Integer.parseInt(r.getParameter("idcuentax"));
    cuentaServicio.deleteCuenta(idcuenta);
    System.out.println("si llego al metodo");
    
    return new ModelAndView(new RedirectView("cuenta.upeu"));
}


@RequestMapping(value = "formCuenta", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloCuenta") FinCuenta cuenta,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    return new ModelAndView("modulo/config/periodo/formPeriodo",modelo);
}


@RequestMapping(value = "guardarCuenta", method = RequestMethod.POST)
public ModelAndView guardarCuentaXX(@ModelAttribute("modeloCuenta") FinCuenta cuenta,
                                      BindingResult result ){
    System.out.println("holass:"+cuenta.getCondicion());
        cuenta.getCuentacodigo();
        cuenta.getDivisioncodigo();
        cuentaServicio.saveCuenta(cuenta);
    return new ModelAndView(new RedirectView("cuenta.upeu"));
}

@RequestMapping(value = "modificarCuenta", method = RequestMethod.GET)
public ModelAndView modificarCuenta(HttpServletRequest r ){
   int idCuenta=Integer.parseInt(r.getParameter("idCuenta"));
       FinCuenta cuenta=null;
       cuenta=cuentaServicio.buscarCuenta(idCuenta);
    return new ModelAndView("modulo/config/cuenta/formUCuenta","ModeloCuenta",cuenta);
}

@RequestMapping(value = "modificarCuentaX", method = RequestMethod.GET)
public String modificarCuentaX(HttpServletRequest r, Model model ){
   int idCuenta=Integer.parseInt(r.getParameter("idCuenta"));
       FinCuenta cuenta=null;
       cuenta=cuentaServicio.buscarCuenta(idCuenta);
       model.addAttribute("ModeloCuenta", cuenta);
    return "modulo/config/cuenta/formUCuenta";
}
  
@RequestMapping(value = "actualizarCuenta", method = RequestMethod.POST)
public ModelAndView actualizarCuentaXX(@ModelAttribute("ModeloCuenta") FinCuenta cuenta,
                                      BindingResult result ){
    System.out.println("holass:"+cuenta.getCondicion());
       // periodo.setFechaInicio(new Date());
       // periodo.setFechaFin(new Date());
        cuentaServicio.updateCuenta(cuenta);
    return new ModelAndView(new RedirectView("cuenta.upeu"));
}


@RequestMapping(value = "buscarCuentax", method = RequestMethod.POST)
public  ModelAndView buscarCuenta(HttpServletRequest r) {
    String cuenta=r.getParameter("cuenta")==null ? "":r.getParameter("cuenta");
    List<FinCuenta> lista=cuentaServicio.buscarCuenta(cuenta);
    System.out.println(cuenta+"Holasssssssssssssss:"+lista.size());
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaCuenta", lista);
    
   return new ModelAndView("modulo/config/Cuenta/mainCuenta",modelo);
}


}
