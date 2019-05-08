package vn.shop.dao.jdbc;

import org.springframework.jdbc.core.RowMapper;
import vn.shop.dao.util.ConstantUtil;
import vn.shop.library.common.model.dao.Facture;
import vn.shop.library.common.model.dao.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FactureMapper implements RowMapper<Facture>{

    @Override
    public Facture mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Facture result = new Facture();
        try {

            result.setFactureID(resultSet.getInt(ConstantUtil.factureID));
            result.setOrderCode(resultSet.getInt(ConstantUtil.orderCode));

        }catch (Exception e) {

        }
        return result;
    }
}