package vn.shop.dao.impl;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import vn.shop.dao.UserDao;
import vn.shop.dao.jdbc.UserMapper;
import vn.shop.dao.service.UserSevice;
import vn.shop.library.common.model.dao.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lttung on 12/12/2018.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertUser(User user) {
        logger.info("Begin insert user");
        String sql = "INSERT INTO user(userName, password, clientID_FK) value(?, ?, ?)";
        try {

            return jdbcTemplate.update(sql, new Object[]{user.getUserName(), user.getPassword(), user.getClientID_FK()});

        } catch (Exception e) {
            logger.info(e.getMessage(), e);
        }

        logger.info("End insert, result: Success");
        return 0;
    }

    @Override
    public List<User> getUser(String userName, String password) {

        logger.info("Begin get list user");

        String sql = "SELECT * FROM user WHERE userName = ? AND password = ?";

        List<User> ret = new ArrayList<>();
        try {

            ret =  jdbcTemplate.query(sql, new Object[]{userName, password}, new UserMapper());

        } catch (Exception e) {
            logger.info(e.getMessage(), e);
        }

        int result = (ret == null ? 0 : ret.size());
        logger.info("End get list user, result: Success" + result);
        return ret;
    }

    @Override
    public List<User> getAllUser() {

        logger.info("Begin get all user");

        String sql = "SELECT * FROM user";

        List<User> ret = new ArrayList<>();

        try {
            ret = jdbcTemplate.query(sql, new Object[]{}, new UserMapper());
        }catch (Exception e) {
            logger.info(e.getMessage(), e);
        }

        logger.info("END get all user, result: SUCCESS" + ret);

        return ret;
    }

    @Override
    public List<User> getUserByUserName(String userName) {
        logger.info("Begin getUser by user by user's name");

        String sql = "SELECT * FROM user where userName = ?";

        List<User> ret = new ArrayList<>();

        try {

            ret = jdbcTemplate.query(sql, new Object[]{userName}, new UserMapper());
        } catch (Exception e) {
            logger.info(e.getMessage(), e);
        }

        int result = (ret == null ? 0 : ret.size());
        logger.info("End getUser by user by user's name, result: "+result);
        return ret;
    }

    @Override
    public int updateUser(User user) {
        logger.info("Begin updateUserMappingSSO");

        String sql = "UPDATE user SET userName = ?, password = ?, clientID_FK = ? WHERE userID = ?";

        try {

            return jdbcTemplate.update(sql, new Object[]{user.getUserName(), user.getPassword(), user.getClientID_FK(), user.getUserID()});
        } catch (Exception e) {
            logger.info(e.getMessage(), e);
        }

        logger.info("End updateUserMappingSSO, FAIL");
        return 0;
    }
}
