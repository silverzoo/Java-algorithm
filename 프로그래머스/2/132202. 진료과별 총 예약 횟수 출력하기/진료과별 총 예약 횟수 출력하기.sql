-- 코드를 입력하세요
SELECT MCDP_CD AS 진료과코드, COUNT(*) 5월예약건수
FROM APPOINTMENT
WHERE SUBSTRING(APNT_YMD,1,7) = '2022-05'
GROUP BY 진료과코드
ORDER BY 5월예약건수, 진료과코드

# 예약취소한 컬럼은 고려하지 않은 문제에 오류가 있는 문제.