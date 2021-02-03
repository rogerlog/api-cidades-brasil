package com.github.rogerlog.states.repositories;

import com.github.rogerlog.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
