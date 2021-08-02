package cn.aron030.service;

import cn.aron030.domain.Role;

import java.util.List;

public interface RoleService {

   public List<Role> list();

   public void save(Role role);
}
