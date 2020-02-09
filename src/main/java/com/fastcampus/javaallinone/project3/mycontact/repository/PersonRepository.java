package com.fastcampus.javaallinone.project3.mycontact.repository;

import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByName(String name);

    List<Person> findByBlockIsNull();

    List<Person> findByBloodType(String bloodType);

    @Query(value = "select person from Person person where person.birthday.monthOfBirthday = ?1")
    // 위와 같은 쿼리는 JPQL이며,
    // nativeQuery = true 로 설정시 => "SELECT * FROM person WHERE month_of_birthday = :monthOfBirthday" 처럼 진짜 쿼리 가능
    // 아래 메서드의 인자 앞에 @Param("monthOfBirthday") 을 선언하면 = ?1 대신에 = :monthOfBirthday 으로 사용할 수 있음.
    List<Person> findByMonthOfBirthday(int monthOfBirthday);

    @Query(value = "SELECT * FROM person WHERE person.deleted = true", nativeQuery = true)
    List<Person> findPeopleDeleted();
}
