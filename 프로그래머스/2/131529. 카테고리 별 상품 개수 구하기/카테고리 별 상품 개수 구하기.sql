-- 코드를 입력하세요
SELECT LEFT(PRODUCT_CODE, 2) AS CATEGORY, COUNT(*) AS PRODUCTS
FROM PRODUCT
GROUP BY CATEGORY

# select절에서 사용된 별칭으로 GROUP BY CATEGORY 할때와,
# GROUP BY PRODUCT_CODE 할때 결과가 다르다.
# 즉, 별칭이 아닌 원래의 컬럼명으로 그룹화하면 카데고리별로 묶인 개수가 나오지 않는다.(틀린답)