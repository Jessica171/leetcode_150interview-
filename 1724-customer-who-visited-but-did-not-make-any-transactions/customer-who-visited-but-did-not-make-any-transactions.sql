# Write your MySQL query statement below
With notransaction as(Select customer_id From Visits 
left join Transactions on 
Visits.visit_id = Transactions.visit_id
Where transaction_id is null)

Select customer_id,count(*) As count_no_trans
from notransaction
Group by customer_id ;