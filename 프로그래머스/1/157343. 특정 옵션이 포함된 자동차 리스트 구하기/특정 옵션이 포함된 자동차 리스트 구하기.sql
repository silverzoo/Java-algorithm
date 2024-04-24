-- 코드를 입력하세요
SELECT CAR_ID, CAR_TYPE, DAILY_FEE, OPTIONS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%네비게이션%'
ORDER BY CAR_ID DESC

-- 다른 방식 정리:

-- 1. 정규식 REGEXP

-- SELECT car_id, car_type, daily_fee, options
-- FROM car_rental_company_car
-- WHERE options REGEXP '네비게이션'
-- ORDER BY car_id DESC;

-- 2. INSTR함수 INSTR(문자열 검색위치, 검색하려는 문자열)

-- SELECT car_id, car_type, daily_fee, options
-- FROM car_rental_company_car
-- WHERE instr(options, '네비게이션')
-- ORDER BY car_id DESC;