package vn.shop.dao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.shop.dao.FactureDao;
import vn.shop.dao.service.FactureService;
import vn.shop.library.common.model.dao.Facture;

import java.util.List;

@Service("factureService")
public class FactureServiceImpl implements FactureService{

    @Autowired
    private FactureDao factureDao;

    @Override
    public List<Facture> getAllFacture() {
        return factureDao.getAllFacture();
    }

    @Override
    public List<Facture> getFacture(int factureID) {
        return factureDao.getFacture(factureID);
    }
    @Override
    public List<Facture> getFactureByOrderID(int orderID) {
        return factureDao.getFactureByOrderID(orderID);
    }
    @Override
    public int insertFacture(Facture facture) {
        return factureDao.insertFacture(facture);
    }
}
