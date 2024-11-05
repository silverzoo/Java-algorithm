-- 코드를 입력하세요
SELECT DISTINCT A.CAR_ID
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY A
JOIN CAR_RENTAL_COMPANY_CAR B
ON A.CAR_ID = B.CAR_ID
WHERE MONTH(A.START_DATE) = '10'
AND B.CAR_TYPE = '세단'
ORDER BY A.CAR_ID DESC;
