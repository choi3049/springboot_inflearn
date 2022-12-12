package hello.core.memberReview;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepositoryReview implements MemberRepositoryReview {

    private static Map<Long, MemberReview> store = new HashMap<>();

    @Override
    public void save(MemberReview member) {
        store.put(member.getId(), member);
    }

    @Override
    public MemberReview findById(Long memberId) {
        return store.get(memberId);
    }
}
