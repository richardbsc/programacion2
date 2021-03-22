/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.heladeria1.servicio;

import ec.edu.itq.heladeria1.dao.BodegaDao;
import ec.edu.itq.heladeria1.modelo.Bodega;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Richard
 */
@Stateless
@LocalBean
public class BodegaServicio {

  @EJB
  private BodegaDao bodegaDao;
  
  public void guardar(Bodega bodega){
      bodegaDao.create(bodega);
  }
  public List<Bodega>buscarBodega(){
      
      List<Bodega> listaBodega = bodegaDao.buscarBodega();
      
      return listaBodega;
  }
}
