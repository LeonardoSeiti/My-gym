package br.com.fiap.projdiamantegym.split;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SplitRepository extends JpaRepository<Split, UUID> {
}