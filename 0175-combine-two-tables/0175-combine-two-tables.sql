# Write your MySQL query statement below
# 사용자 테이블에서 각 사용자의 이름, 성, 도시 및 상태를 보고하는 솔루션을 작성합니다. 주소 테이블에 personId의 주소가 없는 경우 대신 null을 보고합니다. 결과표를 순서에 상관없이 반환합니다. 결과 형식은 다음 예에 있습니다.
select p.firstName, p.lastName, a.city, a.state
from Person p left join Address a on p.personId = a.personId;
