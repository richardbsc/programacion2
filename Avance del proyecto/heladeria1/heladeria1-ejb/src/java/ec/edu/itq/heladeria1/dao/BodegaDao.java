/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.heladeria1.dao;

import ec.edu.itq.heladeria1.generico.GenericoDao;
import ec.edu.itq.heladeria1.modelo.Bodega;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Richard
 */
@Stateless
public class BodegaDao extends GenericoDao<Bodega> {
    @PersistenceContext(unitName = "heladeria1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BodegaDao() {
        super(Bodega.class);
    }
    
}
