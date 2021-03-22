/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.heladeria1.dao;

import ec.edu.itq.heladeria1.generico.GenericoDao;
import ec.edu.itq.heladeria1.modelo.Bodega;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Richard
 */
@Stateless
public class BodegaDao extends GenericoDao<Bodega> {

    public BodegaDao() {
        super(Bodega.class);
    }

    public List<Bodega>buscarBodega(){
      Query query = getEntityManager().createQuery("SELECT b FROM Cliente b");
        
      List<Bodega> listaBodega = query.getResultList();
      
      return listaBodega;
    }
    
}
