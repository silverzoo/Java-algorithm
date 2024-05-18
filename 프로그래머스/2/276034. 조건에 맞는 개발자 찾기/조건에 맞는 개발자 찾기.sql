-- 코드를 작성해주세요
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS
WHERE SKILL_CODE & (
    SELECT SUM(CODE)
    FROM SKILLCODES
    WHERE NAME IN ('Python', 'c#')
    )
ORDER BY ID

-- 파이썬은 2진수로 표현할때 9번째 비트의 자리수, C#은 11번째 비트의 자리수가 1이다. (나머지 자리수는 모두 0)
-- 둘 중 하나의 이상의 스킬을 가진 개발자라면 해당 자리수(9와 11번째) 자리수가 1 이므로 1 = TRUE를 반환한다.
-- WHERE절에서 !=0 이라는 조건이나 0보다 크다는 조건이 없이도 1이라면 TRUE를 반환할테므로 위처럼만 적어도 된다.