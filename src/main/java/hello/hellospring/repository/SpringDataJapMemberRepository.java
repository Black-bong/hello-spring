package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJapMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    // JPQL SELECT m FROM member m WHERE m.name = ?;
    Optional<Member> findByName(String name);
}
