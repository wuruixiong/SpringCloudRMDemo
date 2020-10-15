package wrx.rb.demo.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import wrx.rb.demo.bean.PagingBean;
import wrx.rb.demo.bean.SecurityUserBean;

import java.util.List;

@Mapper
public interface UserMapper {


    @Select("select * from security_user where username = #{username}")
    SecurityUserBean selectUserByName(String username);

    @Insert("insert security_user (username, password, role) values(#{username}, #{password}, #{role})")
    void addOne(SecurityUserBean user);

    // 传入RowBounds进行分页
    @Select("select * from paging_test")
    List<PagingBean> selectPaging(RowBounds rowBounds);


}

