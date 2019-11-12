package service;

import dao.IUserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import util.MybatisUtils;

public class UserService {
    //查找用户
    public User findByUser(String username, String password){
        //初始化资源
        SqlSession sqlSession = MybatisUtils.getSession();
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        //调用dao层查找用户
        User loginUser = userDao.findByUsernameAndPassword(username, password);
        //关闭资源
        MybatisUtils.closeSession(sqlSession);
        //返回用户数据
        return loginUser;
    }
}
