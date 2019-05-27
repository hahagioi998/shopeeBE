package vn.shop.dao.jdbc;


import org.springframework.jdbc.core.RowMapper;
import vn.shop.dao.util.ConstantUtil;
import vn.shop.library.common.model.dao.User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lttung on 12/12/2018.
 */
public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        User result = new User();
        try {

//            result.setUserID(resultSet.getInt(ConstantUtil.USER_ID));
            result.setUserName(resultSet.getString(ConstantUtil.USER_NAME));
            result.setPhoneNumber(resultSet.getString(ConstantUtil.phoneNumber));
            result.setUserEmail(resultSet.getString(ConstantUtil.userEmail));
            result.setPassword(resultSet.getString(ConstantUtil.PASSWORD));
            result.setProfile(resultSet.getString(ConstantUtil.profile));
            result.setStreet(resultSet.getString(ConstantUtil.street));
            result.setSuburb(resultSet.getString(ConstantUtil.suburb));
            result.setCity(resultSet.getString(ConstantUtil.city));
            result.setPostcode(resultSet.getString(ConstantUtil.postcode));

        }catch (Exception e) {

        }
        return result;
    }

}
