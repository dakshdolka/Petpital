-- Ensure the 'Pets' table exists
CREATE TABLE IF NOT EXISTS Pets
(
    id              BIGINT PRIMARY KEY,
    pet_name         VARCHAR(255)        NOT NULL,
    owner_name       VARCHAR(255)        NOT NULL,
    email            VARCHAR(255)        NOT NULL,
    species         VARCHAR(32)         NOT NULL,
    address         VARCHAR(255)        NOT NULL,
    registered_date DATE                NOT NULL,
    visits           INT                 NOT NULL DEFAULT 0
);

-- Insert sample pets
INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000001,
       'Buddy',
       'John Doe',
       'john.doe@example.com',
       'DOG',
       '123 Main St, Springfield',
       '2024-01-10',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000001);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000002,
       'Whiskers',
       'Jane Smith',
       'jane.smith@example.com',
       'CAT',
       '456 Elm St, Shelbyville',
       '2023-12-01',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000002);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000003,
       'Squeaky',
       'Alice Johnson',
       'alice.johnson@example.com',
       'RAT',
       '789 Oak St, Capital City',
       '2022-06-20',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000003);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000004,
       'Hammy',
       'Bob Brown',
       'bob.brown@example.com',
       'HAMSTER',
       '321 Pine St, Springfield',
       '2023-05-14',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000004);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000005,
       'Fluffy',
       'Emily Davis',
       'emily.davis@example.com',
       'RABBIT',
       '654 Maple St, Shelbyville',
       '2024-03-01',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000005);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000006,
       'Goldie',
       'Michael Green',
       'michael.green@example.com',
       'FISH',
       '987 Cedar St, Springfield',
       '2024-02-15',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000006);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000007,
       'Tweety',
       'Sarah Taylor',
       'sarah.taylor@example.com',
       'BIRD',
       '123 Birch St, Shelbyville',
       '2023-08-25',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000007);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000008,
       'Shelly',
       'David Wilson',
       'david.wilson@example.com',
       'TURTLE',
       '456 Ash St, Capital City',
       '2022-10-10',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000008);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000009,
       'Spike',
       'Laura White',
       'laura.white@example.com',
       'DOG',
       '789 Palm St, Springfield',
       '2024-04-20',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000009);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000010,
       'Mittens',
       'James Harris',
       'james.harris@example.com',
       'CAT',
       '321 Cherry St, Shelbyville',
       '2023-06-30',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000010);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000011,
       'Nemo',
       'Emma Moore',
       'emma.moore@example.com',
       'FISH',
       '654 Spruce St, Capital City',
       '2023-01-22',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000011);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000012,
       'Polly',
       'Ethan Martinez',
       'ethan.martinez@example.com',
       'BIRD',
       '987 Redwood St, Springfield',
       '2024-05-12',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000012);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000013,
       'Speedy',
       'Sophia Clark',
       'sophia.clark@example.com',
       'TURTLE',
       '123 Hickory St, Shelbyville',
       '2022-11-11',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000013);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000014,
       'Thumper',
       'Daniel Lewis',
       'daniel.lewis@example.com',
       'RABBIT',
       '456 Cypress St, Capital City',
       '2023-09-19',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000014);

INSERT INTO Pets (id, pet_name, owner_name, email, species, address, registered_date, visits)
SELECT 1000000015,
       'Snowball',
       'Isabella Walker',
       'isabella.walker@example.com',
       'CAT',
       '789 Willow St, Springfield',
       '2024-03-29',
       0
WHERE NOT EXISTS (SELECT 1 FROM Pets WHERE id = 1000000015);
