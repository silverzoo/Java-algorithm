-- 코드를 작성해주세요
SELECT COUNT(*) AS FISH_COUNT
FROM FISH_INFO
JOIN FISH_NAME_INFO USING(FISH_TYPE)
WHERE FISH_NAME = 'BASS' OR FISH_NAME = 'SNAPPER'