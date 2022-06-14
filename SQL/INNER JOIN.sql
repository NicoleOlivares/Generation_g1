USE generationg1;

-- INNER JOIN
select c.customerNumber, o.orderNumber ,c.customerName 
from customers c, orders o
where c.customerNumber = o.customerNumber 
and c.customerNumber = 496
order by c.customerNumber desc;

SELECT *  -- * selecciona todas las columnas
FROM customers c -- Tabla A
INNER JOIN orders o -- Tabla B
ON c.customerNumber = o.customerNumber -- Interseccion entre las llaves?
AND c.customerNumber = 496
ORDER BY c.customerNumber DESC;
