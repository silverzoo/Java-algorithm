-- 코드를 작성해주세요
SELECT MAX(G.SCORE) AS SCORE, E.EMP_NO, E.EMP_NAME, E.POSITION, E.EMAIL
FROM HR_EMPLOYEES E
LEFT JOIN
(SELECT SUM(SCORE) AS SCORE, EMP_NO FROM HR_GRADE GROUP BY EMP_NO, YEAR) G
ON E.EMP_NO = G.EMP_NO
GROUP BY E.EMP_NO
ORDER BY SCORE DESC
LIMIT 1;

-- 마지막의 두 행을 추가하지 않고 MAX로 출력하면 전체 테이블이 나온다.
-- GROUP BY EMP_NO로 각 튜플이 사번으로 그룹핑 되었으므로
-- 그 안에서 최대 SCORE를 추출해봤자 자기 자신뿐이니 전체 테이블이 출력되는 것.