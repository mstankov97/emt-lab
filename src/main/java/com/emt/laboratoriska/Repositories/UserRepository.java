package com.emt.laboratoriska.Repositories;

import com.emt.laboratoriska.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {


}
