package hello.jdbc.repository;

import hello.jdbc.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryVOTest {

    MemberRepositoryVO repositoryVO = new MemberRepositoryVO();

    @Test
    void crud() throws SQLException {
        //given
        Member member = new Member("memberVO", 10000);
        repositoryVO.save(member);

        //when

        //then

    }

}
