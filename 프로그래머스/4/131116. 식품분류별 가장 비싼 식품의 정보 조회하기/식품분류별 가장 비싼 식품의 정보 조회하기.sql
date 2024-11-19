-- 코드를 입력하세요
# CATEGORY  MAX_PRICE   PRODUCT_NAME
    #GROUP BY CATEGORY
    #HAVING CATEGORY IN ('과자', '국', '김치', '식용유')
    #ORDER BY MAX_PRICE DESC


SELECT  CATEGORY,PRICE ,    PRODUCT_NAME
    FROM FOOD_PRODUCT
    WHERE 1=1 
        AND CATEGORY IN ('과자', '국', '김치', '식용유')
        AND PRICE = ( SELECT MAX(PRICE) FROM FOOD_PRODUCT AS F WHERE F.CATEGORY = FOOD_PRODUCT.CATEGORY)
            #  서브쿼리에서 현재 카테고리와 일치하는 행만 고려해야 합니다. 
            # 그렇기 때문에 F.CATEGORY = FOOD_PRODUCT.CATEGORY를 사용하여 현재 검토 중인 카테고리에 속하는 행들만 서브쿼리에서 고려\
        ORDER BY PRICE DESC