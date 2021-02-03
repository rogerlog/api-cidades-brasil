package com.github.rogerlog.staties.repositories;

import com.github.rogerlog.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
