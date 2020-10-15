package wrx.rb.demo.service;


import wrx.rb.demo.bean.PagingBean;
import wrx.rb.demo.bean.SecurityUserBean;

import java.util.List;

public interface UserService {

    SecurityUserBean selectUserByName(String name);

    void addOne(SecurityUserBean user);

    List<PagingBean> selectPaging();

}
