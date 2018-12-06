package com.wsh.security.repository;

import com.wsh.security.bean.SecurityRole;
import com.wsh.security.bean.SecurityUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: yuexin
 * @Date: 2018/11/22 0022 20:48
 */
@Repository
public interface RoleRepository extends JpaRepository<SecurityRole,String> {

    @Query(value = "select r.* from security_role r where r.id = ?1 ", nativeQuery = true)
    SecurityRole findByRoleId(@Param("roleId")String roleID);

}

