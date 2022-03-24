DROP TABLE IF EXISTS "employee";

CREATE TABLE "employee" (
  id BIGSERIAL PRIMARY KEY NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  email VARCHAR(100),
  created    TIMESTAMP             NOT NULL DEFAULT NOW(),
  updated    TIMESTAMP             NOT NULL DEFAULT NOW()
);

INSERT INTO "employee" (first_name, last_name, email) VALUES
	('Leslie','Andrews','leslie@mail.com'),
	('Emma','Roberts','emma@mail.com'),
	('John','Doe','john@mail.com'),
	('Yuri','Petrov','yuri@yahoo.com'),
	('Enrique','Iglesias','enrique@gmail.com');