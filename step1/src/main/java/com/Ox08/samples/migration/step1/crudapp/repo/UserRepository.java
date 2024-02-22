package com.Ox08.samples.migration.step1.crudapp.repo;
import com.Ox08.samples.migration.step1.crudapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * The Spring Data's JPA repository, converted from POJO in original version
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
