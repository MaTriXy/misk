CREATE TABLE movies(
  id bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  created_at timestamp(3) NOT NULL DEFAULT NOW(3),
  updated_at timestamp(3) NOT NULL DEFAULT NOW(3) ON UPDATE NOW(3),
  name varchar(191) NOT NULL,
  release_date date NULL,
  UNIQUE KEY `unq_name` (`name`)
);