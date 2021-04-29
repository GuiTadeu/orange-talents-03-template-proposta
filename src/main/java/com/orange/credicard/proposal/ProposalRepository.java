package com.orange.credicard.proposal;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProposalRepository extends JpaRepository<Proposal, Long> {

    Optional<Proposal> findByDocument(String document);
    List<Proposal> findByStatus(ProposalStatus status);
}
