// Repository class
package com.swe642.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import com.swe642.spring.Entries;

public interface Repository extends JpaRepository<Entries, Long>{

	boolean deleteEntry();

}
