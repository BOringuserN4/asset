package com.wsh.security.repository;

import com.wsh.security.bean.SecurityUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述：这个类类似与Dao层
 * @author: yuexin
 * @Date: 2018/11/22 0022 20:39
 */
@Repository
public interface UserRoleRepository extends JpaRepository<SecurityUserRole,Integer[]> {

    @Query(value = "select r.* from security_user_role r where r.userid = ?1 ", nativeQuery = true)
    List<SecurityUserRole> findByUserId(@Param("userId")Integer[] userID);

}
