CREATE TABLE person(
	id bigint PRIMARY KEY AUTO_INCREMENT,
	created TIMESTAMP,
	username VARCHAR(255),
	address VARCHAR(255),
	phone VARCHAR(255),
	remark VARCHAR(255)	
)