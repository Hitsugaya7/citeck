CREATE DEFINER=`root`@`localhost` PROCEDURE `mydata`()
BEGIN
    DECLARE i int DEFAULT 0;
    WHILE i <= 100 DO
        INSERT IGNORE INTO testdb.test_table SET numberId = FLOOR(1000*RAND());
        SET i = i + 1;
    END WHILE;
END