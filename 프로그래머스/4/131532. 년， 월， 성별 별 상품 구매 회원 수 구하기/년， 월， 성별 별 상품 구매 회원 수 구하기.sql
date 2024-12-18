-- 코드를 입력하세요
SELECT YEAR(O.sales_date), MONTH(O.sales_date), U.gender, count(DISTINCT(user_id))
    FROM online_sale O
        JOIN user_info U
        USING(user_id)
    WHERE U.gender is not NULL
    GROUP BY MONTH(O.SALES_DATE), gender
    ORDER BY 1, 2, 3