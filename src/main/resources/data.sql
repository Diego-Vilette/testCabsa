
INSERT INTO animal(id,name,legs) VALUES (1, 'rabbit', 4);
INSERT INTO animal(id,name,legs) VALUES (2, 'bear', 4);
INSERT INTO animal(id,name,legs) VALUES (3, 'deer', 4);
INSERT INTO animal(id,name,legs) VALUES (4, 'snake', 0);
INSERT INTO animal(id,name,legs) VALUES (5, 'coocodrile', 4);
INSERT INTO animal(id,name,legs) VALUES (6, 'chicken', 2);
INSERT INTO animal(id,name,legs) VALUES (7, 'spider', 8);


INSERT INTO food(id, name) VALUES (1, 'carrot');
INSERT INTO food(id, name) VALUES (2, 'honey');
INSERT INTO food(id, name) VALUES (3, 'leafs');
INSERT INTO food(id, name) VALUES (4, 'insects');
INSERT INTO food(id, name) VALUES (5, 'vermin');
INSERT INTO food(id, name) VALUES (6, 'birdseed');

INSERT INTO animal_diet (eaten_by_id, diet_id) VALUES (1, 1);
INSERT INTO animal_diet (eaten_by_id, diet_id) VALUES (2, 2);
INSERT INTO animal_diet (eaten_by_id, diet_id) VALUES (2, 1);
INSERT INTO animal_diet (eaten_by_id, diet_id) VALUES (3, 3);
INSERT INTO animal_diet (eaten_by_id, diet_id) VALUES (4, 4);
INSERT INTO animal_diet (eaten_by_id, diet_id) VALUES (4, 5);
INSERT INTO animal_diet (eaten_by_id, diet_id) VALUES (5, 5);
INSERT INTO animal_diet (eaten_by_id, diet_id) VALUES (6, 4);
INSERT INTO animal_diet (eaten_by_id, diet_id) VALUES (6, 5);
INSERT INTO animal_diet (eaten_by_id, diet_id) VALUES (7, 4);