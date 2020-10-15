package wrx.rb.demo.service.impl;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wrx.rb.demo.bean.PagingBean;
import wrx.rb.demo.bean.SecurityUserBean;
import wrx.rb.demo.mapper.UserMapper;
import wrx.rb.demo.service.UserService;


import java.util.List;


@Service("SSUserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public SecurityUserBean selectUserByName(String name) {
        return userMapper.selectUserByName(name);
    }

    @Override
    public void addOne(SecurityUserBean user) {
        userMapper.addOne(user);
    }

    @Override
    public List<PagingBean> selectPaging() {
        return userMapper.selectPaging(new RowBounds(0, 5));
    }

}
