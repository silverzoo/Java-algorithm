WITH RANK_CTE AS (
    SELECT MEMBER_ID, 
        MEMBER_NAME, COUNT(*), 
        rank() OVER (ORDER BY COUNT(*) DESC) AS RANKING
    FROM MEMBER_PROFILE
    JOIN REST_REVIEW USING(MEMBER_ID)
    GROUP BY MEMBER_ID
)

SELECT MEMBER_NAME, REVIEW_TEXT, DATE_FORMAT(REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM REST_REVIEW
JOIN RANK_CTE
USING(MEMBER_ID)
WHERE RANKING = 1
ORDER BY REVIEW_DATE, REVIEW_TEXT

