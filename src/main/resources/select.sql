select numberId+1 as 'startNumber', theEnd-numberId-1 as 'countOf'
from
(select numberId,(select numberId from testdb.test_table t2 where t2.numberId>t1.numberId order by numberId limit 1) theEnd
from testdb.test_table t1)t;