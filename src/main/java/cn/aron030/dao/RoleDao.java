package cn.aron030.dao;

import cn.aron030.domain.Role;

import java.util.List;

public interface RoleDao {
  public List<Role> findAll();

  public void save(Role role);
  List<Role> findRoleByUserId(Long id);
}
