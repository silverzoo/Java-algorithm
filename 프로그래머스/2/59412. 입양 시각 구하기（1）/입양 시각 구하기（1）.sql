-- 코드를 입력하세요
SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) BETWEEN 9 AND 19
GROUP BY HOUR
ORDER BY HOUR

# HOUR() 함수를 쓰면된다.
# 그루핑 이후 having절에서 필터링할 수도 있지만,
# where절에서 9~19시 사이의 조건을 먼저 필터링 할 수도 있다.