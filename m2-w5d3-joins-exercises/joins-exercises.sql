-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT f.title
FROM film f
JOIN film_actor fa ON f.film_id = fa.film_id
JOIN actor a ON fa.actor_id = a.actor_id
WHERE a.first_name = 'NICK' AND a.last_name = 'STALLONE'
-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
SELECT f.title
FROM film f
JOIN film_actor fa ON f.film_id = fa.film_id
JOIN actor a ON fa.actor_id = a.actor_id
WHERE a.first_name = 'RITA' AND a.last_name = 'REYNOLDS'
-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
SELECT f.title
FROM film f
JOIN film_actor fa ON f.film_id = fa.film_id
JOIN actor a ON fa.actor_id = a.actor_id
WHERE a.first_name IN ('JUDY', 'RIVER') AND a.last_name = 'DEAN'
-- 4. All of the the ‘Documentary’ films
-- (68 rows)
SELECT title
FROM film f
JOIN film_category c ON f.film_id = c.film_id
JOIN category y ON y.category_id = c.category_id
WHERE y.name = 'Documentary'
-- 5. All of the ‘Comedy’ films
-- (58 rows)
SELECT title
FROM film f
JOIN film_category c ON f.film_id = c.film_id
JOIN category y ON y.category_id = c.category_id
WHERE y.name = 'Comedy'

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

SELECT title
FROM film f
JOIN film_category c ON f.film_id = c.film_id
JOIN category y ON y.category_id = c.category_id
WHERE y.name = 'Children' AND f.rating = 'G'

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
SELECT title
FROM film f
JOIN film_category c ON f.film_id = c.film_id
JOIN category y ON y.category_id = c.category_id
WHERE y.name = 'Family' AND f.rating = 'G' AND f.length < 120


-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
SELECT f.title
FROM film f
JOIN film_actor fa ON f.film_id = fa.film_id
JOIN actor a ON fa.actor_id = a.actor_id
WHERE a.first_name = 'MATTHEW' AND a.last_name = 'LEIGH' AND f.rating = 'G'

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
SELECT title
FROM film f
JOIN film_category c ON f.film_id = c.film_id
JOIN category y ON y.category_id = c.category_id
WHERE y.name = 'Sci-Fi' AND f.release_year = 2006

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
SELECT title
FROM film f
JOIN film_category c ON f.film_id = c.film_id
JOIN category y ON y.category_id = c.category_id
JOIN film_actor fa ON f.film_id = fa.film_id
JOIN actor a ON fa.actor_id = a.actor_id
WHERE y.name = 'Action' AND a.first_name = 'NICK' AND a.last_name = 'STALLONE' 


-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

SELECT a.address, a.address2, a.district, y.country
FROM store s
JOIN address a ON s.address_id = a.address_id
JOIN city c ON c.city_id = a.city_id
JOIN country y ON y.country_id = c.country_id
-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

SELECT s.store_id, a.address, a.address2, CONCAT(f.first_name, ' ', f.last_name)
FROM store s
JOIN address a ON s.address_id = a.address_id
JOIN staff f ON s.manager_staff_id = f.staff_id

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

SELECT Concat(c.first_name, ' ', c.last_name) AS name, COUNT(rental.inventory_id) AS num
FROM customer c
JOIN rental ON c.customer_id = rental.customer_id
GROUP BY name
Order By num DESC
LIMIT 10

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)
SELECT Concat(first_name, ' ', last_name) AS name, SUM(p.amount) AS num
FROM customer c
JOIN payment p ON p.customer_id = c.customer_id
GROUP BY name
ORDER BY num DESC
LIMIT 10

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

SELECT s.store_id, a.address, COUNT(r.rental_id) AS rentals, SUM(p.amount) AS total_amount_of_sales, SUM(p.amount)/COUNT(r.rental_id) AS avg_sale
FROM store s
JOIN address a ON s.address_id = a.address_id
JOIN inventory i ON i.store_id = s.store_id
JOIN rental r ON r.inventory_id = i.inventory_id
JOIN payment p ON p.rental_id = r.rental_id
GROUP BY a.address, s.store_id

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

SELECT title, COUNT(payment.rental_id) AS totes_rentals
FROM payment
JOIN rental ON rental.rental_id = payment.rental_id
JOIN inventory ON inventory.inventory_id = rental.inventory_id
JOIN film ON film.film_id = inventory.film_id
GROUP BY title
ORDER BY totes_rentals DESC
LIMIT 10

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

SELECT category.name, COUNT(rental.rental_id) AS rentals 
FROM category
JOIN film_category ON film_category.category_id = category.category_id
JOIN inventory ON inventory.film_id = film_category.film_id
JOIN rental ON rental.inventory_id = inventory.inventory_id
GROUP BY category.name
ORDER BY rentals DESC
LIMIT 5


-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

SELECT title, COUNT(rental_id) AS rentals 
FROM film f
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
JOIN inventory i ON fc.film_id = i.film_id
JOIN rental r ON r.inventory_id = i.inventory_id
WHERE c.name = 'Action'
GROUP BY title
ORDER BY rentals DESC
LIMIT 5


-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)



SELECT a.actor_id, CONCAT(a.first_name, ' ', a.last_name) AS actor, COUNT(rental_id) AS rentals
FROM actor a
JOIN film_actor fa ON a.actor_id = fa.actor_id
JOIN inventory i ON fa.film_id = i.film_id
JOIN rental r ON i.inventory_id = r.inventory_id
GROUP BY a.actor_id, actor
ORDER BY rentals DESC
LIMIT 10


-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

SELECT a.actor_id, CONCAT(a.first_name, ' ', a.last_name) AS actor, COUNT(rental_id) AS rentals
FROM actor a
JOIN film_actor fa ON a.actor_id = fa.actor_id
JOIN film_category fc ON fa.film_id = fc.film_id
JOIN category c ON fc.category_id = c.category_id
JOIN inventory i ON fa.film_id = i.film_id
JOIN rental r ON i.inventory_id = r.inventory_id
GROUP BY c.name, a.actor_id, actor
HAVING c.name = 'Comedy'
ORDER BY rentals DESC
LIMIT 5

