package com.QuestAPP.demo.repositories;

import com.QuestAPP.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long > {


    Optional<User> findUserByUsername(String username); //BU userclass ında username ile database den gerekli userı eker içeirğini yazmamaıza gerek yokk


}
