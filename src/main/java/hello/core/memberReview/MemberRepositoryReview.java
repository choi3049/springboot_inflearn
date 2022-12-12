package hello.core.memberReview;

public interface MemberRepositoryReview {

    void save(MemberReview member);

    MemberReview findById(Long memberId);
}
