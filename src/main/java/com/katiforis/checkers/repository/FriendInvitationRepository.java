package com.katiforis.checkers.repository;

import com.katiforis.checkers.model.FriendInvitation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendInvitationRepository extends CrudRepository<FriendInvitation, Long> {
    FriendInvitation save(FriendInvitation friendInvitation);
}