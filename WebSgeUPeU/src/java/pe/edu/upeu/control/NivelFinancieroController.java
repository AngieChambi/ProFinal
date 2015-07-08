/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.control;

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
import pe.edu.upeu.modelo.FinNivelfinanciero;
import pe.edu.upeu.servicio.NivelFinancieroServicioInterface;

/**
 *
 * @author hp
 */
@Controller
public class NivelFinancieroController {

@Autowired
NivelFinancieroServicioInterface nivelfinancieroServicio;

@Autowired
TemporadaServicioInterface temporadaServicio;
   
@RequestMapping(value = "nivelfinanciero", method = RequestMethod.GET)   
public ModelAndView inicioNivelFinanciero(){
    List<FinNivelfinanciero> lista=nivelfinancieroServicio.listarNivelFinanciero();
    
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaNivelFinanciero", lista);
    modelo.put("saludo", "Hola amigos");
    System.out.println("Holassssssssss");
    
    return new ModelAndView("modulo/config/nivelfinanciero/mainNivelFinanciero", modelo);
}

@RequestMapping(value = "eliminarnf", method = RequestMethod.GET)
public  ModelAndView eliminarNivelFinanciero(HttpServletRequest r) {
    int idnivelfinanciero=Integer.parseInt(r.getParameter("idnivelfinancierox"));
    nivelfinancieroServicio.deleteNivelFinanciero(idnivelfinanciero);
    System.out.println("si llego al metodo");
    
    return new ModelAndView(new RedirectView("nivelfinanciero.upeu"));
}


@RequestMapping(value = "formNivelFinanciero", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloNivelFinanciero")FinNivelfinanciero nivelfinanciero,BindingResult result ){
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("listaTemporada", "Holasssssssssss");
    modelo.put("listaTemporadaX", temporadaServicio.listarTemporada());
    modelo.put("listaTemporada2", "");
    modelo.put("listaTemporada3", "");
    System.out.println("Veeeeer"+temporadaServicio.listarTemporada().size());
    return new ModelAndView("modulo/config/nivelfinanciero/formNivelFinanciero",modelo);
}


@RequestMapping(value = "guardarNivelFinanciero", method = RequestMethod.POST)
public ModelAndView guardarNivelFinancieroXX(@ModelAttribute("modeloNivelFinanciero") FinNivelfinanciero nivelfinanciero,
                                      BindingResult result ){
    System.out.println("holass:"+nivelfinanciero.getIdDepartArea());
        nivelfinanciero.setNombre("");
        nivelfinanciero.setCodigo("");
        nivelfinancieroServicio.saveNivelFinanciero(nivelfinanciero);
    return new ModelAndView(new RedirectView("nivelfinanciero.upeu"));
}

@RequestMapping(value = "modificarNivelFinanciero", method = RequestMethod.GET)
public ModelAndView modificarNivelFinanciero(HttpServletRequest r ){
   int idNivelFinanciero=Integer.parseInt(r.getParameter("idNivelFinanciero"));
       FinNivelfinanciero nivelfinanciero=null;
       nivelfinanciero=nivelfinancieroServicio.buscarNivelFinanciero(idNivelFinanciero);
    return new ModelAndView("modulo/config/nivelfinanciero/formUNivelFinanciero","ModeloNivelFinanciero",nivelfinanciero);
}

@RequestMapping(value = "modificarNivelFinancieroX", method = RequestMethod.GET)
public String modificarNivelFinancieroX(HttpServletRequest r, Model model ){
   int idNivelFinanciero=Integer.parseInt(r.getParameter("idNivelFinanciero"));
       FinNivelfinanciero nivelfinanciero=null;
       nivelfinanciero=nivelfinancieroServicio.buscarNivelFinanciero(idNivelFinanciero);
       model.addAttribute("ModeloNivelFinanciero", nivelfinanciero);
       model.addAttribute("listaTemporadaX", temporadaServicio.listarTemporada());
    return "modulo/config/nivelfinanciero/formUNivelFinanciero";
}
  
@RequestMapping(value = "actualizarNivelFinanciero", method = RequestMethod.POST)
public ModelAndView actualizarNivelFinancieroXX(@ModelAttribute("ModeloNivelFinanciero") FinNivelfinanciero nivelfinanciero,
                                      BindingResult result ){
    System.out.println("holass:"+nivelfinanciero.getIdDepartArea());
       // periodo.setFechaInicio(new Date());
       // periodo.setFechaFin(new Date());
        nivelfinancieroServicio.updateNivelFinanciero(nivelfinanciero);
    return new ModelAndView(new RedirectView("nivelfinanciero.upeu"));
}


@RequestMapping(value = "buscarNivelFinancierox", method = RequestMethod.POST)
public  ModelAndView buscarNivelFinanciero(HttpServletRequest r) {
    String nivelfinanciero=r.getParameter("nivelfinanciero")==null ? "":r.getParameter("nivelfinanciero");
    List<FinNivelfinanciero> lista=nivelfinancieroServicio.buscarNivelFinanciero(nivelfinanciero);
    System.out.println(nivelfinanciero+"Holasssssssssssssss:"+lista.size());
    Map<String, Object> modelo=new HashMap<String, Object> ();
    modelo.put("ListaNivelFinanciero", lista);
    
   return new ModelAndView("modulo/config/nivelfinanciero/mainNivelFinanciero",modelo);
}


}
