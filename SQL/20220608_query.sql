use generationg1;

SELECT * FROM customers c;

SELECT 
* FROM customers c
WHERE c.customerName LIKE '%toy%';

SELECT c.customerNumber , c.customerName
from customers c
WHERE c.customerName LIKE '%toy%'; 

SELECT c.customerNumber, c.customerName, c.city
FROM customers c
WHERE c.city = 'Madrid';

-- obteniendo todos los registros de ambas tablas
SELECT * 
FROM customers c, orders o
ORDER BY c.customerNumber DESC;

SELECT * 
FROM customers c, orders o
WHERE c.customerNumber = o.customerNumber
ORDER BY c.customerNumber DESC;

-- PK obtener todas las ordenes por cliente
SELECT c.customerNumber, o.orderNumber, c.customerName
FROM customers c, orders o
WHERE c.customerNumber = o.customerNumber
AND c.customerNumber = 496
ORDER BY c.customerNumber DESC;

