-- Ensure the 'Pets' table exists
CREATE TABLE IF NOT EXISTS Pets
(
    id              BIGINT PRIMARY KEY,
    pet_name         VARCHAR(255)        NOT NULL,
    owner_name       VARCHAR(255)        NOT NULL,
    species         VARCHAR(32)         NOT NULL,
    address         VARCHAR(255)        NOT NULL,
    visit_date      DATE                NOT NULL
);

-- Insert sample pets
INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000001,
       'Buddy',
       'John Doe',
       'DOG',
       '123 Main St, Springfield',
       '2024-01-10'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000001);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000002,
       'Whiskers',
       'Jane Smith',
       'CAT',
       '456 Elm St, Shelbyville',
       '2023-12-01'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000002);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000003,
       'Squeaky',
       'Alice Johnson',
       'RAT',
       '789 Oak St, Capital City',
       '2022-06-20'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000003);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000004,
       'Hammy',
       'Bob Brown',
       'HAMSTER',
       '321 Pine St, Springfield',
       '2023-05-14'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000004);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000005,
       'Fluffy',
       'Emily Davis',
       'RABBIT',
       '654 Maple St, Shelbyville',
       '2024-03-01'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000005);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000006,
       'Goldie',
       'Michael Green',
       'FISH',
       '987 Cedar St, Springfield',
       '2024-02-15'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000006);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000007,
       'Tweety',
       'Sarah Taylor',
       'BIRD',
       '123 Birch St, Shelbyville',
       '2023-08-25'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000007);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000008,
       'Shelly',
       'David Wilson',
       'TURTLE',
       '456 Ash St, Capital City',
       '2022-10-10'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000008);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000009,
       'Spike',
       'Laura White',
       'DOG',
       '789 Palm St, Springfield',
       '2024-04-20'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000009);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000010,
       'Mittens',
       'James Harris',
       'CAT',
       '321 Cherry St, Shelbyville',
       '2023-06-30'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000010);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000011,
       'Nemo',
       'Emma Moore',
       'FISH',
       '654 Spruce St, Capital City',
       '2023-01-22'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000011);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000012,
       'Polly',
       'Ethan Martinez',
       'BIRD',
       '987 Redwood St, Springfield',
       '2024-05-12'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000012);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000013,
       'Speedy',
       'Sophia Clark',
       'TURTLE',
       '123 Hickory St, Shelbyville',
       '2022-11-11'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000013);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000014,
       'Thumper',
       'Daniel Lewis',
       'RABBIT',
       '456 Cypress St, Capital City',
       '2023-09-19'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000014);

INSERT INTO Pets (id, pet_name, owner_name, species, address, visit_date)
SELECT 1000000015,
       'Snowball',
       'Isabella Walker',
       'CAT',
       '789 Willow St, Springfield',
       '2024-03-29'
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000015);
