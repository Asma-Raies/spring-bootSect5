package com.asma.makeUp.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.asma.makeUp.entities.MakeUp;
public interface MakeUpRepository  extends JpaRepository<MakeUp, Long> {

}
